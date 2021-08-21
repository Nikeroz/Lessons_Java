package Home_work_lesson_6;

public class Dog extends Animals {


        public Dog (String name, int age)  {
            this.name = name;
            this.age = age;
        }


        public void Run(int i ){
            if(i < 500){
                System.out.println(name + " пробежал " + i + "м");
            }else {
                System.out.println(name + " пробежать не смог");
            }
        }

        public void swim( int j){
            if(j < 10){
                System.out.println(name + " проплыл " + j + "м");
            }else {
                System.out.println(name + " Проплыть не сможет");
            }
        }




}
