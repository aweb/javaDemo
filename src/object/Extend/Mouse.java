package object.Extend;

/**
 * 老鼠类
 */
public class Mouse extends Animal {
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }

    public void eat() {
        super.eat();
        System.out.println("Mouse eat");
    }
}