package com.xidian.prototype.clone1;

/**
 * @author ljz990305
 * @create 2022-01-22 11:23
 */
//浅拷贝，引用类型复制地址值
public class TestClone implements Cloneable {

    String text;
    double salary;
    Address address;

    public TestClone(String text, double salary, Address address) {
        this.text = text;
        this.salary = salary;
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestClone{" +
                "text='" + text + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone testClone1 = new TestClone("text", 12.2, new Address(18, "ljz"));
        TestClone testClone2 = (TestClone)testClone1.clone();
        System.out.println(testClone1.text == testClone2.text);
        System.out.println(testClone1.address == testClone2.address);
        System.out.println(testClone1 == testClone2);
    }

}
class Address{
    int age;
    String name;

    public Address(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}