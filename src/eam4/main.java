package eam4;

public class main {
        public static void main(String[] args) {
            String s= null;

            try {
                System.out.println("Length of the string: " +s.length());
            } catch (NullPointerException e) {
                System.out.println("exception found");
            } finally {

                System.out.println("Finally block executed. Cleanup if necessary.");
            }
            System.out.println("Program execution continues after handling the exception.");
        }
    }


