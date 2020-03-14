package ThreadType;

public class People extends Thread{
    private StringBuffer str;
    public People(String name, StringBuffer str) {
//        setName(name);
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            str.append(getName() + ",");
//            System.out.println(str);
//            try {
//                sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
