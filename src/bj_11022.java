import java.util.Scanner;

public class bj_11022 {
    public static void main(String args[]){

        //입력 메소드
        Scanner sc = new Scanner(System.in);

        //사용자 입력
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));

        }
    }
}
