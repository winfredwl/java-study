package com.winfred.study;

import java.util.*;

/**
 * @author winfred
 * @since 2017/3/15
 */
public class TestMapMain {

    public static void main(String[] args) {

        /**
         * HashMap：它根据键的hashCode值存储数据，大多数情况下可以直接定位到它的值，因而具有很快的访问速度，但遍历顺序却是不确定的。
         * HashMap最多只允许一条记录的键为null，允许多条记录的值为null。HashMap非线程安全，即任一时刻可以有多个线程同时写HashMap，
         * 可能会导致数据的不一致。如果需要满足线程安全，可以用 Collections的synchronizedMap方法使HashMap具有线程安全的能力，
         * 或者使用ConcurrentHashMap。
         */
        System.out.println("HashMap数据:");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("c", 2);
        hashMap.put(null, null);
        hashMap.put("b", 3);
        hashMap.put("e", 4);
        hashMap.put("p", 5);
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        /**
         * Hashtable：Hashtable是遗留类，很多映射的常用功能与HashMap类似，不同的是它承自Dictionary类，并且是线程安全的，
         * 任一时间只有一个线程能写Hashtable，并发性不如ConcurrentHashMap，因为ConcurrentHashMap引入了分段锁。Hashtable
         * 不建议在新代码中使用，不需要线程安全的场合可以用HashMap替换，需要线程安全的场合可以用ConcurrentHashMap替换。
         *
         */
        System.out.println("HashTable数据:");
        Hashtable<String, Object> hashTable = new Hashtable<>();
        hashTable.put("a", 1);
        hashTable.put("c", 2);
        hashTable.put("b", 3);
        hashTable.put("e", 4);
        hashTable.put("p", 5);
        for (Map.Entry entry : hashTable.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        /**
         * LinkedHashMap：LinkedHashMap是HashMap的一个子类，保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，
         * 先得到的记录肯定是先插入的，也可以在构造时带参数，按照访问次序排序。
         */
        System.out.println("LinkedHashMap数据:");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", 1);
        linkedHashMap.put("c", 2);
        linkedHashMap.put(null, null);
        linkedHashMap.put("b", 3);
        linkedHashMap.put("e", 4);
        linkedHashMap.put("p", 5);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        /**
         * TreeMap：TreeMap实现SortedMap接口，能够把它保存的记录根据键排序，默认是按键值的升序排序，
         * 也可以指定排序的比较器，当用Iterator遍历TreeMap时，得到的记录是排过序的。如果使用排序的映射，
         * 建议使用TreeMap。在使用TreeMap时，key必须实现Comparable接口或者在构造TreeMap传入自定义的Comparator，
         * 否则会在运行时抛出java.lang.ClassCastException类型的异常。
         */
        System.out.println("TreeMap数据:");
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.put("c", 2);
        treeMap.put("b", 3);
        treeMap.put("e", 4);
        treeMap.put("p", 5);
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println();
    }
}
