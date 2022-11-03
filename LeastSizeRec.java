import java.util.Arrays;

class LeastSizeRex {
    public int solution(int[][] sizes) {
        int w = 0; int h = 0;
        
        for(int i=0;i<sizes.length;i++)
            if(sizes[i][0] < sizes[i][1]) swap(sizes, i);
        
        sort2d(sizes, 0); w = sizes[0][0];
        sort2d(sizes, 1); h = sizes[0][1];
        
        return w*h;
    }
    
    public static void sort2d(int[][] sizes, int i){
        Arrays.sort(sizes,(i1,i2) -> i2[i]-i1[i]);
    }
    
    public static void swap(int[][] sizes, int i){
        int tmp = sizes[i][0];
        sizes[i][0] = sizes[i][1];
        sizes[i][1] = tmp;
    }
}