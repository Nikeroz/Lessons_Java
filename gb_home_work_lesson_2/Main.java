package gb_home_work_lesson_2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"4", "3", "2", "1"}, {"4", "2", "1", "3"}, {"3", "1", "4", "2"}};
                try {
                    try {
                        int result = amount(arr);
                        System.out.println(result);
                    } catch (MyArraySizeException e) {
                        System.out.println("Размер массива превышен!");
                    }
                }
                catch (MyArrayDataException e) {
                    System.out.println("Неправильное значение массива!");
                    System.out.println("Ошибка в ячейке: " + e.getI() + "x" + e.getJ());
                }

            }


            public static int amount(String[][] arr) throws MyArraySizeException, MyArrayDataException {
                int count = 0;
                if (arr.length != 4) {
                    throw new MyArraySizeException();
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    for (int j = 0; j < arr[i].length; j++) {
                        try {
                            count = count + Integer.parseInt(arr[i][j]);
                        }
                        catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }

                }
                return count;
            }

        }
