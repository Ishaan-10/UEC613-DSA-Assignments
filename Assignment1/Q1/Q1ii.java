// computes and returns the smallest positive integer n for which 1+2+3+...+n equals or exceeds the value of "goal"

public class Q1ii {
    
    public static void main(String[] args) {

        int n = 22;
        int ans = caluclateNum(n);

        System.out.println(ans);
    }

    private static int caluclateNum(int goal){

        for(int i=0;i<goal;i++){
            int num = (i * (i+1))/2;
            if(num>=goal){
                return i;
            }
        }
        return 0;
    }
}
