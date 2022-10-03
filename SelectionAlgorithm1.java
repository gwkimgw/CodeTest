import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionAlgorithm1{
    public static int swapCnt = 0;
    
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int o = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        
        int[] arr = new int[n];

        stringTokenizer = new StringTokenizer(bReader.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
            
        select(arr, 0, n-1, o, p);   
    }

	public static int select(int[] A, int start, int end, int o, int p){
        int pivot = partition(A, start, end, p);
        int k = pivot-start+1;
        
        if(o<k){
            return select(A, start, pivot-1, o, p);
        }else if(o==k){
            return A[pivot];
        }else{
            return select(A, pivot+1, end, o-k, p);
        }
	}

	public static int partition(int[] A, int start, int end, int p){
        int x = A[end];
        int point = start-1;
        
        for(int j=start;j<end-1;j++){
            if(A[j]<=x){
                swap(A, ++point, j);
                if(++swapCnt == p){
                    System.out.println(A[point] + " " + A[p]);
                }
            };
        }
        if(point+1!=end){
            swap(A, point+1, end);
            if(++swapCnt < p){
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