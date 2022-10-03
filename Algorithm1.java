import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm1{
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        int size = Integer.parseInt(stringTokenizer.nextToken());
        int target = Integer.parseInt(stringTokenizer.nextToken());
        int Kth = Integer.parseInt(stringTokenizer.nextToken());
        long swapCnt = 0;
        
        int[] arr = new int[size];

        stringTokenizer = new StringTokenizer(bReader.readLine());
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
            
        select(arr, 0, size-1, target, Kth, swapCnt);   
    }

	public static int select(int[] A, int p, int r, int q, int Kth, Long swapCnt){
        int t = partition(A, p, r, Kth, swapCnt);
        int k = t-p+1;
        
        if(++swapCnt < Kth){    
            if(q<k){
                return select(A, p, t-1, q, Kth, swapCnt);
            }else if(q==k){
                return A[t];
            }else{
                return select(A, t+1, r, q-k, Kth, swapCnt);
            }
        }else{
            return -1;
        }
	}

	public static int partition(int[] A, int p, int r, int Kth, long swapCnt){
        int x = A[r];
        int i = p-1;
        
        for(int j=p;j<r-1;j++){
            if(A[j]<=x){
                swap(A, ++i, j);
                if(++swapCnt == Kth) System.out.println(A[i] + " " + A[j]);
            };
        }
        
        if(i+1!=r){
            swap(A, i+1, r);
            if(++swapCnt == Kth){
                System.out.println(A[i+1] + " " + A[r]);
            }else if(swapCnt < Kth){
                System.out.println(-1);
            }
        }
        
        return i+1;
    }

	public static void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}