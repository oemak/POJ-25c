import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

            int result = podziel(convertToInteger(number), convertToInteger(divider));
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static int convertToInteger(String number) throws NumberFormatException {
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (!Character.isDigit(c)) {
                throw new NumberFormatException("Podano niepoprawną liczbę/y!");
            }
        }
        return Integer.parseInt(number);
    }

    private static int podziel(int n, int dzielnik) throws ArithmeticException {
        if (dzielnik == 0) {
            throw new ArithmeticException("Błąd, nie można dzielić przez zero!");
        }
        return n/dzielnik;
    }
}   

