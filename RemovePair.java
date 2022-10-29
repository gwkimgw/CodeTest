class RemovePair{
    public int solution(String s){
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
            }
            System.out.println(sb.toString());
        }
        
        int answer = (sb.length()==0) ? 1 : 0;
        return answer;
    }
}