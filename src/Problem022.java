public class Problem022 {
    /*
    ZADANIE 22.
Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (pl.wikipedia.org/wiki/Szyfr_Cezara)
Tekst jawny: MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG, przesuniecie = 2
Tekst zaszyfrowany: OGBPA DCFB, EJTQP RWNM VYQL K UBGUE HNCI
Character.isUpperCase(currentCharacter)
(Bez polskich znaków)
     */

    public static void main(String[] args) {
        String text = "MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG";
        int k = 2;

        System.out.println(encrypt(text, k));

    }

    private static String encrypt(String text, int key){
        //text = text.toUpperCase(); --> żeby program działa też na małych literach
        // bo w shiftedCharacter jest zakres do dużych liter ASCI
        String encrypted = ""; //ew. StringBuilder

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

//            if (Character.isLowerCase(currentChar) || Character.isUpperCase(currentChar))
            //ale nie trzeba tak bo

            if (Character.isAlphabetic(currentChar)) {
                int charShifted = shiftCharacter(currentChar, key);
                encrypted += (char) charShifted;
            } else {
                encrypted += currentChar;
            }
            //od kodu na dole się zaczęło
/*
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int charShifted = currentChar + key;
            if (charShifted > 90) {
                charShifted -= 26;
            }
            encrypted += (char) charShifted;

 */
        }
        return encrypted;
    }

    private static int shiftCharacter(char character, int key) {
        /*
        int charShifted = character + key;
        if (charShifted > 90) {
            charShifted -= 26;
        }
        return charShifted;
        poniżej wersja z modulo
         */
// chuj wie czemu nie działa
        int characterIndex = character - 65;
        // int characterIndex = character - 'A';
        int charShifted = (characterIndex + key) % 26 + 65;
        return charShifted;

    }
}
