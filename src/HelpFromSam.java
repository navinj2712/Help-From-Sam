import java.util.Scanner;

public class HelpFromSam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int output = findHelpFromSam(number);
        System.out.println("Output : " + output);
    }

    private static int findHelpFromSam(int number) {
        int count = 0;
        if (number == 0){
            return count;
        }
        count = 1;
        int alex = 1;
        while (alex < number){
            alex = alex * 2;
        }
        count++;
        return count;
    }
}
