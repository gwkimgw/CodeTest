import java.io.*;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW12
//백준 14659

public class KMP{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		kmp(s1,s2);
	}

	static int[] makeTable(String s2){
		int n = s2.length();
		int[] table = new int[n];
		int idx=0;
		
		for(int i=1;i<n;i++){
			while(idx>0 && s2.charAt(i) != s2.charAt(idx)){ idx = table[idx-1]; }

			if(s2.charAt(i) == s2.charAt(idx)){
				idx += 1;
				table[i] = idx;  
			}
		}
		return table;
	}
	
	static void kmp(String s1, String s2) {
		int[] table = makeTable(s2);
		int n1 = s1.length();
		int n2 = s2.length();
		int idx = 0;

		for(int i=0; i< n1; i++){
			while(idx>0 && s1.charAt(i) != s2.charAt(idx)){ idx = table[idx-1]; }

			if(s1.charAt(i) == s2.charAt(idx)){
				if(idx == n2-1){
					System.out.println(i-idx+1 + " - " + (i+1) + "번째 입력 문자: 매치");
					idx = table[idx];
				}else{ idx ++; }
			}
		}
	}
}