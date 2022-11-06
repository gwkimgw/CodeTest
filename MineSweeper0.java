class MineSweeper0 {
    public int solution(int[][] board) {
        int answer = board.length * board[0].length;
        int l = board.length;
        
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(board[i][j] == 1){
                    answer--;
                    for(int x=i-1;x<=i+1;x++){
                        if(x<0 || x>=l) continue;
                        for(int y=j-1;y<=j+1;y++){
                            if(y<0 || y>=l) continue;   
                            if(board[x][y]==0){
                                board[x][y] = -1;
                                answer--;
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}