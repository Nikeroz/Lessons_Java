package Home_work_6;

public class  Dog extends Animal {

    public  Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void run(int i){
        if(i > 0 && i < 500){
            System.out.println( name + " " + " смог пробежать " + " " + i + "м" );
        } else{
            System.out.println(name + " не смог пробежать");
        }
    }


    public void swim(int j) {
        if(j > 0 && j < 10){
            System.out.println(name + " " + " смог проплыть " + " " + j + "м");
        } else {
            System.out.println(name + " не смог проплыть");
        }
    }

    @Override
    public void info() {
        super.info();
    }
}
