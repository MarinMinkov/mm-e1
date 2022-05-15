package Homework09;

import java.util.InputMismatchException;

    public class Person{
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

                String tempSex = sex.toLowerCase();
                if (tempSex.equals("male") || tempSex.equals("female") ) {
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

        public void sayHello()
        {
            String tempLang = language.toLowerCase();
            switch (tempLang)
            {
                case "bulgarian":
                    System.out.println("Здравей");
                    break;
                case "italian":
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Hello");
                    break;

            }
        }

        public void celebrateEaster() // could be shorter if we check for Islam and everyone "else" celebrates.
        {
            String tempReligion = religion.toLowerCase();
            if (tempReligion.equals("christian"))
            {
                System.out.println("This person celebrates Easter");
            }
            else if (tempReligion.equals("orthodox"))
            {
                System.out.println("This person celebrates Easter");
            }
            else if (tempReligion.equals("catholic"))
            {
                System.out.println("This person celebrates Easter");
            }
            else
            {
                System.out.println("This person doesn't celebrates Easter");
            }
        }

        public void isAdult()
        {
            String tempCountry = country.toLowerCase();
            switch (tempCountry)
            {
                case "usa":
                {
                    if (age>21)
                    {
                        System.out.println("Adult");
                    }
                    else
                    {
                        System.out.println("Not Adult");
                    }
                }
                break;
                default:
                {
                    if (age>18)
                    {
                        System.out.println("Adult");
                    }
                    else
                    {
                        System.out.println("Not Adult");
                    }
                }
                break;
            }
        }

        public void canTakeLoan()
        {
            String tempJob = job.toLowerCase();
            if (tempJob.equals("unemployed"))
            {
                System.out.println("Can't take loan");
            }
            else
            {
                System.out.println("Can take loan");
            }
        }




    public static void main(String[] args) {

        Person obj1 = new Person("Marin", "Male", "Christian", "Bulgarian", "Bulgarian", "9308158526", "Unemployed", "Bulgaria");
        American obj2 = new American("Marin", "Male", "Orthodox", "Bulgarian", "Bulgarian", "9308158526", "QA", "Bulgaria");
        Italian obj3 = new Italian("Marin", "Male", "Islam", "English", "USA", "9308158526", "QA", "USA");
        Bulgarian obj4 = new Bulgarian("Marin","Male","Christian","Bulgarian","Bulgarian","9652158749","QA","Bulgaria");
        Child obj5 = new Child("Marin", "Male", "Orthodox", "Bulgarian", "Bulgarian", "9308158526", "QA", "Bulgaria");
        System.out.println("Person");
        obj1.sayHello();
        obj1.celebrateEaster();
        obj1.isAdult();
        obj1.canTakeLoan();
        System.out.println();

        System.out.println("American");
        obj2.sayHello();
        obj2.celebrateEaster();
        obj2.isAdult();
        obj2.canTakeLoan();
        System.out.println();

        System.out.println("Italian");
        obj3.sayHello();
        obj3.celebrateEaster();
        obj3.isAdult();
        obj3.canTakeLoan();
        System.out.println();

        System.out.println("Bulgarian");
        obj4.sayHello();
        obj4.celebrateEaster();
        obj4.isAdult();
        obj4.canTakeLoan();
        System.out.println();

        System.out.println("Child");
        obj5.sayHello();
        obj5.celebrateEaster();
        obj5.isAdult();
        obj5.canTakeLoan();
    }
}
