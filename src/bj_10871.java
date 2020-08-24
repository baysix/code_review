import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj_10871 {

    public static void main(String[] args) throws IOException {

        //버퍼 입력 생성자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //스트링토큰 선언 입력값을 " "로 나눠서 반환, ex) 1 2 => 1,2로 반환해준다 (문자열)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //st.nextToken()을 첫번째 사용하면 위에서 나눠서 반환한 값의 1을 가져온다(문자열이므로 int형으로 형변환)
        int N = Integer.parseInt(st.nextToken());

        //st.nextToken()을 두번째로 사용하면 위에서 나눠서 반환한 값의 2를 가져온다
        int X = Integer.parseInt(st.nextToken());

        //StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // StringTokenizer을 한번더 선언해서 위에서 생성한 값을 초기화 및 다시 셋팅해준다
        // ex)1 3 5 6 7
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            //위에서 다시 반환받은 st값을 받아온다 st.nextToken이 for문을 돌면서 st값을 차례대로 가져온다
            int value = Integer.parseInt(st.nextToken());

            if (value < X) {
                // sb에 사용하여 값을 반환해서 sb에 넣어준다
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
    }
}