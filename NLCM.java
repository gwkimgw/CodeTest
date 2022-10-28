import java.util.*;

class NLCM {
    public int solution(int[] arr) {
        int answer = 0;
        
        for(int i=0;i<arr.length;i++){
            arr = divArr(arr, i);
            System.out.println(Arrays.toString(arr));
            i++;
        }
        
        for(int k : arr){
            if(answer > 0){
                answer *= k;
            } else {
                answer = k;   
            }
        }
        
        return answer;
    }
    
    public static int[] divArr(int[] arr, int i){
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int j=i;j<arr.length;j++){
            if(arr[j]/arr[i]==1){
                if(arr[j]%arr[i]==0){
                    intArr.add(arr[j]);
                    j++;
                }
                intArr.add(arr[j]/arr[i]);
            }else{
                intArr.add(arr[j]);
            }
        }
        
        int[] finArr = intArr.stream().mapToInt(l -> l).toArray();
        return finArr;
    }
}