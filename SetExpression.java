import java.io.*;
import java.util.*;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW-집합-22

public class SetExpression {
    static int[] N;
    public static void main(String[] args) throws Exception{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] NM = bReader.readLine().split(" ");
        N = new int[Integer.parseInt(NM[0])+1];

        for(int i=0;i<N.length;i++) N[i] = i;

        for(int i=0;i<Integer.parseInt(NM[1]);i++){
            String [] commands = bReader.readLine().split(" ");
            int command = Integer.parseInt(commands[0]);
            int a = Integer.parseInt(commands[1]);
            int b = Integer.parseInt(commands[2]);
            if(command == 0){
                union(a,b);
            }else if(command == 1){
                check(a,b);
            }
        }
    }

    public static int findParent(int x){
        if(x == N[x]){
            return N[x];
        }else{
            return N[x]=findParent(N[x]);
        }
    }

    public static void union(int a, int b){
        int ap = findParent(a);
        int bp = findParent(b);
        N[bp] = ap;
    }

    public static void check(int a, int b){
        int ap = findParent(a);
        int bp = findParent(b);
        if(ap!=bp){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}