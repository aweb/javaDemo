package examples;

/**
 * Java中有三种主要的循环结构：
 * <p>
 * while 循环
 * do…while 循环
 * for 循环
 */
public class For {
    public static void main(String[] args) {
        // while
        System.out.printf("\nwhile start \n");
        For.tWhile();
        // do……while
        System.out.printf("\ndo-while start\n");
        For.tDoWhile();
        // for
        System.out.printf("\nfor start\n");
        For.tFor();
    }

    /**
     * while
     * <p>
     * while是最基本的循环，它的结构为：
     * <p>
     * while( 布尔表达式 ) {
     * //循环内容
     * }
     * 只要布尔表达式为 true，循环就会一直执行下去。
     */
    public static void tWhile() {
        int x = 1;
        while (x < 10) {
            System.out.printf("value of x : %s \n", x);
            x++;
        }
    }

    /**
     * do…while
     * 对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
     * <p>
     * do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
     * <p>
     * do {
     * //代码语句
     * }while(布尔表达式);
     * 注意：布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。
     */
    public static void tDoWhile() {
        int x = 1;
        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 10);
    }

    /**
     * for循环
     * <p>
     * 虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。
     * <p>
     * for循环执行的次数是在执行前就确定的。语法格式如下：
     * <p>
     * for(初始化; 布尔表达式; 更新) {
     * //代码语句
     * }
     * 关于 for 循环有以下几点说明：
     * <p>
     * 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
     * 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
     * 执行一次循环后，更新循环控制变量。
     * 再次检测布尔表达式。循环执行上面的过程。
     */
    public static void tFor() {
        for (int x = 1; x < 10; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
        // 数组循环
        System.out.printf("\n增强 for 循环\n");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

        //break 关键字
        /**
         * break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
         *
         * break 跳出最里层的循环，并且继续执行该循环下面的语句。
         */
        System.out.printf("\n\nbreak 关键字\n");
        int[] numbers2 = {10, 20, 30, 40, 50};

        for (int x : numbers2) {
            // x 等于 30 时跳出循环
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }

        // continue 关键字
        /**
         * continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
         *
         * 在 for 循环中，continue 语句使程序立即跳转到更新语句。
         *
         * 在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
         */
        System.out.printf("\n\ncontinue 关键字\n");
        int[] numbers3 = {10, 20, 30, 40, 50};

        for (int x : numbers3) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }

    }

}