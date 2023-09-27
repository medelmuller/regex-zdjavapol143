package pl.sda.literature;

public class Author {
    private String firstName;

    private String surName;

    private String nationality;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getNationality() {
        return nationality;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAuthorInfo() {
        return "Moja informacja o autorze: " + firstName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
