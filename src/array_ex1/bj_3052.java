package array_ex1;

import java.util.HashSet;
import java.util.Scanner;

public class bj_3052 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //HashSet 원소에 이미 저장되어있어 중복일 경우 저장이 되지 않고 HashSet 에 없으면 저장한다.
       HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++){
            //h.add()는 HashSet에 저장하는 메소드
            h.add(sc.nextInt() %42);
        }

        sc.close();
        
        //h.size hashSet의 길이
        System.out.print(h.size());
    }
}
