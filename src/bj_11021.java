import java.io.*;
import java.util.StringTokenizer;

public class bj_11021 {

    public static void main(String args[]) throws IOException {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //버퍼는 스트링 리턴으로 int형변환
        int n = Integer.parseInt(br.readLine());

        //st 변수 선언
        StringTokenizer st;

        for(int i =1; i<=n; i++){

            //입력한 문자열 " " 분리하여 반환(문자열)
            st = new StringTokenizer(br.readLine()," ");

            //출력문에
            System.out.println("Case #"+i+": "+(Integer.parseInt(st.nextToken())+(Integer.parseInt(st.nextToken()))));

        }
        //입력버퍼 닫기
        br.close();



    }
}
