package Home_work_5;

public class Main {

    public static void main(String[] args) {
	Employee[] employee = new Employee[5];

	employee[0] = new Employee("Ivanov", "Ivan","Ivanovich","Manager", "iva@kolas.ru","11-111-1", 30000, 25);
	employee[1] = new Employee("Petrov", "Petr", "Petrovich", "Packer", "petrsia@kolas.ru", "2-222-22", 26000, 47);
	employee[2] = new Employee("Antonov", "Anton", "Antonovich", "Driver", "An3@kolas.ru", "33-333-3", 25000, 50);
	employee[3] = new Employee("Nikolaev", "Nikolay", "Nikolaevich", "Accountant", "Niks@kolas.ru", "44-44-444", 50000, 36);
	employee[4] = new Employee("Sergeev", "Sergey", "Sergeevich", "Director", "mega@kolas.ru", "55-55-55", 100000,45);

	for(int i = 0; i < employee.length; i++){
		if(employee[i].age > 40){
			employee[i].info();
		}
	}


    }



}
