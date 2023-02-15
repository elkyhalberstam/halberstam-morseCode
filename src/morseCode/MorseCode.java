package morseCode;

import java.util.Locale;

public class MorseCode
{
    private String message;

    public MorseCode(String message) {this.message = message.toUpperCase(Locale.ROOT);
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String toMorseCode(String message)
    {
        StringBuilder morseCode = new StringBuilder();
        for(int i=0; i<message.length();i++)
        {
            char letter = message.charAt(i);
            morseCode.append(charMorse(letter));
        }
        return String.valueOf(morseCode);
    }

    public String toMessage(String morseCode)
    {
        String[] morseMessage = morseCode.split(" ");
        StringBuilder stringMessage = new StringBuilder();
        for(int i=0; i<morseMessage.length;i++)
        {
            String letter = morseMessage[i];
            stringMessage = stringMessage.append(stringMorse(letter));
        }
        return String.valueOf(stringMessage);
    }

    private String stringMorse(String letter) {
        return switch (letter) {
            case "*-" -> "A";
            case "-***" -> "B";
            case "-*-*" -> "C";
            case "-**" -> "D";
            case "*" -> "E";
            case "**-*" -> "F";
            case "--*" -> "G";
            case "****" -> "H";
            case "**" -> "I";
            case "*---" -> "J";
            case "-*-" -> "K";
            case "*-**" -> "L";
            case "--" -> "M";
            case "-*" -> "N";
            case "---" -> "O";
            case "*--*" -> "P";
            case "--*-" -> "Q";
            case "*-*" -> "R";
            case "***" -> "S";
            case "-" -> "T";
            case "**-" -> "U";
            case "***-" -> "V";
            case "*--" -> "W";
            case "-**-" -> "X";
            case "-*--" -> "Y";
            case "--**" -> "Z";
            case "*----"-> "1";
            case "**---" -> "2";
            case "***--" -> "3";
            case "****-" -> "4";
            case "*****" -> "5";
            case "-****" -> "6";
            case "--***" -> "7";
            case "---**" -> "8";
            case "----*" -> "9";
            case "-----" -> "0";
            default -> " ";
        };
    }

    private String charMorse(char letter)
    {
        return switch (letter) {
            case 'A' -> "*- ";
            case 'B' -> "-*** ";
            case 'C' -> "-*-* ";
            case 'D' -> "-** ";
            case 'E' -> "* ";
            case 'F' -> "**-* ";
            case 'G' -> "--* ";
            case 'H' -> "**** ";
            case 'I' -> "** ";
            case 'J' -> "*--- ";
            case 'K' -> "-*- ";
            case 'L' -> "*-** ";
            case 'M' -> "-- ";
            case 'N' -> "-* ";
            case 'O' -> "--- ";
            case 'P' -> "*--* ";
            case 'Q' -> "--*- ";
            case 'R' -> "*-* ";
            case 'S' -> "*** ";
            case 'T' -> "- ";
            case 'U' -> "**- ";
            case 'V' -> "***- ";
            case 'W' -> "*-- ";
            case 'X' -> "-**- ";
            case 'Y' -> "-*-- ";
            case 'Z' -> "--** ";
            case '1' -> "*---- ";
            case '2' -> "**--- ";
            case '3' -> "***-- ";
            case '4' -> "****- ";
            case '5' -> "***** ";
            case '6' -> "-**** ";
            case '7' -> "--*** ";
            case '8' -> "---** ";
            case '9' -> "----* ";
            case '0' -> "----- ";
            default -> "\t";
        };
    }
}
