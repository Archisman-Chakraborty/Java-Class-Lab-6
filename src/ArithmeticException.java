import java.util.Scanner;


public class ArithmeticException {
    public static void main(String[] args){
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for dividing it by ZERO: ");
        int y = sc.nextInt();

        try {
            int result = y/x;
            System.out.println("Result is: "+result);
        }
        catch (Exception e){
            System.out.println("Exception: Arithmetic Exception");
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }
    }
}
