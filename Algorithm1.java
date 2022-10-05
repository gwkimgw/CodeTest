import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//60172981 데이터테크놀로지 김건우
//알고리즘 hw4

public class Algorithm1{
    private static int size, target, kth;
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        size = Integer.parseInt(stringTokenizer.nextToken());
        target = Integer.parseInt(stringTokenizer.nextToken());
        kth = Integer.parseInt(stringTokenizer.nextToken());
        
        int[] arr = new int[size];

        stringTokenizer = new StringTokenizer(bReader.readLine());
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        select(arr, 0, size-1, target, 0);   
    }

	public static int select(int[] A, int p, int r, int q, int swapCnt){
        int[] partArr = partition(A, p, r, swapCnt);
        int t = partArr[0];
        swapCnt = partArr[1];
        int k = t-p+1;
        
        if(q<k){
            return select(A, p, t-1, q, swapCnt);
        }else if(q==k){
            if(swapCnt<kth) System.out.println(-1);
            return A[t];
        }else{
            return select(A, t+1, r, q-k, swapCnt);
        }
	}

    public static int[] partition(int[] A, int p, int r, int swapCnt){
        int x = A[r];
        int i = p-1;
        
        for(int j=p;j<r;j++){
            if(A[j]<=x){
                swap(A, ++i, j);
                if(++swapCnt==kth) System.out.println(A[i]+" "+A[j]);
            }
        }
        if(i+1!=r){
            swap(A, i+1, r);
            if(++swapCnt==kth) System.out.println(A[i+1]+" "+A[r]);
        }
        
        return new int[]{i+1, swapCnt};
    }

	public static void swap(int[] A, int i, int j){
        int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}