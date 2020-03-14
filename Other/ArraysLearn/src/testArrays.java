import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class testArrays {

    /**
     * public static String toString(int[] a)
     * 返回数组元素的字符串形式
     */
    @Test
    public void testToString() {
        int[] data = {1, 2, 3, 4};
        String s;
        System.out.println(data); // [I@4ee285c6
        s = Arrays.toString(data);
        System.out.println(s); // [1, 2, 3, 4]
    }

    /**
     * public static String deepToString(Object[] a)
     * 返回多维数组元素的字符串形式
     */
    @Test
    public void testDeepToString() {
        Integer[][] data = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.deepToString(data)); // [[1, 2, 3], [1, 2, 3]]
    }

    /**
     * public static void fill(Object[] a, Object val)
     * 用指定元素填充整个数组 (会替换掉数组中原来的元素)
     */
    @Test
    public void testFill() {
        Integer[] data = {1, 2, 3, 4};
        Arrays.fill(data, 9);
        System.out.println(Arrays.toString(data)); // [9, 9, 9, 9]
    }

    /**
     * public static void fill(Object[] a, int fromIndex, int toIndex, Object val)
     * 用指定元素填充数组，从起始位置到结束位置，取头不取尾
     */
    @Test
    public void testFill2() {
        Integer[] data = {1, 2, 3, 4};
        Arrays.fill(data, 0, 2, 9);
        System.out.println(Arrays.toString(data)); // [9, 9, 3, 4]
    }

    /**
     * public static void sort(Object[] a)
     * 对数组元素进行排序 (串行排序)
     */
    @Test
    public void testSort() {
        String[] data = {"1", "4", "3", "2"};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data)); // [1, 2, 3, 4]
    }

    /**
     * public static <T> void sort(T[] a, Comparator<? super T> c)
     * 使用自定义比较器，对数组元素进行排序 (串行排序)
     */
    @Test
    public void testSort2() {
        String[] data = {"1", "4", "3", "2"};
// 实现降序排序，返回-1放左边，1放右边，0保持不变
        Arrays.sort(data, (str1, str2) -> {
            if (str1.compareTo(str2) > 0) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(data)); // [4, 3, 2, 1]
    }

    /**
     * public static void sort(Object[] a, int fromIndex, int toIndex)
     * 对指定范围内的数组元素进行排序 (串行排序)
     */
    @Test
    public void testSort3() {
        String[] data = {"1", "4", "3", "2"};
// 对下标[0, 3)的元素进行排序，即对1，4，3进行排序，2保持不变
        Arrays.sort(data, 0, 3);
        System.out.println(Arrays.toString(data)); // [1, 3, 4, 2]
    }

    /**
     * public static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
     * 使用自定义比较器，对指定范围内的数组元素进行排序 (串行排序)
     */
    @Test
    public void testSort4() {
        String[] data = {"1", "4", "3", "2"};
        System.out.println(Arrays.toString(data)); // [1, 4, 3, 2]
// 对下标[0, 3)的元素进行降序排序，即对1，4，3进行降序排序，2保持不变
        Arrays.sort(data, 0, 3, (str1, str2) -> {
            if (str1.compareTo(str2) > 0) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(data)); // [4, 3, 1, 2]
    }

    /**
     * public static <T extends Comparable<? super T>> void parallelSort(T[] a)
     * 对数组元素进行排序 (并行排序)，当数据规模较大时，会有更好的性能
     */
    @Test
    public void testParallelSort() {
        String[] data = {"1", "4", "3", "2"};
        Arrays.parallelSort(data);
        System.out.println(Arrays.toString(data)); // [1, 2, 3, 4]
    }

    /**
     * Arrays.binarySearch(Object[] array, Object key)
     * 使用二分法查找数组内指定元素的索引值
     * 搜索元素是数组元素，返回该元素索引值
     */
    @Test
    public void testBinarySearch() {
        Integer[] data = {1, 3, 5, 7};
        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data, 3)); // 1
    }

    /**
     * 搜索元素不是数组元素，且小于数组中的最小值
     */
    @Test
    public void testBinarySearch2() {
        Integer[] data = {1, 3, 5, 7};
        Arrays.sort(data);
// 此时程序会把数组看作 {0, 1, 3, 5, 7}，此时0的索引值为0，则搜索0时返回 -(0 + 1) = -1
        System.out.println(Arrays.binarySearch(data, 0)); // -1
    }

    /**
     * 搜索元素不是数组元素，且大于数组中的最大值
     */
    @Test
    public void testBinarySearch3() {
        Integer[] data = {1, 3, 5, 7};
        Arrays.sort(data);
// 此时程序会把数组看作 {1, 3, 5, 7， 9}，此时9的索引值为4，则搜索8时返回 -(4 + 1) = -5
        System.out.println(Arrays.binarySearch(data, 9)); // -5
    }

    /**
     * 搜索元素不是数组元素，但在数组范围内
     */
    @Test
    public void testBinarySearch4() {
        Integer[] data = {1, 3, 5, 7};
        Arrays.sort(data);
// 此时程序会把数组看作 {1, 2, 3, 5, 7}，此时2的索引值为1，则搜索2时返回 -(1 + 1) = -2
        System.out.println(Arrays.binarySearch(data, 2)); // -2
    }

    /**
     * binarySearch(Object[] array, int fromIndex, int toIndex, Object obj)
     * 使用二分法查找数组内指定范围内的指定元素的索引值
     */
    @Test
    public void testBinarySearch5() {
        Integer[] data = {1, 3, 5, 7};
        Arrays.sort(data);
// {1, 3}，3的索引值为1
        System.out.println(Arrays.binarySearch(data, 0, 2, 3)); // 1
    }

    /**
     * public static <T> T[] copyOf(T[] original, int newLength)
     * 拷贝数组，其内部调用了 System.arraycopy() 方法，从下标 0 开始，如果超过原数组长度，则会用 null 进行填充
     */
    @Test
    public void testCopyOf() {
        Integer[] data1 = {1, 2, 3, 4};
        Integer[] data2 = Arrays.copyOf(data1, 2);
        System.out.println(Arrays.toString(data2)); // [1, 2]
        Integer[] data3 = Arrays.copyOf(data1, 5);
        System.out.println(Arrays.toString(data3)); // [1, 2, 3, 4, null]
    }

    /**
     * public static <T> T[] copyOfRange(T[] original, int from, int to)
     * 拷贝数组，指定起始位置和结束位置，如果超过原数组长度，则会用 null 进行填充
     */
    @Test
    public void testCopyOfRange() {
        Integer[] data1 = {1, 2, 3, 4};
        Integer[] data2 = Arrays.copyOfRange(data1, 0, 2);
        System.out.println(Arrays.toString(data2)); // [1, 2]
        data2 = Arrays.copyOfRange(data1, 0, 5);
        System.out.println(Arrays.toString(data2)); // [1, 2, 3, 4, null]
    }

    /**
     * public static boolean equals(Object[] a, Object[] a2)
     * 判断两个数组是否相等
     */
    @Test
    public void testEquals() {
        Integer[] data1 = {1, 2, 3};
        Integer[] data2 = {1, 2, 3};
        System.out.println(Arrays.equals(data1, data2)); // true
    }

    /**
     * public static boolean deepEquals(Object[] a1, Object[] a2)
     * 判断两个多维数组是否相等
     */
    @Test
    public void testDeepEquals() {
        Integer[][] data1 = {{1,2,3}, {1,2,3}};
        Integer[][] data2 = {{1,2,3}, {1,2,3}};
        System.out.println(Arrays.deepEquals(data1, data2)); // true
    }

    /**
     * public static int hashCode(Object a[])
     * 返回数组的哈希值
     */
    @Test
    public void testHashCode() {
        Integer[] data = {1, 2, 3};
        System.out.println(Arrays.hashCode(data)); // 30817
    }

    /**
     * public static int deepHashCode(Object a[])
     * 返回多维数组的哈希值
     */
    @Test
    public void testDeepHashCode() {
        Integer[][] data = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.deepHashCode(data)); // 987105
    }

    /**
     * public static <T> void setAll(T[] array, IntFunction<? extends T> generator)
     * 让数组中的所有元素，串行地使用方法提供的生成器函数来计算每个元素 (一元操作)
     */
    @Test
    public void testSetAll() {
        Integer[] data = {1, 2, 3, 4};
        // i为索引值
        Arrays.setAll(data, i -> data[i] * 2);
        System.out.println(Arrays.toString(data)); // [2, 4, 6, 8]
    }

    /**
     * public static <T> void parallelSetAll(T[] array, IntFunction<? extends T> generator)
     * 让数组中的所有元素，并行地使用方法提供的生成器函数来计算每个元素 (一元操作)，当数据规模较大时，会有更好的性能
     */
    @Test
    public void testParallelSetAll() {
        Integer[] data = {1, 2, 3, 4};
        // i为索引值
        Arrays.parallelSetAll(data, i -> data[i] * 2);
        System.out.println(Arrays.toString(data)); // [2, 4, 6, 8]
    }

    /**
     * public static <T> void parallelPrefix(T[] array, int fromIndex, int toIndex, BinaryOperator<T> op)
     * 让指定范围内的数组元素，并行地使用方法提供的生成器函数来计算每个元素 (二元操作)，当数据规模较大时，会有更好的性能
     */
    @Test
    public void testParallelPrefix() {
        Integer[] data = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 第一个元素2不变，将其与第二个元素3一起作为参数x, y传入，得到乘积6，作为数组新的第二个元素
        // 再将6和第三个元素4一起作为参数x, y传入，得到乘积24，作为数组新的第三个元素，以此类推
        Arrays.parallelPrefix(data, 1, 9, (x, y) -> x * y);
        System.out.println(Arrays.toString(data)); // [10, 1, 2, 6, 24, 120, 720, 5040, 40320, 9]
    }

    /**
     * 返回数组的分片迭代器，用于并行地遍历数组
     */
    @Test
    public void testSpliterator() {
        class Students {

            private String name;

            private Integer age;

            public Students(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }
        }

        Students[] data = new Students[5];
        IntStream.range(0,5).forEach(i -> data[i] = new Students("小明"+i+"号", i));
        // 返回分片迭代器
        Spliterator<Students> spliterator = Arrays.spliterator(data);
        spliterator.forEachRemaining(stu -> {
            System.out.println("学生姓名: " + stu.getName() + "  " + "学生年龄: " + stu.getAge());
            // 学生姓名: 小明0号  学生年龄: 0
            // 学生姓名: 小明1号  学生年龄: 1
            // 学生姓名: 小明2号  学生年龄: 2
            // 学生姓名: 小明3号  学生年龄: 3
            // 学生姓名: 小明4号  学生年龄: 4
        });
    }

    /**
     * 返回数组的流 (Stream)，然后我们就可以使用 Stream 相关的许多方法了
     */
    @Test
    public void testStream() {
        Integer[] data = {1, 2, 3, 4};
        List<Integer> list = Arrays.stream(data).collect(toList());
        System.out.println(list); // [1, 2, 3, 4]
    }
}
