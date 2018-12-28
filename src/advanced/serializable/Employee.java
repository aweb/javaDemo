package advanced.serializable;

/**
 * Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
 * <p>
 * 将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
 * <p>
 * 整个过程都是 Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。
 * <p>
 * 类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法。
 * <p>
 * ObjectOutputStream 类包含很多写方法来写各种数据类型，但是一个特别的方法例外：
 * <p>
 * public final void writeObject(Object x) throws IOException
 * 上面的方法序列化一个对象，并将它发送到输出流。相似的 ObjectInputStream 类包含如下反序列化一个对象的方法：
 * <p>
 * public final Object readObject() throws IOException,
 * ClassNotFoundException
 * 该方法从流中取出下一个对象，并将对象反序列化。它的返回值为Object，因此，你需要将它转换成合适的数据类型。
 * <p>
 * 为了演示序列化在Java中是怎样工作的，我将使用之前教程中提到的Employee类，假设我们定义了如下的Employee类，该类实现了Serializable 接口。
 * <p>
 * Employee.java 文件代码：
 * public class Employee implements java.io.Serializable
 * {
 * public String name;
 * public String address;
 * public transient int SSN;
 * public int number;
 * public void mailCheck()
 * {
 * System.out.println("Mailing a check to " + name
 * + " " + address);
 * }
 * }
 * 请注意，一个类的对象要想序列化成功，必须满足两个条件：
 * <p>
 * 该类必须实现 java.io.Serializable 对象。
 * 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 * 如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 */

public class Employee implements java.io.Serializable {
    public  String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " "+address);
    }
}
