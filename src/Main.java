
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (String arg : args) {
            System.out.println(arg);
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
