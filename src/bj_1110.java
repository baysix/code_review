import java.util.Scanner;

public class bj_1110 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int copyN = N;
        int cycle = 0;

        while(true){

            //여기서 중요한거 1의자리 구하는 방식과 or 10의자리 구하는 방식을 아는게 중요하다
            //1의자리는 num%10 숫자를 10으로 나눴을때의 나머지값
            //10의자리는 num/10 숫자를 10으로 나눴을때의 몫
            N = ((N%10)*10) + (((N/10)+(N%10))%10);

            cycle++;

            if(copyN == N ){
                break;
            }
        }
        System.out.println(cycle);
    }
}
