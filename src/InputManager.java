import java.util.Scanner;

public class InputManager {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isAdiabatic(String string) {
        string = string.toLowerCase();
        char[] charArray = string.toCharArray();
        for (char ch : charArray) {
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public String getAlphabetic(String inputMessage, String errorMessage) {
        String input = "";

        while (true) {
            System.out.print(inputMessage);
            input = scanner.next();
            if (isAdiabatic(input)) {
                return input;
            } else {
                System.out.print(errorMessage);
            }
        }
    }

    public static boolean isInteger(String userInput) {
        try {
            Integer num = Integer.parseInt(userInput);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public Integer getIntegerInput(String inputMessage, String errorMessage) {
        while (true) {
            System.out.print(inputMessage);
            String userInput = scanner.next();
            if (isInteger(userInput)) {
                return Integer.parseInt(userInput);
            } else {
                System.out.print(errorMessage);
            }
        }
    }

    public static boolean isLong(String userInput) {
        try {
            Long num = Long.parseLong(userInput);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public Long getLongInput(String inputMessage, String errorMessage){
        while (true) {
            System.out.print(inputMessage);
            String userInput = scanner.next();
            if (isLong(userInput)) {
                return Long.parseLong(userInput);
            } else {
                System.out.print(errorMessage);
            }
        }
    }
}
