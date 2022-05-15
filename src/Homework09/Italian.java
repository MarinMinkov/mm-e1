package Homework09;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String language, String nationality, String EGN, String job, String country) {
        super(name, sex, religion, language, nationality, EGN, job, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao");
    }
    @Override
    public void celebrateEaster()
    {
        String tempReligion = this.religion.toLowerCase();
        if (tempReligion.equals("islam"))
        {
            System.out.println("Non celebro la Pasqua");
        }
        else
        {
            System.out.println("Sto celebrando la Pasqua\n");
        }
    }
    @Override
    public void isAdult()
    {
        if(this.age>=18)
        {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("Minore");
        }
    }
}
