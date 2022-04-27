package Homework09;

import java.util.InputMismatchException;

public class E1 {

    static class Person{
        final String name, sex, religion, language, nationality, EGN, dateOfBirth;
        final int age;
        String job, country;

        String setDateOfBirth(String EGN)
        {
            // TODO convert egn to Date Of Birth

            return EGN.substring(0,2);
        }
        String setEGN (String EGN)
        {
            // TODO EGN must be 10 characters (only numbers)
            if (EGN.length()!=10)
            {
                throw new InputMismatchException("EGN must be 10 digits.");
            }
            else
            {
                return EGN;
            }
        }
        int setAge(String EGN)
        {

            return (22+99-Integer.parseInt(EGN.substring(0,2)));
        }

        public Person(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
            this.name = name;
            this.sex = sex;
            this.religion = religion;
            this.language = language;
            this.nationality = nationality;
            this.EGN = setEGN(EGN);
            this.dateOfBirth = setDateOfBirth(EGN);
            this.age = setAge(EGN);
            this.job = job;
            this.country = country;
        }
    }

    public static void main(String[] args) {

        Person obj = new Person("Marin", "Male", "Christian", "Bulgarian", "Bulgarian", "9326158526", "QA", "Bulgaria");


    }
}
