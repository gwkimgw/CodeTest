import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW-집합-22
//백준 1822

public class MatrixChain{
	public static int matrixChain(int[] dims, int i, int j, int[][] lookup){
		if (j <= i + 1) { return 0; }

        int min = Integer.MAX_VALUE;
        if (lookup[i][j] == 0){
			for (int k = i + 1; k <= j - 1; k++){
                int cost = matrixChain(dims, i, k, lookup);
                cost += matrixChain(dims, k, j, lookup);
                cost +=	dims[i] * dims[k] * dims[j];
				if (cost < min) { min = cost; }
			}
			lookup[i][j] = min;
		}
        return lookup[i][j];
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dims = Stream.of(br.readLine().split("x")).mapToInt(Integer::parseInt).toArray();
        int[][] lookup = new int[dims.length][dims.length];

		System.out.print(matrixChain(dims, 0, dims.length - 1, lookup));
	}
}