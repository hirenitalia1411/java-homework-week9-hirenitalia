package trainlinesatparticularstation;

import java.util.Scanner;

public abstract class TrainLinesDatabase {

    public abstract void findTrainLines(String sName);

    public static void main(String[] args) {

        char ans;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Correct Station Name from Zone 1: ");
            String sName = sc.next();
            FindTrainLines m = new FindTrainLines();
            m.findTrainLines(sName);

            System.out.print("Would you like to find for another station: Y or N: ");
            ans = sc.next().charAt(0);
        } while (ans == 'Y');
        sc.close();
    }
}