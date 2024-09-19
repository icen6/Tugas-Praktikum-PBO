package prak02;

public class Person {
    private String name; 
    private int age; 
    private String address; 

    public Person(String name, int age, String address) {
        this.name = name; 
        this.age = age; 
        this.address = address; 
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.err.println("Address: " + this.address);
    }
    
    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name; 
    }

    public void setAge(int age) {
        this.age = age; 
    }

    public int getAge() {
        return this.age; 
    }
}
