package Lesson_5;

public class Main {

    public static void main(String[] args) {

	Employee[] employee = new Employee[5];
        employee[0] = new Employee("Alex", "Malov", "Manager", "Almal@box.com", "3-663-59",3000, 50);
        employee[1] = new Employee("Max", "Kirov", "Programmer", "Ricxam@box.com", "9-668-51",5000, 47);
        employee[2] = new Employee("Mark", "Turo", "Consultant","MrTr@box.com", "4-724-13", 2000, 20);
        employee[3] = new Employee("Semon", "Gradov", "HR-manager", "Gradik@box","2-961-35", 2500, 41);
        employee[4] = new Employee("Anastasiya", "Kozlova", "General manager", "NastyaKozlova@box.com","5-973-51",10000,23);

        for(int i = 0; i < employee.length; i++){
            if(employee[i].age > 40){
            employee[i].info();
            }

        }


    }



}
