import java.util.Scanner;

public class Tester {

    public static void main(String[] args){

        System.out.println("Insert a number between 1 and 10 ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num != 111) {    //escape number


            switch (num) {

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                case 10:
                    System.out.println("Ten");
                    break;

                default:
                    System.out.println("Cannot give you the name");
                    break;

            }
            System.out.println("Insert a number between 1 and 10");
            num = in.nextInt();

        }

    }
}
