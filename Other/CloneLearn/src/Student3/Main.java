package Student3;

import org.junit.Test;

class Address {
    private String addr;

    public Address(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                '}';
    }
}

class Pepole implements Cloneable{
    private String name;
    private Address address;

    public Pepole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Pepole{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() {
        Pepole pepole = null;
        try{
            pepole = (Pepole)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pepole;
    }
}



public class Main {
    @Test
    public void testClone() {
        Address address = new Address("beijing");
        Pepole pepole = new Pepole("张三");
        pepole.setAddress(address);
        Pepole pepole1 = (Pepole) pepole.clone();
        System.out.println(pepole);  // Pepole{name='张三', address=Address{addr='beijing'}}
        System.out.println(pepole1); // Pepole{name='张三', address=Address{addr='beijing'}}
        pepole.setName("李四");
        address.setAddr("nanjing");
        System.out.println(pepole);  // Pepole{name='李四', address=Address{addr='nanjing'}}
        System.out.println(pepole1);  // Pepole{name='李四', address=Address{addr='nanjing'}}
    }
}
