import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class testHashSet {
    @Test
    public void testCreate(){
        HashSet hs = new HashSet();
        System.out.println(hs.size());
    }

    @Test
    public void testCreate2(){
        HashSet hs = new HashSet(5);
        System.out.println(hs.size());
    }

    @Test
    public void testCreate3(){
        HashSet hs = new HashSet(5, 1);
        hs.add(3);
        hs.add("4");
        System.out.println(hs.add(3));
        System.out.println(hs);
        System.out.println(hs.size());
    }

    @Test
    public void testCreate4(){
        HashSet<String> hs = new HashSet(5, 1);
        hs.add("a");
//        hs.add(4);
        System.out.println(hs.size());
    }

    @Test
    public void testAdd(){
        HashSet hs = new HashSet();
        int [] abc = {1,2,3};
        hs.add(abc);
        hs.isEmpty();
        System.out.println(hs);
        System.out.println(hs.size());
    }

    @Test
    public void testClear(){
        HashSet hs = new HashSet();
        int [] abc = {1,2,3};
        hs.add(abc);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs);
    }

    @Test
    public void testRemove(){
        HashSet hs = new HashSet();
        int [] abc = {1,2,3};
        int [] abc2 = {1,2,3};
        if (abc.equals(abc2)) {
            System.out.println("abc==abc2");
        }
        hs.add(abc);
        hs.remove(abc);
        System.out.println(hs.size());
        System.out.println(hs);
    }

    @Test
    public void testGetCapacity() {
        HashSet<String> arr2 = new HashSet<>(4);
        System.out.println(getArrayListCapacity(arr2));
        arr2.add("a");
        arr2.add("b");
        arr2.add("b");
        arr2.add("b");
        arr2.add("b");
        System.out.println(arr2.size());
        System.out.println(getArrayListCapacity(arr2));
    }


    public static int getArrayListCapacity(HashSet<?> arrayList) {
        Class<HashSet> arrayListClass = HashSet.class;
        try {
            Field field = arrayListClass.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = (Object[])field.get(arrayList);
            return objects.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
