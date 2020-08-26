package array_ex1;

import java.util.Arrays;
import java.util.Scanner;

public class bj_10818 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //배열 선언 및 입력한 n값만큼 배열의 크기 설정
        int array[] = new int[n];

        //배열에 n만큼 데이터 입력
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        sc.close();

        //배열 정렬(오름차순)
        Arrays.sort(array);

        System.out.print(array[0]+" "+ array[n-1]);
    }
}
