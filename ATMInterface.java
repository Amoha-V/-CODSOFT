import java.io.*;
import java.util.Scanner;

 class ATM {
    static int c = 0;
    static int cow = 0;
    static int balance = 1000;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("balance.txt"));
            balance = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            balance = 1000;
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String p = scanner.nextLine();

        checkPw(p);

        if (c == 4) {
            choose();

            if (cow == 4) {
                System.out.println("Account balance: " + balance);
            } else if (cow == 2) {
                System.out.print("Enter your withdrawal amount: ");
                int w = scanner.nextInt();
                if (balance < w) {
                    System.out.println("Insufficient funds");
                } else {
                    balance -= w;
                    System.out.println("Your balance amount is " + balance);
                }
            }
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("balance.txt"));
                writer.write(String.valueOf(balance));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    public static void checkPw(String p) {
        c = 0;
        if (p.length() == 4) {
            for (int i = 0; i < p.length(); i++) {
                if (Character.isDigit(p.charAt(i))) {
                    c++;
                } else {
                    System.out.println("Non-numeric characters");
                    return;
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }

    public static void choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check account balance");
        System.out.println("2. Withdrawal");
        System.out.print("Enter your choice: ");
        int i = scanner.nextInt();
        if (i == 1) {
            cow = 4;
        } else if (i == 2) {
            cow = 2;
        } else {
            choose();
        }
    }
}
