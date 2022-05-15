package Homework09;

public class Child extends Person {

    @Override
    public void isAdult()
    {
        System.out.println("Minor");
    }
    @Override
    public void canTakeLoan()
    {
        System.out.println("Can't take loan");
    }

    public Child(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
        super(name, sex, religion, language, nationality, EGN, job, country);
    }
}
