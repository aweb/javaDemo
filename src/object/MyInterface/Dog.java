package object.MyInterface;

public class Dog implements MammalInt {
    public void eat(){
        System.out.println("Dog eats");
    }

    public void travel(){
        System.out.println("Dog travels");
    }

    public void play(){
        System.out.println("Dog play");
    }

    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.travel();
        dog.play();
    }
}
