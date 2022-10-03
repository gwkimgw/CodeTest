import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class SelectionAlgorithm1{
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

        System.out.println(quickSelect(arr, 0, n-1, o));
    }

	private static int quickSelect(int[] A, int start, int end, int k) {
		if (start <= end) {
			int pivot = partition(A, start, end);

			if (pivot == k) {
				return A[k];
			}

			else if (pivot > k) {
				return quickSelect(A, start, pivot - 1, k);
			}

			else {
				return quickSelect(A, pivot + 1, end, k);
			}
		}

		return Integer.MIN_VALUE;
	}

	private static int partition(int[] A, int start, int end) {
		int pivot = start + new Random().nextInt(end - start + 1);

		swap(A, end, pivot);

		for (int i = start; i < end; i++) {
			if (A[i] > A[end]) {
				swap(A, i, start);
				start++;
			}
		}

		swap(A, start, end);

		return start;
	}

	private static void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
    
    public static void main(String[] args) throws Exception{
        new SelectionAlgorithm1().solution();
    }
}