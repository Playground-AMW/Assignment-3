import java.util.Scanner;

public class Assignment {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String redStart = "\033[31m";
        String redEnd = "\033[30m";
        String boldStart = "\033[34;1m";
        String boldEnd = "\033[30;0m";
        String greenStart = "\033[32;1m";
        String greenEnd = "\033[30;0m";


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
            double marks1 = scanner.nextDouble();
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
            double marks2 = scanner.nextDouble();
            scanner.nextLine();
            if (marks2 < 0 | marks2 > 100) {
                System.out.printf("%sinvalid marks!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your subject 3: ");
            String sub3 = scanner.nextLine();
            if (!sub3.startsWith("SE-") | sub3.equals(sub2) | sub3.equals(sub1)) {
                System.out.printf("%sinvalid subject name!%s\n", redStart, redEnd);
                break myBlock;
            }

            System.out.print("Enter your marks 3 : ");
            double marks3 = scanner.nextDouble();
            scanner.nextLine();
            if (marks3 < 0 | marks3 > 100) {
                System.out.printf("%sinvalid marks!%s\n", redStart, redEnd);
                break myBlock;
            }
            double total = marks1 + marks2 + marks3;
            double average = total/3;
            String status = average >= 75 ? "\033[34;1mDP\033[30;0m" : average >= 65 ? "\033[32;1mCP\033[30;0m" : average >= 55 ? "\033[33;1mP\033[30;0m" : "\033[31;1mF\033[30;0m";
            String sub1Stat = marks1 >= 75 ? "\033[34;1mDP\033[30;0m" : marks1 >= 65 ? "\033[32;1mCP\033[30;0m" : marks1 >= 55 ? "\033[33;1mP\033[30;0m" : "\033[31;1mF\033[30;0m";
            String sub2Stat = marks2 >= 75 ? "\033[34;1mDP\033[30;0m" : marks2 >= 65 ? "\033[32;1mCP\033[30;0m" : marks2 >= 55 ? "\033[33;1mP\033[30;0m" : "\033[31;1mF\033[30;0m";
            String sub3Stat = marks3 >= 75 ? "\033[34;1mDP\033[30;0m" : marks3 >= 65 ? "\033[32;1mCP\033[30;0m" : marks3 >= 55 ? "\033[33;1mP\033[30;0m" : "\033[31;1mF\033[30;0m";

            System.out.printf("Name   : %s%s%s\n",boldStart,name.toUpperCase(),boldEnd);
            System.out.printf("Age    : %s years old\n",age);
            System.out.printf("Status : %s\n",status);
            System.out.printf("Total  : %.2f     Average  : %.2f%s",total,average,"%");
            System.out.println();
            System.out.printf("|%6s|%6s|%2s|\n","Sub", "Marks", "Status");
            System.out.printf("|SE-%03d|%6.2f|%20s|\n",Integer.valueOf(sub1.substring(3)),marks1,sub1Stat);
            System.out.printf("|SE-%03d|%6.2f|%20s|\n",Integer.valueOf(sub2.substring(3)),marks2,sub2Stat);
            System.out.printf("|SE-%03d|%6.2f|%20s|\n",Integer.valueOf(sub3.substring(3)),marks3,sub3Stat);

        }

    }
}
