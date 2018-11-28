package object.OverrideOverload;

public class OverrideTest {
    public static void main(String args[]) {
        Animal a = new Dog(); // Dog 对象
        a.move();//执行 Dog 类的方法
    }
}