import java.util.Scanner;

public class bj_10039 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int sub = 0;

        for(int i =0; i<5; i++){
            int num = sc.nextInt();
            if(num < 40){
                num = 40;
            }
            sub = sub + num;
        }

        System.out.println(sub/5);
    }
}
