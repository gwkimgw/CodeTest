import java.util.Scanner;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW12
//백준 14659

public class Hanzo{
    static int[] arr;
    static int n;
    static int count = Integer.MIN_VALUE;

    public static void peak(int num, int k, int kill){
        if(k>n) peak(num, num+1, 0);
        if(k == n){
            count = Math.max(count, kill);
        }else{
            if (arr[num] > arr[k]){
                peak(num, k+1, kill+1);
            }else{
                count = Math.max(count, kill);
                peak(num+1, num+2, 0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        peak(0, 1, 0);
        System.out.println(count);
    }
}