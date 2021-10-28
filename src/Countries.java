import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Countries {
    private String name;

    public Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Countries> getHardOrEasyCountrysToGuess(ArrayList<Countries> countries, int input){
        ArrayList<Countries> easyCountrysToGuess = new ArrayList<Countries>();
        ArrayList<Countries> hardCountrysToGuess = new ArrayList<Countries>();

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getName().length() <= 8){
                easyCountrysToGuess.add(countries.get(i));
            } else {
                hardCountrysToGuess.add(countries.get(i));
            }
        }

        if (input == 1){
            return easyCountrysToGuess;
        } else {
            return hardCountrysToGuess;}

    }

    public static int getRandomInt(int high, int low){
        Random random = new Random();
        int randomNumber = random.nextInt(high - low) + low;
        return randomNumber;
    }

    public static ArrayList<Countries> fileOfCountriesReader(){
        File countries = new File("eropean countries/names");
        String line = " ";
        String [] countriesArray = new String[1];
        ArrayList<Countries> countriesArrayList = new ArrayList<Countries>();

        try {
            Scanner scanner = new Scanner(countries);
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                countriesArray= line.split(",");

                String name = countriesArray[0];
                Countries curentCountries = new Countries(name);
                countriesArrayList.add(curentCountries);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return countriesArrayList;
    }

    public static String getRandomCountry(int hardOrEasyMode){
        ArrayList<Countries> countries = getHardOrEasyCountrysToGuess(fileOfCountriesReader(), hardOrEasyMode);
        int randomInt = getRandomInt(countries.size(), 0);
        String randomCountry = countries.get(randomInt).getName().toLowerCase(Locale.ROOT);
        return randomCountry;
    }


    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                '}';
    }
}
