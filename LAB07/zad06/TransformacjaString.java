package LAB07.zad06;

public class TransformacjaString {
    public static void main(String[] args) {
        System.out.println(usunZnaki("123Test", Znak.LICZBA));
        System.out.println(podmienZnaki("123Test", Znak.LICZBA, "$"));
        System.out.println(pozostawZnaki("123Test", Znak.LICZBA));
    }


    private static boolean isSamogloska(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }

    private static boolean isSpolgloska(char ch) {
        ch = Character.toLowerCase(ch);
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y';
    }

    private static String usunZnaki(String tekst, Znak znak) {
        String output = "";
        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            switch (znak) {
                case SPOLGLOSKA:
                    if (!isSpolgloska(ch)) {
                        output += ch;
                    }
                    break;
                case SAMOGLOSKA:
                    if (!isSamogloska(ch)) {
                        output += ch;
                    }
                    break;
                case SPACJA:
                    if (ch != ' ') {
                        output += ch;
                    }
                    break;
                case LICZBA:
                    if (!Character.isDigit(ch)) {
                        output += ch;
                    }
                    break;
                case ZNAK_SPECJALNY:
                    if (Character.isLetterOrDigit(ch) || ch == ' ') {
                        output += ch;
                    }
                    break;
            }
        }
        return output;
    }

    private static String podmienZnaki(String tekst, Znak znak, String podmien) {
        String output = "";
        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            switch (znak) {
                case SPOLGLOSKA:
                    if (isSpolgloska(ch)) {
                        output += podmien;
                    } else {
                        output += ch;
                    }
                    break;
                case SAMOGLOSKA:
                    if (isSamogloska(ch)) {
                        output += podmien;
                    } else {
                        output += ch;
                    }
                    break;
                case SPACJA:
                    if (ch == ' ') {
                        output += podmien;
                    } else {
                        output += ch;
                    }
                    break;
                case LICZBA:
                    if (Character.isDigit(ch)) {
                        output += podmien;
                    } else {
                        output += ch;
                    }
                    break;
                case ZNAK_SPECJALNY:
                    if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                        output += podmien;
                    } else {
                        output += ch;
                    }
                    break;
            }
        }
        return output;
    }

    private static String pozostawZnaki(String tekst, Znak znak) {
        String output = "";
        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            switch (znak) {
                case SPOLGLOSKA:
                    if (isSpolgloska(ch)) {
                        output += ch;
                    }
                    break;
                case SAMOGLOSKA:
                    if (isSamogloska(ch)) {
                        output += ch;
                    }
                    break;
                case SPACJA:
                    if (ch == ' ') {
                        output += ch;
                    }
                    break;
                case LICZBA:
                    if (Character.isDigit(ch)) {
                        output += ch;
                    }
                    break;
                case ZNAK_SPECJALNY:
                    if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                        output += ch;
                    }
                    break;
            }
        }
        return output;
    }
}
