import java.util.*;

//60172981 데이터테크놀로지 김건우
//알고리즘 HW-집합-22
//백준 1822
 
public class Set1822 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TreeSet<Integer> A = new TreeSet<Integer>();
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i, num;
            for(i=0;i<a;i++) A.add(sc.nextInt());
            for(i=0;i<b;i++) {
                num=sc.nextInt();
                if(A.contains(num)) A.remove(num);
            }
            
            System.out.println(A.size());
            for(int n : A) System.out.print(n+" ");
            
            sc.close();
        }
    }
}
