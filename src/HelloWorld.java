public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "Boss Baby";
        System.out.println(myString);

        float myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//        int x = 4;
//        x  += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        System.out.println(x);
//        y -= x;
//        System.out.println(y); // the y is reused from the previous expression and the value is -3, NOT -8


        int max = Integer.MAX_VALUE; // how to find the max value of a data type
        System.out.println(max);
        System.out.println(max + 1); // going outside the limits of int

        byte x = (byte) 70000;
        System.out.println(x);
    }
}
