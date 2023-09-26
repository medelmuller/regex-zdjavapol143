package regex;
//wzorzec a*b
        /*
        kolejność liter jest ważna
        a*b --> zero lub więcej liter a i dokładnie jedno b
        a+b --> jedno lub więcej a i dokładnie jedno b
        a?b --> jedno lub zero a i dokładnie jedno b

        a*b* --> zero lub więcej liter a i zero lub więcej liter b ale w kolejności ab

        a{4,8}b --> od 4 do 8 liter a i dokładnie jedno b
        a{4,}b --> conajmniej 4 litery a i dokładnie jedno b
        a{0,9}b --> zero lub maksymalnie 9 a i dokładnie jedno b
        a(7)b --> dokładnie 7 a i dokładnie jedno b

        kwantyfikatory --> określają liczebność danych znaków

         */
/*
        .+ -> dowolny ciąg o długości conajmniej jeden
        @ -> małpka
        .+ -> dowolny ciąg o długości conajmniej jeden
        \\. -> kropka
        pl -> następujące po sobie litery p i l
         */
/*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra = [0-9]
    \\D - jakikolwiek znak, który nie jest cyfrą
    \\w - znak używany w słowach(word) = [a-zA-Z0-9_]
    \\W - jakikolwiek znak, który nie jest używany w słowach
            (zaprzeczenie tego powyżej)
    \\s - tzw białe znaki, czyli znak spacji, tabulacji itp.
            [ \t\n\r\f\x0B]
         znaki, które są niewidoczne podczas wydruku
 */
public class RegexExample {
    public static void main(String[] args) {
        //czterocyfrowa liczba
        String yearPattern = "\\d{4}";
        RegexTester tester = new RegexTester(yearPattern);
        tester.validate("1984");
        tester.validate("2023");
        tester.validate("2023123");
        tester.validate("202");
        tester.validate("2");

        RegexTester t = new RegexTester("\\d\\w\\d");

        t.validate("1_6");
        t.validate("0X4");
        t.validate("a7b");
        t.validate("0 3");
    }
}
