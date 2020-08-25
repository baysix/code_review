import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_10952 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while(true){

            //입력된값을 " "로 분리해서 리턴해준다(문자열리턴)
            st = new StringTokenizer(br.readLine(), " ");

            //반환해준 리턴값을 인트형변화 하여 a와 b에 각각 넣어준다
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0){
                break;//반복문을 나간다
            }

            //sb에 a+b값과 엔터를 쌓아준다
            sb.append((a+b)).append("\n");

        }
        System.out.println(sb);

        br.close();
    }
}
