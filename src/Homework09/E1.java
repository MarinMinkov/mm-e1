package Homework09;

import java.util.InputMismatchException;

public class E1 {

    static class Person{
        final String name, sex, religion, language, nationality, EGN, dateOfBirth;
        final int age;
        String job, country;

        String setDateOfBirth(String EGN)
        {
            return EGN.substring(4,6) + "." + EGN.substring(2,4) + "." + EGN.substring(0,2);
        }
        String setEGN (String EGN)
        {
            if (EGN.length()!=10)
            {
                throw new InputMismatchException("EGN must be 10 digits.");
            }
            else
            {
                Double.parseDouble(EGN); // Throws an exception if the string can't be parsed to a number.
                return EGN;
            }
        }
        int setAge(String EGN)
        {

            return (22+99-Integer.parseInt(EGN.substring(0,2)));
        }

        String setSex (String sex)
        {
            try
            {

                sex = sex.toLowerCase();
                if (sex == "male" || sex == "female") {
                    return sex;
                } else {
                    throw new InputMismatchException("Sex must be Male or Female");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Sex has not been set.");
                System.out.println(e);
                return null;
            }
        }

        public Person(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
            this.name = name;
            this.sex = setSex(sex);
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

        Person obj = new Person("Marin", "Male", "Christian", "Bulgarian", "Bulgarian", "9308158526", "QA", "Bulgaria");


    }
}
