package object.Encap;

/**
 * 封装
 * <p>
 * 在面向对象程式设计方法中，封装（英语：Encapsulation）是指一种将抽象性函式接口的实现细节部份包装、隐藏起来的方法。
 * 封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
 * 要访问该类的代码和数据，必须通过严格的接口控制。
 * 封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。
 * 适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。
 * <p>
 * 封装的优点
 * 1. 良好的封装能够减少耦合。
 * 2. 类内部的结构可以自由修改。
 * 3. 可以对成员变量进行更精确的控制。
 * 4. 隐藏信息，实现细节。
 */
public class Encap {

    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}
