import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class testVector {
    @Test
    public void testGenerate(){
        Vector arr1 = new Vector();
        Vector<String>  arr2 = new Vector<>();
        Vector arr3 = new Vector(33);
        Vector arr4 = new Vector(33,2);
    }

    @Test
    public void testAddElement(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        System.out.println(arr1);  // [1, 2]
    }

    @Test
    public void testAdd(){
        Vector arr1 = new Vector();
        arr1.add(1, "b");
        System.out.println(arr1);
    }

    @Test
    public void testSetElementAt(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.setElementAt("new data", 1);
        System.out.println(arr1);  // [1, new data]
    }

    @Test
    public void testSet() {
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement(2);
        System.out.println(arr1.set(1,'c')); // 2
        System.out.println(arr1); // [1,c]
    }

    @Test
    public void testInsertElementAt(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.insertElementAt("new data", 1);
        System.out.println(arr1); // [1, new data, 2]
    }

    @Test
    public void testRemoveElement(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.removeElement("a");
        System.out.println(arr1); // [1, 2]
        arr1.removeElement(1);
        System.out.println(arr1); // [1]
        System.out.println(arr1.size()); // 1
    }

    @Test
    public void testRemoveAllElement(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.removeAllElements();
        System.out.println(arr1); // []
        System.out.println(arr1.size()); // 0
    }


    @Test
    public void testClear() {
        Vector arr1 = new Vector();
        arr1.clear();
        System.out.println(arr1);
    }

    @Test
    public void testRemoveElementAt(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.removeElementAt(1);
        System.out.println(arr1); // [1]
        System.out.println(arr1.size()); // 1
    }

    @Test
    public void testIndexOf(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        int index = arr1.indexOf("2");
        System.out.println(index); // 1
    }

    @Test
    public void testIndexOf2(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.addElement(1);
        int index = arr1.indexOf(1, 1);
        System.out.println(index); // 2
    }

    @Test
    public void testLastindexOf(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.addElement(1);
        int index = arr1.lastIndexOf(1);
        System.out.println(index); // 2
    }

    @Test
    public void testLastIndex2(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.addElement(1);
        int index = arr1.lastIndexOf(1, 1);
        System.out.println(index); // 0
    }

    @Test
    public void testFirstElement(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.addElement(1);
        Object data = arr1.firstElement();
        System.out.println(data); // 1
    }

    @Test
    public void testLastElement(){
        Vector arr1 = new Vector();
        arr1.addElement(1);
        arr1.addElement("2");
        arr1.addElement(1);
        Object data = arr1.lastElement();
        System.out.println(data); // 1
    }

    @Test
    public void testSize() {
        Vector arr2 = new Vector();
        arr2.add(33);
        arr2.add(33);
        System.out.println(arr2.size());
    }


    @Test
    public void testSetSize() {
        Vector arr2 = new Vector(10);
        arr2.setSize(5);
        arr2.add(33);
        arr2.add(44);
        System.out.println(arr2.indexOf(33));  // 5
        System.out.println(arr2.size()); // 7
    }

    @Test
    public void testGet() {
        Vector arr1 = new Vector();
        arr1.addElement("a");
        arr1.add("b");
        System.out.println(arr1.get(1));
    }


    @Test
    public void testContains() {
        Vector arr1 = new Vector();
        System.out.println(arr1.contains("a"));
    }

    @Test
    public void testGetCapacity() {
        LinkedList<String>  arr2 = new LinkedList<>();
        System.out.println(getArrayListCapacity(arr2));
        arr2.add("a");
        arr2.add("b");
        System.out.println(arr2.size());
        System.out.println(getArrayListCapacity(arr2));
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

