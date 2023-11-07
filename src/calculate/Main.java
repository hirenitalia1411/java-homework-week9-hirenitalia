package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char ans;
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter First Number: ");
            int firstNUmber = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = sc.nextInt();
            System.out.print("Please Enter one of Symbol +, -, *, /: ");
            char symbol = sc.next().charAt(0);
            c.calculateResult(firstNUmber, secondNumber, symbol);
            System.out.print("Would you like to do more calculation, Please enter Y or N: ");
            ans = sc.next().charAt(0);
          //  sc.close();
        } while (ans == 'Y');

        sc.close();
    }
}
