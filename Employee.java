package Home_work_5;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    protected int age;



    public Employee(String name, String surname, String patronymic, String post, String email, String telephone, int salary, int age){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println( name + " " + surname + " " + patronymic + " " + post + " " + email + " " + telephone + " " + salary + " " + age);
    }
}
