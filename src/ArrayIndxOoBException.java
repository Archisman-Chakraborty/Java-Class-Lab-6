import java.util.Scanner;


public class ArrayIndxOoBException {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[5];

            System.out.println("Enter the elements: ");

            try {
                for(int i=0; i <= 5; i++){
                    arr[i] = sc.nextInt();
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception: ArrayIndexOutOfBoundsException");
            }
    }
}
