import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_10817 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //배열선언
        int arr[] = new int[3];

        
        //배열에 값 입력
        for(int i =0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //배열 Arrays.sort는 배열 오름차순 해주는 함수 위에 for문안쓰고 Arrays.sort해도된다
        Arrays.sort(arr);

        //배열의 두번째 값 출력
        System.out.println(arr[1]);
    }
}
