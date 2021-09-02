package examples;

/**
 * use:
 * javac examples/Args.java
 * java examples.Args test 123 -version
 */
public class Args {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("you arg is: " + arg);
            if ("-version".equals(arg)) {
                System.out.println("version is set v 1.0");
                break;
            }
        }

    }
}
