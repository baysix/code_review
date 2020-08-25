import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_10951 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        //while문에 돌때 입력하여 str에 넣어준다
        while((str = br.readLine()) != null){

            //조건에서 입력되 str을 " "로 분리해서 리턴해준다(문자열리턴)
            st = new StringTokenizer(str, " ");

            //반환해준 리턴값을 인트형변화 하여 a와 b에 각각 넣어준다
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //sb에 a+b값과 엔터를 쌓아준다
            sb.append((a+b)).append("\n");

        }
        System.out.println(sb);
        br.close();
    }
}
