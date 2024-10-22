import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

     /* 1.Write a program that checks the role of the user
     If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" */

        // Solution :
//        System.out.println("Please enter your role : ");
//        String roll = input.nextLine();
//
//        String admin = "admin";
//        String superuser = "superuser";
//        String user = "user";
//
//        if(roll.equalsIgnoreCase(admin)) {
//            System.out.println("Welcome admin");
//        } else if (roll.equalsIgnoreCase(superuser)) {
//            System.out.println("welcome superuser");
//        } else if (roll.equalsIgnoreCase(user)) {
//            System.out.println("welcome user");
//        } else System.out.println("Please enter your roll (admin , superuser , user)");

//------------------------------------------------------------------------------------------------------
        /* 2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87 */

        // Solution
//        System.out.println("Please, enter the First number : ");
//        int num1 = input.nextInt();
//
//        System.out.println("Please, enter the Second number : ");
//        int num2 = input.nextInt();
//
//        System.out.println("Please, enter the Third number : ");
//        int num3 = input.nextInt();
//
//        System.out.println("The greatest number is :");
//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1);
//        } else if (num2 > num1 && num2 > num3){
//            System.out.println(num2);
//        } else System.out.println(num3);
//------------------------------------------------------------------------------------------------------

        /* 3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday */

        //Solution

//        Random ran = new Random();
//        int x = ran.nextInt(7) ;
//        System.out.println(x);
//        switch (x){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//        }
//------------------------------------------------------------------------------------------------------
        /*  4.Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69 F:
0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B */

        // Solution
//        System.out.println("Please enter your numeric score :");
//        int grade = input.nextInt();
//
//        if (grade == 100 && grade >= 90 ){
//            System.out.println("Your Grade is A ");
//        } else if (grade >= 80 && grade <= 89){
//            System.out.println("Your grade is B");
//        } else if (grade >= 70 && grade <= 79){
//            System.out.println("Your Grade is C");
//        } else if (grade >= 60 && grade <= 69){
//            System.out.println("Your Grade is D");
//        }else if( grade <= 59 ) {
//            System.out.println("Your Grade is F");
//        } else System.out.println("please enter a numeric score between the rang 0 to 100 ");

//------------------------------------------------------------------------------------------------------

        /* 5.Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.*/

        // Solution
//        System.out.println("please enter your age :");
//        int age = input.nextInt();
//
//        if (age >= 20){
//            System.out.println("You are an Adult");
//        } else if( age >= 13 && age <= 19) {
//            System.out.println("You are a Teenager");
//        } else System.out.println("You are a child");
        
    }
}