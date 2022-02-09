public class Q2 {
    
    public static void main(String[] args) {
        
        String str = "zcedoepsnqalf";
        sortString(str);

    }

    private static void sortString(String str) {

        char ch[]= str.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=1;j<ch.length;j++){
                if(ch[j]<ch[j-1]){
                    char temp = (char)ch[j-1];
                    ch[j-1]=(char)ch[j];
                    ch[j]=(char)temp;
                }
            }
        }
        for(char c:ch){
            System.out.print(c);
        }

    }
}
