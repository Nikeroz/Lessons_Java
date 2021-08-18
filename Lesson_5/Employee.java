package Lesson_5;

public class Employee {
    public String name;
    public String surname;
    public String position;
    public String email;
    public String telephone;
    public int salary;
    public int age;


    public Employee(String name, String surname, String position, String email, String telephone,int salary, int age){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;




    }

    public void info(){
        System.out.println(name + " " + surname + " " + position + " " + email + " " + telephone + " " + salary + " " + age);
    }


}
