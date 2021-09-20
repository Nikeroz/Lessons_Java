package Home_work_lesson_2;

public class Main {

    public static void main(String[] args) {
        limit(1, 2);
        positiveandnegative(0);
        negative(-5);
        goBackTime(4,2);

    }

    public static boolean limit(int a, int b) {
        int limit = a + b;
        if (limit >= 10 && limit <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    public static void positiveandnegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное ");
        } else {
            System.out.println("Отрицательное ");
        }

    }

    public static boolean negative(int a) {
        if (a < 0) {
            System.out.println("Отрицательное");
            return true;
        } else {
            System.out.println("Положительное ");
            return false;
        }
    }

    public static void goBackTime(int back, int time){
        for (int i = 0; i < back; i++){
            for (int j = 0; j < time; j++){
                System.out.println("Time ");
            }
            System.out.println("5");

        }
    }







}



