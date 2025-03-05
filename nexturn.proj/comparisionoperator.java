import java.util.Scanner;

public class comparisionoperator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();


        boolean condition1 = (num1 > 0); 
        boolean condition2 = (num2 > 0);
        
        System.out.println(num1 > num2);
        System.out.println((num1 >= num2));
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        






    }

}
