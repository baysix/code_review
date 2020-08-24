import java.io.*;
import java.util.StringTokenizer;

public class bj_15552 {
    public static void main(String args[]) throws IOException {

        //백준 15552문제

        //버퍼를 이용한 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //버퍼를 이용한 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //몇번 반복할건지
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st;

        for(int i = 0; i < n ; i++){

            //입력된 문자열을  delim으로 문자열을 분리합니다. ex) 1 2 1과 2를 분리해준다
            st = new StringTokenizer(br.readLine()," ");

            // Integer.parseInt를 통해 int형으로 바꾸어 준다.
            // 인트형으로 바뀐 두 토큰을 더해서 bw.write에 넣어준다.
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }

        //입력버퍼 닫기
        br.close();

        //버퍼에 남아 있는 데이터 출력(출력을하면서 버프를 비우는 동작)
        bw.flush();

        //출력버퍼 닫기
        bw.close();


    }
}
