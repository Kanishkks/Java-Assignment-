import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark;
        String g = "Grade";
        System.out.println("Enter your test score: ");
        mark = scan.nextInt();
        if (mark > 100 || mark < 0) {
            System.out.println("Please enter between 0 to 100");
        } else {
            switch (mark / 10) {
                case 10:
                case 9:
                    g = "A";
                    break;
                case 8:
                    g = "B";
                    break;
                case 7:
                    g = "C";
                    break;
                case 6:
                    g = "D";
                    break;
                case 5:
                    g = "E";
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    g = "F";
                    break;
            }

            System.out.println("Grade: " + g);
        }
    }
}