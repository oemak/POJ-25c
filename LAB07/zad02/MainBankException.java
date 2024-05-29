import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }
        Account account = createNewAccount();
        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if (!shouldWithdrawMoney) {
            endProgram();
        }
        System.out.println("How much do you want to withdraw?");
        int amount = getAmount();
        while (true) {
            try {
                account.withdraw(amount);
                System.out.printf("Thank you for using our service. Your current balance is %.2f $", account.getBalance());
                break;
            } catch (InsufficientFundsException e) {
                System.err.println(e.getMessage());
                amount = getAmount();
            }
        }
    }

    private static Account createNewAccount() {
        String name = "";
        while(true) {
            try {
                System.out.println("What is your name?");
                name = scanner.nextLine();
                validateName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        int initialAmount = 0;
        while (true) {
            try {
                System.out.println("How much do you want to put down to your account?");
                initialAmount = getAmount();
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        }
        return new Account(name, initialAmount);
    }

    private static int getAmount() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }

    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }

    public static void validateName(String name) {
        if (name.trim().isEmpty() || name == null) {
            throw new IllegalArgumentException("The name cannot be empty!");
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("The name cannot contain numbers!");
            }
        }
    }
}
