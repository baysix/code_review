import java.util.Scanner;

public class bj_5543 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //햄버거와음료수의 최대 가격은 2001미만 이여야 합니다.
        int hamburger = 2001;
        int drink = 2001;

        for(int i=0; i<3; i++){
            int money = sc.nextInt();

            //햄버거의 가격은 100원이상 2000원 이하로 조건문생성
            if(100 <= money || money <= 2000){
                //위에서 선언한 햄버거 가격과 입력한 햄버거 가격을 비교하여 최솟값 구하는 공식
                if(money < hamburger){
                    hamburger = money;
                }
            }
        }

        //위와 같다
        for(int i=0; i<2; i++){
            int drinkmoney = sc.nextInt();
            if(100 <= drinkmoney || drinkmoney <= 2000){
                if(drinkmoney < drink){
                    drink = drinkmoney;
                }
            }
        }
        System.out.println(hamburger+drink-50);

    }
}
