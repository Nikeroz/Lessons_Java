package Lesson_home;

import java.util.Arrays;
public class Main {
        public static void main(String[] args){
            oneMassive();
            twoMassive();
            threeMassive();
            fourMassive();
            fiveMassive(6,1);
        }

        public static void oneMassive(){
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++){
                if(arr[i] > 0){
                    arr[i] = arr[i] - 1;
                }else {
                    arr[i] = arr[i] + 1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void twoMassive(){
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++){
                arr[i] = i + 1;
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void threeMassive(){
            int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < 6){
                    arr[i] = arr[i] *= 2;
                }else{

                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void fourMassive(){
            int x = 1;
            int[][] table = new int[4][4];
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    if (i == j){
                        table[i][j] = x;
                        System.out.println(table[i][j] + " ");
                    } else {
                        System.out.println(" ");
                    }
                }
            } System.out.println();

        }

        public static void fiveMassive(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++){
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + " " + arr[i] + " ");
            }

        }

    }
