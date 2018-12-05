package object.Encap;

public class Test {
    public static void main(String args[]) {
        Encap encap = new Encap();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge() + " IdNum : " + encap.getIdNum());
    }
}
