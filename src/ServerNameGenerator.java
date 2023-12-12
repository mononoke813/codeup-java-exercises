public class ServerNameGenerator {

    public static String[] adjectives = {"adorable", "adventurous", "pugnacious", "diplomatic", "alert", "alive", "amused", "angry", "annoyed", "annoying"};
    public static String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "two", "family", "government"};


    public static void randomElement(){
        int randomAdjectiveIndex = (int) (Math.random() * adjectives.length);
        int randomNounsIndex = (int) (Math.random() * nouns.length);

        String myRandomAdj = adjectives[randomAdjectiveIndex];
        String myRandomNoun = nouns[randomNounsIndex];

        System.out.println(myRandomAdj + '-' + myRandomNoun);
    }

    public static void main(String[] args) {
        randomElement();

    }
}
