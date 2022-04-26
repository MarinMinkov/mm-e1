package Homework07;

public class E1 {

    static class car
    {
        String name = "N/A";
        String color = "N/A";
        int year = -1;
        int horsePower = -1;
        boolean isSecondHand = false;

        public car (String name, String color, int year, int horsePower, boolean isSecondHand)
        {
            this.name = name;
            this.color = color;
            this.year = year;
            this.horsePower = horsePower;
            this.isSecondHand = isSecondHand;
        }

        public car (String name, String color, boolean isSecondHand)
        {
            this.name = name;
            this.color = color;
            this.year = -1;
            this.horsePower = -1;
            this.isSecondHand = isSecondHand;

        }

        public car (String name, String color, int year, int horsePower)
        {
            this.name = name;
            this.color = color;
            this.year = year;
            this.horsePower = horsePower;
            this.isSecondHand = false;
        }

        public car (String name, int year, int horsePower, boolean isSecondHand)
        {
            this.name = name;
            this.color = "N/A";
            this.year = year;
            this.horsePower = horsePower;
            this.isSecondHand = isSecondHand;
        }

        public car ()
        {}






    }

    public static void main(String[] args) {

        car car1 = new car("bmw", "blue", 2006, 170, true);
        car car2 = new car("bmw", "blue", true);
        car car3 = new car("bmw", "blue",2006, 170);
        car car4 = new car("bmw",2006, 170, true);
        car car5 = new car("bmw",2006, 170, true);
        car car6 = new car();

        System.out.println(car1.name);


    }
}
