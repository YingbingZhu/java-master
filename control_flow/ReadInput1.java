import java.util.Scanner;

public class ReadInput1 {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
        
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thank you");

        String dateOfBirth = System.console().readLine("Your year?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        // read input from console or terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thank you");

        System.out.println("Youe year? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, sc.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "You are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
