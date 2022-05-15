package Homework09;

public class American extends Person {
    public American(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
        super(name, sex, religion, language, nationality, EGN, job, country);
    }
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
    @Override
    public void celebrateEaster()
    {
        String tempReligion = this.religion.toLowerCase();
        if (tempReligion.equals("islam"))
        {
            System.out.println("I don't celebrate Easter");
        }
        else
        {
            System.out.println("I celebrate Easter");
        }
    }
    @Override
    public void isAdult()
    {
        if(this.age>=21)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Minor");
        }
    }
}
