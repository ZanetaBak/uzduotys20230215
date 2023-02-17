public class Main {
    public static void main(String[] args) {

        // ==============1 uzduotis =========================
        System.out.println("==================== 1 užduotis ====================");

        // Sukurti du kintamuosius. Jiems priskirti aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis).
        // Atspausdinti trumpesnį stringą.


        String name = "Marco";
        String surname = "Mengoni";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(surname);
        System.out.println(surname.length());

        int nameLength = name.length();
        int srnLength = surname.length();

        if (nameLength < srnLength) {
            System.out.println("Shorter word is " + name);
        }

        if (nameLength > srnLength) {
            System.out.println("Shorter word is " + surname);
        }


        // ============== 2 uzduotis =========================
        System.out.println("==================== 2 užduotis ====================");

        //Sukurti du kintamuosius. Jiems priskirti aktoriaus vardą ir pavardę kaip stringus.
        // Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)

        String name2 = "Leonardo";
        String surname2 = "DiCaprio";

        System.out.println(name2.toUpperCase() + "  " + surname2.toLowerCase());

        // ============== 3 uzduotis =========================
        System.out.println("==================== 3 užduotis ====================");
        //Sukurti du kintamuosius. Jiems priskirti aktoriaus vardą ir pavardę kaip stringus.
        // Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
        // Jį atspausdinti.

        String name3 = "Benedict";
        String surname3 = "Cumberbatch";
        System.out.println(name3 + " " + surname3);
        String newstr3 = name3.substring(0, 1) + surname3.substring(0, 1);

        System.out.println(newstr3);


        // ============== 4 uzduotis =========================
        System.out.println("==================== 4 užduotis ====================");
        // Sukurti du kintamuosius. Jiems priskirti aktoriaus vardą ir pavardę kaip stringus.
        // Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir
        // pavardės kintamųjų raidžių. Jį atspausdinti.

        String name4 = "Adriano";
        String surname4 = "Celentano";
        System.out.println(name4 + " " + surname4);
        String newstr4 = name4.substring(name4.length()-3) + surname4.substring(surname4.length()-3);

        System.out.println(newstr4);


        // ============== 5 uzduotis =========================
        System.out.println("==================== 5 užduotis ====================");

        // Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias)
        // pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String txt5 = "An American in Paris";
        System.out.println(txt5);
        String txtrpl5 = txt5.replace('a', '*');
        String txtrpl51 = txtrpl5.replace('A', '*');
        System.out.println(txtrpl51);

        // ============== 6 uzduotis =========================
        System.out.println("==================== 6 užduotis ====================");
        // Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
        // Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey”
        // ir “It's a Wonderful Life”.
        // 6-1
        String txt6 = "An American in Paris";
        System.out.println(txt6);
        String txt61 = txt6.replaceAll("[AaEeIiOoUu]", "");
        System.out.println("Without vowels: " + txt61);
        // 6-2
        String txt62 = "Breakfast at Tiffany's";
        System.out.println(txt62);
        String txt621 = txt62.replaceAll("[AaEeIiOoUuYy]", "");   // ka darom su Yy
        //siuo atveju vowel
        // Y is considered to be a vowel if…
        // The word has no other vowel: gym, my.
        // The letter is at the end of a word or syllable: candy, deny, bicycle, acrylic.
        // The letter is in the middle of a syllable: system, borborygmus.

        System.out.println("Without vowels: " + txt621);

        // 6-3
        String txt63 = "2001: A Space Odyssey";
        System.out.println(txt63);
        String txt631 = txt63.replaceAll("[AaEeIiOoUuYy]", "");   // ka darom su Yy - siuo atveju abi vowel

        System.out.println("Without vowels: " + txt631);
        // 6-4
        String txt64 = "It's a Wonderful Life"; // ka darom su Ww
        System.out.println(txt64);
        String txt641 = txt64.replaceAll("[AaEeIiOoUu]", "");   // ka darom su W - siuo atveju ne vowel
        // W can be used as a vowel when it follows the letters A, E, or O in a word.
        System.out.println("Without vowels: " + txt641);

        // ============== 7 uzduotis =========================
        System.out.println("==================== 7 užduotis ====================");
        //  Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))
        //  +((int) (Math.random() * 7)+1) + " - A New Hope"
        //  Surasti ir atspausdinti epizodo numerį.

        String txt7 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10)) + ((int) (Math.random() * 7)+1) + " - A New Hope";
        // si dalis " ".repeat( (int) (Math.random() * 10))    kartoja random tarpu kieki
        System.out.println(txt7);//isskaiciavau, kad epizodas 19:)
        System.out.println("Teksto ilgis:" + txt7.length());
        System.out.println(txt7.substring(19));

        // nebaigta uzduotis



    //=====================================
        //failo pabaiga
    }
}