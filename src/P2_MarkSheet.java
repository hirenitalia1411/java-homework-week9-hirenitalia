import java.util.Scanner;

public class P2_MarkSheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name:  ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();

        // Intialize variables for subject marks
        int mathMarks, scienceMarks, englishMarks;

        // Input marks for Math
        do {
            System.out.println("Enter Math marks (0-100) : ");
            mathMarks = sc.nextInt();
        } while (mathMarks < 0 || mathMarks > 100);

        // Input marks for Science
        do {
            System.out.println("Enter Science marks (0-100): ");
            scienceMarks = sc.nextInt();
        } while (scienceMarks < 0 || scienceMarks > 100);

        // Input marks for English
        do {
            System.out.println("Enter English marks (0-100): ");
            englishMarks = sc.nextInt();
        } while (englishMarks < 0 || englishMarks > 100);

        sc.close();

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks * 100.0) / 300;

        // Determine result and grade
        String result;
        String grade;

        if (percentage >= 80) {
            grade = "A+";
            result = "Pass";
        } else if (percentage >= 60) {
            grade = "A";
            result = "Pass";
        } else if (percentage >= 50) {
            grade = "B";
            result = "Pass";
        } else if (percentage >= 35) {
            grade = "C";
            result = "Pass";
        } else {
            grade = "N/A";
            result = "Fail";
        }

        // Print the Mark Sheet
        System.out.println("_____________________________");
        System.out.println("|                           |");
        System.out.println("|       Mark Sheet          |");
        System.out.println("|___________________________|");
        System.out.println("| Name : " + name);
        System.out.println("| Roll No: " + rollNo);
        System.out.println("|___________________________|");
        System.out.println("| Subjects :  Marks         |");
        System.out.println("|___________________________|");
        System.out.println("| Math : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|___________________________|");
        System.out.println("| Total : " + totalMarks);
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|___________________________|");
    }
}
