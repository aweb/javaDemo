package object.Extend;

/**
 * java继承- 测试类
 */
public class Test {
    public static void main(String args[]) {
        // Penguin
        Penguin pen = new Penguin("企鹅", 1);
        pen.eat();
        pen.sleep();
        pen.introduction();

        // Mouse
        Mouse mou = new Mouse("老鼠", 2);
        mou.eat();
        mou.sleep();
        mou.introduction();

        // SubClass
        SubClass sc = new SubClass();
        SubClass sc2 = new SubClass(200);
    }
}
