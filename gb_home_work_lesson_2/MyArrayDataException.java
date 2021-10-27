package gb_home_work_lesson_2;

public class MyArrayDataException extends Throwable {
    private final int i;
    private final int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
