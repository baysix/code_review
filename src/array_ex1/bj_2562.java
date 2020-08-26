package array_ex1;

import java.util.Scanner;

public class bj_2562 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int max = 0;
        int count = 0;
        int index = 0;

        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        //배열 for 돌리는 방법
        for(int value : arr){
            count++;

            //value는 일반적이 for문의 arr[i]와 같다

            //value값이 max보다 크면 if문 작동
            if(value > max) {
                max = value;
                index = count;
            }

        }

        System.out.println(max);
        System.out.println(index);
    }
}
