import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionAlgorithm1{
    public static int select(int[] A, int p, int r, int q){
        if(p == r){
            return A[p];
        }

        int t = partition(A, p, r);
        int k = t - p+1;

        if(q < k){
            return select(A, p, t-1, q);
        } else if(q == k) {
            return A[t];
        } else {
            return select(A, p, t+1, q);
        }
    }

    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p-1;
        for(int j=p;j<r-1;j++){
            if(A[j]<=x){
                swap(A, ++i, j);
            }
        }
        if(i+1!=r){
            swap(A, --i, i);
        }
        return i+1;
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public void solution() throws Exception{
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
    }
    
    public static void main(String[] args) throws Exception{
        new SelectionAlgorithm1().solution();
    }
}