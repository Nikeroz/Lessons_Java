package geekbrains_lesson_3;

import java.util.Arrays;

public class Home_work_3 {
    public static void main(String[] args) {
        fillArray();
        changeArray();
        invertArray();
        fillDiagonal();
        variables(5,6);
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
               arr[i] = arr[i] * 2;
            }

        }
            System.out.println(Arrays.toString(arr));

        }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++){
        if(arr[i] > 0){
            arr[i] =arr[i] - 1;
        } else {
            arr[i] = arr[i] + 1;
        }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];

        arr[0][0] = 1;
        arr[1][1] = 1;
        arr[2][2] = 1;
        arr[3][3] = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
             }
            System.out.println();
        }
    }


    public static void variables(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
