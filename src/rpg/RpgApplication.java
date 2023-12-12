package rpg;

public class RpgApplication {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Michael");
        Fighter fighter2 = new Fighter("Gabriel");

        fighter1.attack(fighter2);
    }
}
