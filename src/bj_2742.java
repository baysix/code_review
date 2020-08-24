import java.io.*;

public class bj_2742 {

    public static void main(String args[]) throws IOException {

        //버퍼를 이용한 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //버퍼를 이용한 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        //입력버퍼 닫기
        br.close();

        for(int i = N; 0 < i; i--){
            bw.write(i+"\n");
        }

        //버퍼에 남아 있는 데이터 출력(출력을하면서 버프를 비우는 동작)
        bw.flush();

        //출력버퍼 닫기
        bw.close();

    }
}
