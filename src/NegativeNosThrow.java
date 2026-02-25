import java.util.Scanner;

class NNE extends Exception{
    public NNE(String message){
        super(message);
    }
}

class Userdef{
    void ProcessInput(int num) throws NNE{
        if (num < 0)
            throw new NNE("Should be +ve");
        else
            System.out.println("Double value is: "+(num*2));
    }
}
public class NegativeNosThrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Userdef obj = new Userdef();

        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        try {
            obj.ProcessInput(x);
        }
        catch (NNE e){
            System.out.println("Exception: Negative number written!");
        }
    }
}
