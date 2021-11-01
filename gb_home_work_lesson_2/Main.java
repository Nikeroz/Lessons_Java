package gb_home_work_lesson_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();

    }

    private static void task1() {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] cars = {"Audi", "BMW", "Lada", "Toyota", "Mercedes", "Renault", "Hyundai", "Honda", "Nissan", "MiniCooper", "Ferrari",
                "Audi", "Honda", "MiniCooper", "Renault", "BMW", "Ferrari", "Mercedes", "Lada"};
        for (int i = 0; i < cars.length; i++) {
            if (hm.containsKey(cars[i]))
                hm.put(cars[i], hm.get(cars[i]) + 1);
            else
                hm.put(cars[i], 1);
        }
        System.out.println(hm);

    }

  private static void task2(){
    TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
      telephoneDirectory.add("Пупкин","4-55-99");
      telephoneDirectory.add("Васькин","1-48-37");
      telephoneDirectory.add("Тапкин","7-13-53");
      telephoneDirectory.add("Вафлин","3-57-83");
      telephoneDirectory.add("Липкин","5-85-42");
      telephoneDirectory.add("Шишка","4-15-81");
      telephoneDirectory.add("Пупкин","6-33-28");
      telephoneDirectory.add("Васькин","2-10-30");
      telephoneDirectory.add("Тапкин","9-73-69");
      telephoneDirectory.add("Вафлин","8-08-73");
      telephoneDirectory.add("Липкин","3-01-90");

      System.out.println(telephoneDirectory.get("Пупкин"));
      System.out.println(telephoneDirectory.get("Васькин"));
      System.out.println(telephoneDirectory.get("Тапкин"));
      System.out.println(telephoneDirectory.get("Вафлин"));
      System.out.println(telephoneDirectory.get("Липкин"));
      System.out.println(telephoneDirectory.get("Шишка"));
    }


}

class TelephoneDirectory {
    private Map<String, List<String>> telephoneDirectory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (telephoneDirectory_hm.containsKey(surname)) {
            phone_number_list = telephoneDirectory_hm.get(surname);
            phone_number_list.add(phone_number);
            telephoneDirectory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            telephoneDirectory_hm.put(surname, phone_number_list);
        }

    }

    public List<String> get(String surname) {
        return telephoneDirectory_hm.get(surname);


    }
}




