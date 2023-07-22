public class ReadInput1 {
    public static void main(String[] args) {
        int currentYear = 2023;

        System.out.println(getInputFromConsole(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thank you");

        String dateOfBirth = System.console().readLine("Your year?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        System.out.println("You are " + age + " years old");
        return "";
    }
}
