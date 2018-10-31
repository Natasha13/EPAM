package com.minarchenko.taskFive.partOne.entity;

public class JournalEntry {

    private String lastName;
    private String firstName;
    private String yearOfBirth;
    private String telephoneNumber;
    private String adress;

    public JournalEntry(String lastName, String firstName, String yearOfBirth, String telephoneNumber, String adress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.adress = adress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalEntry that = (JournalEntry) o;

        if (!lastName.equals(that.lastName)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!yearOfBirth.equals(that.yearOfBirth)) return false;
        if (!telephoneNumber.equals(that.telephoneNumber)) return false;
        return adress.equals(that.adress);
    }

    @Override
    public int hashCode() {
        int result = lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + yearOfBirth.hashCode();
        result = 31 * result + telephoneNumber.hashCode();
        result = 31 * result + adress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "JournalEntry " +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", adress='" + adress + '\'';
    }
}
