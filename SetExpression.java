import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW-집합-22
public class SetExpression {
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        
        int[] arr = new int[m];

        stringTokenizer = new StringTokenizer(bReader.readLine());
        for(int i=0;i<m;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
    }
}