public class Main {

    public static void main(String[] args) {
         class myclass{
            public static int add(int numOne, int numTwo) {
                int resultOne = 19 + 24;
                System.out.println(resultOne);
                return numOne + numTwo;
            }

            public static String greeting(String name) {
                String resultTwo = "Alice";
                System.out.println(resultTwo);
                return "Bonjour, " + name + "!";
            }

            public static int add(int numOne, int numTwo, int numThree, int numFour) {
                int resultOne = add( 6 , 12);
                int resultTwo = add(9, 11);

                return add(resultTwo, numFour);
            }

            public static void printMe(String toBePrinted) {
                String ToBePrinted = "hi";
                System.out.println(ToBePrinted);
            }

            public static void main(String[] args) {
                int resultOne = add(19, 24);
                System.out.println(resultOne);

                String resultTwo = greeting( "Alice");
                System.out.println(resultTwo);

                int resultThree = add(2, 4, 6, 8);
                System.out.println(resultThree);

                printMe("Hello!");
            }
        }
    }

}
