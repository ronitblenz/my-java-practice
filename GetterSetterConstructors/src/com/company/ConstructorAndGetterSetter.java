package com.company;
class Employee{
    private int id;
    private String name;

    public Employee(){
        id=0;
        name ="your-name-please";
    }
    public Employee(int myId,String myName){
        id=myId;
        name =myName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ConstructorAndGetterSetter {
    public static void main(String[] args) {
        Employee raj = new Employee(69, "Yo guyzz");
        System.out.println(raj.getId());
        System.out.println(raj.getName());
    }
}