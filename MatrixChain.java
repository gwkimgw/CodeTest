import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW-집합-22
//백준 1822

public class MatrixChain{
    private static int[][] min;
    private static int[][] order;
    
    public static int matrixChainOrder(int[] dims) {
        int n = dims.length-1;
        min = new int[n][n]; order = new int[n][n];

        for (int l=1;l<n;l++) {
            for (int i=0;i<n-l;i++){
                int j = i+l;
                min[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost = min[i][k] + min[k+1][j] + dims[i]*dims[k+1]*dims[j+1];
                    if(cost < min[i][j]){
                        min[i][j] = cost;
                        order[i][j] = k;
                    }
                }
            }
        }
        return min[0][n-1];
    }

    private static String getOrder(int[][]s, int i, int j) {
        if (i == j){
            return "A" + Integer.toString(i+1);
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(getOrder(s, i, s[i][j]));
            sb.append(getOrder(s, s[i][j] + 1, j));
            sb.append(")");
            return sb.toString();
        }
    }

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dims = Stream.of(br.readLine().split("x"))
			.mapToInt(Integer::parseInt)
			.toArray();
        System.out.println(matrixChainOrder(dims)
			+ "\n" + getOrder(order, 0, order.length-1));
	}
}