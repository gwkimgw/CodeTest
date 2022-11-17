import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
//60172981 데이터테크놀로지 김건우
//알고리즘 HW12
//백준 1931

public class MeetingRoom{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		StringTokenizer st;
		
		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken()); 
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
        Arrays.sort(time, new Comparator<int[]>(){	
			public int compare(int[] o1, int[] o2){
				if(o1[1] == o2[1]){
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int cnt = 0;
		int end = 0;
		for(int i = 0; i < n; i++){
			if(end <= time[i][0]){
				end = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}