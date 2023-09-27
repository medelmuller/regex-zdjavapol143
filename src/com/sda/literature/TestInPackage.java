package com.sda.literature;

public class TestInPackage {
    public static void main(String[] args) {
        Author author = new Author();

        // nie da się bo to pole prywatne
        // author.firstName = "Adam";

        // też się nie da bo też prywatny
        // author.getNationality():

        author.getAuthorInfo();

        Poem poem = new Poem();
        poem.stropheNumbers = 1234;
        poem.title = "Do M*";

        poem.getTitle();
    }
}
