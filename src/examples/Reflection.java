package examples;

import object.Demo.Student;

import java.lang.reflect.Field;

/**
 * Reflection demo
 */
public class Reflection {

    /**
     * main
     *
     * @param args
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        // 类型获取
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

        // 获取字段
        getField();
    }

    /**
     * 打印类信息
     *
     * @param cls
     */
    static void printClassInfo(Class cls) {
        System.out.println("################START################");
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
        System.out.println();
    }

    /**
     * 获取字段
     *
     * @throws NoSuchFieldException
     */
    static void getField() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        System.out.println("###############getField#####################");
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));

        // 获取public方法getScore，参数为String:
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        Object p = new Student("Xiao Ming", 20);
        Class c = p.getClass();
        Field f = c.getField("name");
        Object value = f.get(p);
        System.out.println();
        System.out.println("Student name is:" + value); // "Xiao Ming"
    }
}
