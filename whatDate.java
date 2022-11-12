public class whatDate {
    public String solution(int a, int b) {
        String answer = "";
        int date = -1;

        switch(a){
            case 1 : date += b; break;
            case 2 : date += 31+b; break;
            case 3 : date += 60+b; break;
            case 4 : date += 91+b; break;
            case 5 : date += 121+b; break;
            case 6 : date += 152+b; break;
            case 7 : date += 182+b; break;
            case 8 : date += 213+b; break;
            case 9 : date += 244+b; break;
            case 10 : date += 274+b; break;
            case 11 : date += 305+b; break;
            case 12 : date += 335+b; break;
        }

        switch(date%7){
            case 0 : answer = "FRI"; break;
            case 1 : answer = "SAT"; break;
            case 2 : answer = "SUN"; break;
            case 3 : answer = "MON"; break;
            case 4 : answer = "TUE"; break;
            case 5 : answer = "WED"; break;
            case 6 : answer = "THU"; break;
        }

        return answer;
    }
}