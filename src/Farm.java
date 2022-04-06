public class Farm{

    public static void main(String[] args){

        System.out.println("Happy Farm");

        Animal animal = new Cat();
        animal.sayName();
        animal.makeSound();
        animal.move();

        animal = new Bird();
        animal.sayName();
        animal.makeSound();
        animal.move();

        animal = new Dog();
        animal.sayName();
        animal.makeSound();
        animal.move();




    }
}
