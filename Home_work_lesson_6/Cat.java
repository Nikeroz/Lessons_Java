package Home_work_lesson_6;

public class Cat extends Animals{

    public Cat (String name, int age)  {
        this.name = name;
        this.age = age;
    }

    public void run(int i ){
        if(i < 200){
            System.out.println(name + "  пробежал " + i + "м");
        }else {
            System.out.println(name + " пробежать не смог");
        }
    }

    public void swim( int j){
        if(j < 0){
            System.out.println(name + " проплыл " + j + "м");
        }else {
            System.out.println(name + " Проплыть не сможет");
        }
    }


}
