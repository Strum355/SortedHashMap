package xyz.noahsc;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedHashMap<K extends Comparable,V> {

    private HashMap<K,V> map;
    private TreeMap<K,V> tree;

    public SortedHashMap() {
        map = new HashMap<>();
        tree = new TreeMap<>();
    }

    public static void main(String[] args) {
	    SortedHashMap<Integer, String> o = new SortedHashMap<>();
	    o.insert(5, "hi");
	    o.insert(3, "no");
	    o.insert(6, "no");
	    System.out.println(o.values());
    }

    public void insert(K key, V value) {
        map.put(key, value);
        tree.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
        tree.remove(key);
    }

    public Collection<V> values() {
        return tree.values();
    }
}
