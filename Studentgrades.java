import java.util.Scanner; 

class StudentGrades { 
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the number of students:");
        int studentCount = input.nextInt(); 

        for (int i = 1; i <= studentCount; i++) { 

            System.out.println("THE MARK DETAILS OF STUDENT " + i ); 

            System.out.println("Enter marks for Math:");
            float math = input.nextFloat(); 

            System.out.println("Enter marks for Physics:");
            float physics = input.nextFloat(); 

            System.out.println("Enter marks for Chemistry:");
            float chemistry = input.nextFloat(); 

            System.out.println("Enter marks for Computer Science:");
            float computerScience = input.nextFloat(); 

            System.out.println("Enter marks for English:");
            float english = input.nextFloat(); 

            float total = math + physics + chemistry + computerScience + english; 

            float average = total / 5; 

            System.out.println("Total Marks : " + total); 
            System.out.println("Average percentage : " + average); 

            if (average > 90) { 
                System.out.println("The Grade obtained is A+!"); 
            } else if (average > 80) { 
                System.out.println("The Grade obtained is A!"); 
            } else if (average > 70) { 
                System.out.println("The Grade obtained is B+!"); 
            } else if (average > 60) { 
                System.out.println("The Grade obtained is B!"); 
            } else if (average > 50) { 
                System.out.println("The Grade obtained is C!"); 
            } else if (average > 40) { 
                System.out.println("The Grade obtained is D!"); 
            } else { 
                System.out.println("The Grade obtained is F!"); 
            } 
        } 
    } 
}
