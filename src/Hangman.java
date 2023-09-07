import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Hangman {

    public static char[] countryStringToCharArray(int hardOrEasyMode) {

        String country = Countries.getRandomCountry(hardOrEasyMode);
        char[] charsOfCountry = new char[country.length()];

        for (int i = 0; i < country.length(); i++) {
            charsOfCountry[i] += country.charAt(i);
        }
        return charsOfCountry;
    }

    public static char[] removeCharGuessFromAlbhabeat(char guessCharacter, char[] alphabeat) {
        // char[] remainingAlphabeat = new char[alphabeat.length];

        for (int i = 0; i < alphabeat.length; i++) {
            if (alphabeat[i] == guessCharacter) {
                alphabeat[i] = '-';
            } else {

            }
        }

        return alphabeat;
    }

    public static String tjekIfCharecterIsInCountry(char inputCharacter, char[] country, String wordTo_) {
        char[] arrayOfCountry = country;
        String updatedGuessedChar = "";

        for (int i = 0; i < arrayOfCountry.length; i++) {
            if (arrayOfCountry[i] == (inputCharacter)) {
                updatedGuessedChar += inputCharacter;

            } else if (arrayOfCountry[i] == ' ') {
                updatedGuessedChar += ' ';

            } else {
                updatedGuessedChar += wordTo_.charAt(i);
            }
        }

        return updatedGuessedChar;
    }

    public static String getHiddenWord(char[] countryChars) {
        String hiddenWord = "";
        for (int i = 0; i < countryChars.length; i++) {
            if (countryChars[i] == ' ') {
                hiddenWord += ' ';
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }

    public static void getCharToIndex0Uppercase() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWrongGuess = 0;
        int remainingGuess = 6;
        DrawHangman currentHangman = new DrawHangman();
        // ArrayList<Character> alphabeat = new ArrayList<Character>();

        char[] alphabeat = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.println("\nWelcome to hangman, you can only guess wrong 6 times!");
        System.out.println("Do you want to play easy or hard mode? press 1 for easy or 2 for hard");
        int hardOrEasyMode = scanner.nextInt();

        char[] country = countryStringToCharArray(hardOrEasyMode);
        String updatedWordToGuess = getHiddenWord(country);

        System.out.println("You have to guess a european country");
        System.out.println(updatedWordToGuess);

        do {

            System.out.println("what Character do you think is in the word");

            char inputChar = scanner.next().toLowerCase(Locale.ROOT).charAt(0);

            // printer mulige karaktere, som ikke er valgt endnu
            alphabeat = removeCharGuessFromAlbhabeat(inputChar, alphabeat);
            System.out.println("option of characters:\n" + Arrays.toString(alphabeat));

            updatedWordToGuess = tjekIfCharecterIsInCountry(inputChar, country, updatedWordToGuess);

            if (!updatedWordToGuess.contains(Character.toString(inputChar))) {
                numberOfWrongGuess++;
            }

            System.out.println(updatedWordToGuess + "\nYou can guess wrong " + (remainingGuess - numberOfWrongGuess) +
                    " times until you lose");

            // sletter den gamle frame
            currentHangman.deleteFrame();

            // tegner galge + kropsdele
            currentHangman.drawHangman(remainingGuess - numberOfWrongGuess);

        } while (numberOfWrongGuess < 6 && updatedWordToGuess.contains("_"));

        if (!updatedWordToGuess.contains("_")) {
            System.out.println("you guessed the country!!");
        } else {
            System.out.println("you lose...");

            // til at få ordet fra char array til string
            String countryString = "";

            for (int i = 0; i < country.length; i++) {
                countryString += country[i];
            }
            System.out.println("the country was " + countryString);
        }
    }
}
