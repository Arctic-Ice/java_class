import org.junit.Test;

import java.util.*;

public class testLinkedHashSet {
    @Test
    public void testConstruct() {
        LinkedHashSet set = new LinkedHashSet();
        set.add('1');
        System.out.println(set.size());
    }

    @Test
    public void testOrder() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            linkedHashSet.add("I" + i);
            hashSet.add("I" + i);
        }

        System.out.println("linkedHashSet遍历：");
        for (String string : linkedHashSet){
            System.out.print(string + " ");
        }
        System.out.println();

        System.out.println("hashSet遍历：");
        for (String string : hashSet){
            System.out.print(string + " ");
        }
    }

    @Test
    public void testTraverse() {
        //测试遍历
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("a");
        linkedHashSet.add(44);
        for (Object s : linkedHashSet) {
            System.out.println(s);
        }
        System.out.println(linkedHashSet.contains(44));
    }

    @Test
    public void testHash() {
        System.out.println(Objects.hash(44));
    }
}
