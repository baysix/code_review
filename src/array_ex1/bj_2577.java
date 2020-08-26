package array_ex1;

import java.util.Scanner;

public class bj_2577 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num = A*B*C;
        int arr[] = new int[10];//0~9까지 배열선언
        
        
        while(num != 0){  //num이 0이 아닐때까지 실행
            arr[num%10]++; // num을 10으로 나눈 나머지 4321 일 경우 1이 나온다 그러므로 arr[1] = 1을 넣어주는 코드
            num/=10;//num의 10으로 나눈 몫  4321일 경우 432가 나온다 
        }
        
        //arr 배열 출력
        for(int result : arr){
            System.out.println(result);    
        }
        
    }
}
