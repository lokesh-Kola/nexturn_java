package Day4;

import java.util.Scanner;

public class Recursionn{
    public static int sumof(int a){
        if(a==0){
            return 0;

        }
        return (a%10)+sumof(a/10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of digits : " + sumof(n));
        
    }
}