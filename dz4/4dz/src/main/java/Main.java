import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] words = {
                "Alexina",
                "Andrey",
                "Pavel",
                "Herold",
                "Dasha",
                "Masha",
                "Sasha",
                "Anna",
                "Alexina",
                "Daisy",
                "Masha",
                "Dasha",
                "Daisy"
        };
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word: words) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Titov","89263548474");
        phoneBook.add("Ivanov","89263542872");
        phoneBook.add("Sidorov","89263548832");
        phoneBook.add("Popov","89253548872");
        phoneBook.add("Lure","89263548875");
        phoneBook.add("Titov","89263548878");
        phoneBook.add("Korjov","89263548877");
        phoneBook.add("Morozov","89263548871");

        phoneBook.info();

        System.out.println(" Номер Титова: " + phoneBook.get("Titov"));
    }

}