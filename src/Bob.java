import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String answerQuestion = "Sure";
        String chillFactor = "Whoa, chill out!";
        String sassFrass = "Fine. Be that way!";

        String userContinue = "";
        System.out.println("Start your conversation with Bob. Good luck...");

        while(true) {


            String userResponse = sc.nextLine();

            if (userResponse.endsWith("?")) {
                System.out.println(answerQuestion);
            } else if (userResponse.endsWith("!")) {
                System.out.println(chillFactor);
            } else if (userResponse.isEmpty()) {
                System.out.println(sassFrass);
            } else if (userResponse.endsWith(".")){
                System.out.println("Whatever");
            } else if (userResponse.equalsIgnoreCase("Goodbye")){
                break;
            }

        }

//





    }
}
