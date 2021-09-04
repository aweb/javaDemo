package examples;

import object.Demo.Student;

import java.util.*;
import java.io.*;
import java.util.Properties;

/**
 * Java集合
 * list HashMap
 */
public class Collection {

    public static void main(String[] args) {
        // collections
        collects();
        // deque
        deque();
        // queue
        queue();
        // hashSet
        hashSet();
        // properties
        properties();
        // hashMap
        hashMap();
        // treeMap
        treeMap();
        // call listDemo
        listDemo();
        // call arrayList
        arrayList();
        // call linkedList
        linkedList();
    }

    /**
     * 创建空集合
     * Collections提供了一系列方法来创建空集合：
     *
     * 创建空List：List<T> emptyList()
     * 创建空Map：Map<K, V> emptyMap()
     * 创建空Set：Set<T> emptySet()
     * 要注意到返回的空集合是不可变集合，无法向其中添加或删除元素。
     *
     * 此外，也可以用各个集合接口提供的of(T...)方法创建空集合。例如，以下创建空List的两个方法是等价的
     */
    static void collects()
    {
        System.out.println("##############collects");
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        list.add("banana");
        // 排序前:
        System.out.println(list);
        Collections.sort(list);
        // 排序后:
        System.out.println(list);
    }

    /**
     *我们知道，Queue是队列，只能一头进，另一头出。
     * 如果把条件放松一下，允许两头都进，两头都出，这种队列叫双端队列（Double Ended Queue），学名Deque。
     *
     * Java集合提供了接口Deque来实现一个双端队列，它的功能是：
     * 既可以添加到队尾，也可以添加到队首；
     * 既可以从队首获取，又可以从队尾获取。
     *
     * 对于添加元素到队尾的操作，Queue提供了add()/offer()方法，而Deque提供了addLast()/offerLast()方法。添加元素到对首、取队尾元素的操作在Queue中不存在，在Deque中由addFirst()/removeLast()等方法提供。
     */
    static void deque()
    {
        System.out.println("##############deque");
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A"); // A
        deque.offerLast("B"); // A <- B
        deque.offerFirst("C"); // C <- A <- B
        System.out.println(deque.pollFirst()); // C, 剩下A <- B
        System.out.println(deque.pollLast()); // B, 剩下A
        System.out.println(deque.pollFirst()); // A
        System.out.println(deque.pollFirst()); // null
    }

    /**
     * 队列（Queue）是一种经常使用的集合。Queue实际上是实现了一个先进先出（FIFO：First In First Out）的有序表。它和List的区别在于，List可以在任意位置添加和删除元素，而Queue只有两个操作：
     * 把元素添加到队列末尾；
     * 从队列头部取出元素。
     * <p>
     * 在Java的标准库中，队列接口Queue定义了以下几个方法：
     * <p>
     * int size()：获取队列长度；
     * boolean add(E)/boolean offer(E)：添加元素到队尾；
     * E remove()/E poll()：获取队首元素并从队列中删除；
     * E element()/E peek()：获取队首元素但并不从队列中删除。
     */
    static void queue() {
        System.out.println("##############Queue");
        Queue<String> q = new LinkedList<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 队首永远都是apple，因为peek()不会删除它:
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
        // 从队首取出
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // null queue is empty

        System.out.println("##############PriorityQueue");
        Queue<String> q1 = new PriorityQueue<>();
        // 添加3个元素到队列:
        q1.offer("apple");
        q1.offer("pear");
        q1.offer("banana");
        System.out.println(q1.poll()); // apple
        System.out.println(q1.poll()); // banana
        System.out.println(q1.poll()); // pear
        System.out.println(q1.poll()); // null,因为队列为空
    }

    /**
     * 我们知道，Map用于存储key-value的映射，对于充当key的对象，是不能重复的，并且，不但需要正确覆写equals()方法，还要正确覆写hashCode()方法。
     * 如果我们只需要存储不重复的key，并不需要存储映射的value，那么就可以使用Set。
     * Set用于存储不重复的元素集合，它主要提供以下几个方法：
     * 将元素添加进Set<E>：boolean add(E e)
     * 将元素从Set<E>删除：boolean remove(Object e)
     * 判断是否包含元素：boolean contains(Object e)
     */
    static void hashSet() {
        System.out.println("##############HashSet");
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false，添加失败，因为元素已存在
        System.out.println(set.contains("xyz")); // true，元素存在
        System.out.println(set.contains("XYZ")); // false，元素不存在
        System.out.println(set.remove("hello")); // false，删除失败，因为元素不存在
        System.out.println(set.size()); // 2，一共两个元素

//        Set接口并不保证有序，而SortedSet接口则保证元素是有序的：
//        HashSet是无序的，因为它实现了Set接口，并没有实现SortedSet接口；
        System.out.println("##############HashSet 无序");
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("pear");
        set2.add("orange");
        for (String s : set2) {
            System.out.println(s);
        }
//        TreeSet是有序的，因为它实现了SortedSet接口。
        System.out.println("#################TreeSet 有序");
        Set<String> set3 = new TreeSet<>();
        set3.add("apple");
        set3.add("banana");
        set3.add("pear");
        set3.add("orange");
        for (String s : set3) {
            System.out.println(s);
        }

    }

    /**
     * 配置文件的特点是，它的Key-Value一般都是String-String类型的，因此我们完全可以用Map<String, String>来表示它。
     * 因为配置文件非常常用，所以Java集合库提供了一个Properties来表示一组“配置”。由于历史遗留原因，Properties内部本质上是一个Hashtable，但我们只需要用到Properties自身关于读写配置的接口。
     */
    static void properties() {
        String f = "src/config/setting.properties";
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(f));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval", "120");
        System.out.println(filepath);
        System.out.println(interval);
    }

    /**
     * hashMap
     */
    static void hashMap() {
        System.out.println("############hashMap1############");
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("Xiao Ming", s); // 将"Xiao Ming"和Student实例映射并关联
        Student target = map.get("Xiao Ming"); // 通过key查找并返回映射的Student实例
        System.out.println(target == s); // true，同一个实例
        System.out.println(target.score); // 99
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null
        System.out.println("############hashMap2 循环############");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 123);
        map2.put("pear", 456);
        map2.put("banana", 789);
        for (String key : map2.keySet()) {
            Integer value = map2.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("############hashMap2 equals############");
        String key1 = "apple";
        String key2 = new String("apple");
        map2.get(key2); // 123

        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
    }

    /**
     * HashMap是一种以空间换时间的映射表，它的实现原理决定了内部的Key是无序的，即遍历HashMap的Key时，其顺序是不可预测的（但每个Key都会遍历一次且仅遍历一次）。
     * 还有一种Map，它在内部会对Key进行排序，这种Map就是SortedMap。注意到SortedMap是接口，它的实现类是TreeMap
     */
    static void treeMap() {
        System.out.println("############TreeMap############");
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        // apple, orange, pear
    }

    /**
     * listDemo
     */
    static void listDemo() {
        System.out.println("############listDemo############");
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.contains("C")); // true
        System.out.println(list.contains("X")); // false
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("X")); // -1
    }


    /**
     * arrayList
     */
    static void arrayList() {
        System.out.println("############arrayList############");
        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add(null); // size=2
        list.add("pear"); // size=3
        String second = list.get(1); // null
        System.out.println(list.size());
        System.out.println(second);
    }

    /**
     * linkedList
     */
    static void linkedList() {
        System.out.println("############linkedList############");
        LinkedList<String> list = new LinkedList<>();
        list.add("apple"); // size=1
        list.add(null); // size=2
        list.add("pear"); // size=3
        String second = list.get(1); // null
        System.out.println(list.size());
        System.out.println(second);
    }

}
