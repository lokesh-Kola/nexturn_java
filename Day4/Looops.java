package Day4;

import java.util.Scanner;

public class Looops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you wish");
        int num = scanner.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
