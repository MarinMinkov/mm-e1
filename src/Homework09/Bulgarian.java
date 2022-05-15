package Homework09;

public class Bulgarian extends Person {

    public Bulgarian(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
        super(name, sex, religion, language, nationality, EGN, job, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей");
    }
    @Override
    public void celebrateEaster()
    {
        String tempReligion = this.religion.toLowerCase();
        if (tempReligion.equals("islam"))
        {
            System.out.println("Не празнувам Великден");
        }
        else
        {
            System.out.println("Празнувам Великден");
        }
    }
    @Override
    public void isAdult()
    {
        if(this.age>=18)
        {
            System.out.println("Възрастен");
        }
        else
        {
            System.out.println("Дете");
        }
    }
}
