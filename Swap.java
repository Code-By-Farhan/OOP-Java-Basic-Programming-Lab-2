import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        var num1 = input.nextDouble();

        System.out.println("Enter another number: ");
        var num2 = input.nextDouble();

        System.out.println("Before swapping:\n num1 = " + num1 + " \n num2 = " + num2);

        var temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:\n num1 = " + num1 + " \n num2 = " + num2);

         input.close();
    }
}
    

