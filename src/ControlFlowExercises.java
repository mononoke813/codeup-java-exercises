import java.util.Scanner;
import java.util.TreeMap;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //WHILE LOOP
//        int i = 5;
//        while(i <= 15){
//            System.out.println("The current value of i is: " + i);
//            i++;
//        }

        // DO-WHILE LOOP
//        int i = 100;
//        do {
//            i-=5;
//            System.out.println(i);
//        }while( i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i*i;
//
//        } while(i < 1000000);

//for(int i = 5; i <= 15; i++) {
//    System.out.println(i);
//}
//        for(int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//for(int i = 100; i >= -10; i-=5) {
//    System.out.println(i);
//}
//        for(long i = 2; i < 1_000_000; i*=i){
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("#" + i + " FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("#" + i + " Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("#" + i + " Buzz");
//            } else {
//                System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);


//      -------- *** REFER TO WALKTHROUGH BELOW FOR A MORE DETAILED EXPLANATION *** --------
//        System.out.println("Enter an integer between 1 and 20");
//        int userInput = sc.nextInt();
//        int i = 1;
//
//        System.out.printf("Here is your table!%nnumber | squared | cubed%n------ | ------- | -------%n");
//
//        while(i <= userInput) {
//            int squared = i*i;
//            int cubed = i*i*i;
//            System.out.printf("%d      | %d     | %d%n", i, squared, cubed);
//            i++;
//        }
//
//
//        System.out.println("Do you want to continue? [y/N]");
//        String userResponse = sc.next();
//        boolean confirmation = userResponse.equals("y");
//
//
//        TreeMap<Integer, String> gradeMap = new TreeMap<>();
//            gradeMap.put(0, "F");
//            gradeMap.put(60, "D");
//            gradeMap.put(70, "C");
//            gradeMap.put(75, "C+");
//            gradeMap.put(80, "B");
//            gradeMap.put(85, "B+");
//            gradeMap.put(90, "A");
//            gradeMap.put(95, "A+");
//
//
//        System.out.println("Enter a numerical grade between 0 and 100:");
//
//        int numGrade = sc.nextInt();
//        sc.nextLine();
//
//        String grade = gradeMap.floorEntry(numGrade).getValue();
//        System.out.println("Your grade is: " + grade);
//
//        System.out.println("Do you want to continue? [y/N]");
//        String userYesOrNo = sc.next();
//        boolean yesOrNo = userYesOrNo.equals("y");


//        -------- WALKTHROUGH W/BONUS ----------
        //DO-WHILE
        //int start = 0;
//        do {
//            System.out.println(start);
//            start += 2;
//        } while (start <= 100);

        //DO-WHILE IN REVERSE
//        int start = 100;
//        do {
//            System.out.println(start);
//            start -= 5;
//        } while (start >= -10);

        //DO-WHILE SQUARED
//        long start = 2;
//        do {
//            System.out.println(start);
//            start = start * start;
//        } while (start < 1_000_000);

        //TABLE - continues the question and table so long user says "yes"
//        String userContinue = "";
//
//        do{
//            userContinue = "y";
//
//        System.out.println("Number table");
//
//        int userInt = sc.nextInt();
//
//        char verticalLine = '|';
//        String horizontalLine = "-";
//
//        System.out.println("number" + verticalLine + "squared" + verticalLine + "cubed");
//        System.out.println(horizontalLine.repeat(20));
//
//        for (int i = 1; i <= userInt; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%3d   " + verticalLine + "%3d   " + verticalLine + "%3d   \n", i, (squared), (cubed);
//        }
//        System.out.println("Would you like to continue?");
//        userContinue = sc.next();
//
//        } while (userContinue.equalsIgnoreCase("y"));

        //LETTER GRADE
//
//        String userContinue = "";
//
//        do {
//            System.out.println("Enter a grade");
//
//            int userGrade = sc.nextInt();
//
//            userContinue = "y";
//
//            if (userGrade >= 88 && userGrade <= 100){
//                System.out.println("A");
//            } else if (userGrade >= 80) {
//                System.out.println("B");
//            } else if (userGrade >= 67) {
//                System.out.println("C");
//            } else if (userGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Continue?");
//            userContinue = sc.next();
//
//        } while (userContinue.equalsIgnoreCase("y"));
//

    }
}
