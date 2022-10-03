import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm1{
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int o = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        long swapCnt = 0;
        
        int[] arr = new int[n];

        stringTokenizer = new StringTokenizer(bReader.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
            
        select(arr, 0, n-1, o, p, swapCnt);   
    }

	public static int select(int[] A, int start, int end, int o, int p, Long swapCnt){
        int pivot = partition(A, start, end, p, swapCnt);
        int k = pivot-start+1;
        System.out.println(k);
        
        if(++swapCnt < p){    
            if(o<k){
                return select(A, start, pivot-1, o, p, swapCnt);
            }else if(o==k){
                return A[pivot];
            }else{
                return select(A, pivot+1, end, o-k, p, swapCnt);
            }
        }else{
            return -1;
        }
	}

	public static int partition(int[] A, int start, int end, int p, long swapCnt){
        int x = A[end];
        int point = start-1;
        
        for(int j=start;j<end-1;j++){
            if(A[j]<=x){
                swap(A, ++point, j);
                if(++swapCnt == p){
                    System.out.println(A[point] + " " + A[j]);
                    break;
                }
            };
        }
        
        if(point+1!=end){
            swap(A, point+1, end);
            if(++swapCnt == p){
                System.out.println(A[point+1] + " " + A[end]);
            }else if(swapCnt < p){
                System.out.println(-1);
            }
        }
        
        return point+1;
    }

	public static void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}