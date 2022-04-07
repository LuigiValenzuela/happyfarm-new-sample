public class Dog extends Animal implements Barkable{

    public void sayName() {
        System.out.println("Somer");
    }

    public void makeSound() {
        barker();

    }

    public void move() {
        System.out.println("Run");
    }

    public void barker() {

    }
}
