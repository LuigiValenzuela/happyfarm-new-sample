public class Grange{


    public static void main(String[] args){

        System.out.println("Happy Grange");

        Animal animal = new Cat();
        animal.SayName();
        animal.MakeSound();
        animal.Muve();

        animal = new Bird();
        animal.SayName();
        animal.MakeSound();
        animal.Muve();

        animal = new Dog();
        animal.SayName();
        animal.MakeSound();
        animal.Muve();




    }
}
