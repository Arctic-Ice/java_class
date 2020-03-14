import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class testArrayList {
    private ArrayList arr1 = new ArrayList();
    public testArrayList() {
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");
        arr1.add("d");
        arr1.add("a");
    }

    @Test
    public void testGenerate(){
        ArrayList arr1 = new ArrayList();
        ArrayList<String>  arr2 = new ArrayList<>(5);   //初始容量为3
        ArrayList arr3 = new ArrayList(arr2);
    }

    @Test
    public void testAdd(){
        ArrayList arr1 = new ArrayList();
        arr1.add("a");
        arr1.add("b");
        System.out.println(arr1);
    }

    @Test
    public void testAdd2(){
        ArrayList<Object> arr1 = new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.add(0, "b");
        System.out.println(arr1); // [a, b, b]
        arr1.add(4, "c"); // 异常
    }

    @Test
    public void testRemove(){
        arr1.remove("a");
        System.out.println(arr1);
        arr1.remove(1);
        System.out.println(arr1);
    }

    @Test
    public void testSize() {
        ArrayList arr2 = new ArrayList(5);
        arr2.add(33);
        System.out.println(arr2.size());
    }

    @Test
    public void testSet() {
        arr1.set(1,'c');
        System.out.println(arr1);
    }

    @Test
    public void testClear() {
        arr1.clear();
        System.out.println(arr1);
    }

    @Test
    public void testGet() {
        System.out.println(arr1.get(3));
    }

    @Test
    public void testStringLength() {
        String str1 = "a";
        char c1 = 'a';
        char b1 = 66;
        System.out.println(str1.length());
//        System.out.println(c1.field());
    }

    @Test
    public void testIndexOf() {
        arr1.add('d');
        System.out.println(arr1);     //  [a, b, c, d, a, d]
        System.out.println(arr1.indexOf("d"));   // 3
        System.out.println(arr1.indexOf('d')); //  5
    }

    @Test
    public void testContains() {
        System.out.println(arr1.contains("a"));
    }

    @Test
    public void testGetClass() {
        System.out.println(arr1.getClass());
    }

    @Test
    public void testClone() {
        System.out.println(arr1.clone());
    }

    @Test
    public void testGetCapacity() {
        ArrayList<String>  arr2 = new ArrayList<>(4);
        System.out.println(getArrayListCapacity(arr2));
        arr2.add("a");
        arr2.add("b");
        arr2.add("b");
        arr2.add("b");
        arr2.add("b");
        System.out.println(arr2.size());
        System.out.println(getArrayListCapacity(arr2));
    }


    public static int getArrayListCapacity(ArrayList<?> arrayList) {
        Class<ArrayList> arrayListClass = ArrayList.class;
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
