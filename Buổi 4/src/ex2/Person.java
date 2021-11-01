package ex2;

import java.util.Arrays;

/*
* 1. Object - Object    : 1 - 1
* 2. Object - Object[]  : 1 - n
*
*
*
* */

public class Person {
    private String name;
    private int age;
    private Address[] address; //HAS-A

    public Person() {
    }

    public Person(String name, int age, Address[] address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + Arrays.toString(address) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address[] getAddresses() {
        return address;
    }

    public void setAddresses(Address[] addresses) {
        this.address = addresses;
    }


//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
