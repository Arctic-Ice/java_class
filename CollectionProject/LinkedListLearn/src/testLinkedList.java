import org.junit.Test;

import java.lang.reflect.Field;
import java.util.LinkedList;


public class testLinkedList{
    private LinkedList arr1 = new LinkedList();
    public testLinkedList() {
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");
        arr1.add("d");
        arr1.add("e");
    }

    @Test
    public void testGenerate(){
        LinkedList<String>  arr2 = new LinkedList<>();
        arr2.add("aa");
//            arr2.add(33);
        System.out.println(arr2);
    }

    @Test
    public void testAdd(){
        arr1.add(1, "b");
        System.out.println(arr1);
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
        LinkedList arr2 = new LinkedList();
        arr2.add(33);
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
        System.out.println(arr1.indexOf("d"));
        System.out.println(arr1.indexOf('d'));
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
    public void testGetCapacity() {
        LinkedList<String>  arr2 = new LinkedList<>();
        System.out.println(getArrayListCapacity(arr2));
    }

    @Test
    public void testPop() {
        System.out.println(arr1.pop());
        System.out.println(arr1.pop());
        System.out.println(arr1);
    }

    @Test
    public void testPush() {
        arr1.push("b");
//        System.out.println(arr1.pop());
        System.out.println(arr1);
    }

    @Test
    public void testAddFirst() {
        arr1.addFirst("a");
        System.out.println(arr1);
    }

    @Test
    public void testAddLast() {
        arr1.addLast("a");
        System.out.println(arr1);
    }

    @Test
    public void testGetFirst() {
        Object data;
        data = arr1.getFirst();
        System.out.println(data);
        data = arr1.getFirst();
        System.out.println(data);
    }

    @Test
    public void testGetLast() {
        Object data;
        data = arr1.getLast();
        System.out.println(data);
        data = arr1.getLast();
        System.out.println(data);
        LinkedList arr3 = new LinkedList();
        data = arr3.getLast();
    }

    @Test
    public void testRemoveFirst() {
        arr1.removeFirst();
        System.out.println(arr1);
    }

    @Test
    public void testRemoveLast() {
        arr1.remove();
        arr1.removeLast();
        System.out.println(arr1);
    }

    @Test
    public void testPeekFirst() {
        System.out.println(arr1.peekFirst());
        LinkedList arr2 = new LinkedList();
        System.out.println(arr2.peekFirst());
    }

    public static int getArrayListCapacity(LinkedList<?> arrayList) {
        Class<LinkedList> arrayListClass = LinkedList.class;
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

