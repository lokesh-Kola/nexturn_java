package Day4;
import java.util.Scanner;

public class Securepin {
    public static void main(String[] args) {
        int correctpasscode = 1234;
        int  maxattempts = 3;
        int i=0;
        Scanner scanner = new Scanner (System.in);

        while (i <= maxattempts) {

            System.out.println("Enter the pin : ");
            int inputpin = scanner.nextInt();

            if( inputpin == correctpasscode ) {
                    System.out.println("Acess permited");
                    scanner.close();
                 } 
            else{
                i++;
                System.out.println("incorrect PIN and attemtps left : " + (maxattempts-i+1));
      }

        }

        System.out.println("account Locked");
        scanner.close();
}
}