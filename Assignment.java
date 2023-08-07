import java.util.Scanner;

public class Assignment {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String redStart = "\033[31m";
        String redEnd = "\033[30m";

        myBlock: {
            System.out.print("Enter your name     : ");
            String name = scanner.nextLine();
            if (name.startsWith(" ") | name.length() == 0) {
                System.out.printf("%sinvalid name!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your age      : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age < 10 | age > 18) {
                System.out.printf("%sinvalid age!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your subject 1: ");
            String sub1 = scanner.nextLine();
            if (!sub1.startsWith("SE-")) {
                System.out.printf("%sinvalid subject name!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your marks 1 : ");
            int marks1 = scanner.nextInt();
            scanner.nextLine();
            if (marks1 < 0 | marks1 > 100) {
                System.out.printf("%sinvalid marks!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your subject 2: ");
            String sub2 = scanner.nextLine();
            if (!sub2.startsWith("SE-") | sub2.equals(sub1)) {
                System.out.printf("%sinvalid subject name!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your marks 2 : ");
            int marks2 = scanner.nextInt();
            scanner.nextLine();
            if (marks2 < 0 | marks2 > 100) {
                System.out.printf("%sinvalid marks!%s\n", redStart, redEnd);
                break myBlock;
            }

            // System.out.print("Enter your subject 3: ");
            // String sub3 = scanner.nextLine();

            // System.out.print("Enter your marks 3 : ");
            // int marks3 = scanner.nextInt();
            // scanner.nextLine();

            System.out.println(name);
        }
    }
}
