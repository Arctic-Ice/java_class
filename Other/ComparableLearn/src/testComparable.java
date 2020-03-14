import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testComparable {
    @Test
    public void testOrderInt() {
        int[] array = {3, 4,2,5,7,1,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5, 6, 7]
    }

    class UserBean implements Comparable<UserBean>{
        private int id;
        private String username;
        private Integer age;
        // set and get

        public UserBean(int id, String username, Integer age) {
            this.id = id;
            this.username = username;
            this.age = age;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", age=" + age +
                    '}';
        }

        /**
         * 返回正数，零，负数各代表大于，等于，小于。
         */
        @Override
        public int compareTo(UserBean o) {
            //升序
            return this.age - o.age;
            //降序
//            return o.age - this.age;
        }
    }

    @Test
    public void testUerBean() {
        UserBean[] array = new UserBean[3];
        array[0] = new UserBean(1, "张三", 18);
        array[1] = new UserBean(2, "李四", 55);
        array[2] = new UserBean(3, "麻五", 22);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
