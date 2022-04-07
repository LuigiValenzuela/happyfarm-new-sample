public class Cat extends Animal implements Meowable {

    public void sayName() {
        System.out.println("Pinkerton");
    }

    public void makeSound() {
        meow();
    }

    public void move(){
        System.out.println("jump");

    }

    public void meow() {

    }
}
