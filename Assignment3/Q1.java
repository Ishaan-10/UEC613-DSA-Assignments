public class Q1{

    public static void main(String[] args) {
        String str = "XYZXYZ";
        duplicateChars(str);
    }

    private static int stringlength(String str){
        int i=0;int count=0;
        while(i<str.length()) count++;
        return count;
    }
    private static String stringLowerCase(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                newStr+=ch;
            }else{
                newStr+=(char)(ch-('A'-'a'));
            }
        }
        // A to a
        return newStr;
    }
    private static int[] wordsAndVowels(String str){
        int vowels=0;
        int words=0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowels++;
            }
            if(ch==' ') words++;
        }
        return new int[]{vowels,words+1};
    }
    private static String reverseString(String str){
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    private static boolean palindrome(String str){
        int i=0,j=str.length();

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static void duplicateChars(String str){
        int chars[]=new int[256];
        for(char ch:str.toCharArray()){
            chars[ch]++;
        }
        for(int i=0;i<256;i++){
            if(chars[i]>1) System.out.print((char)i +" ");
        }
    }

    private static boolean isValidString(String str){

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!(ch>='A' && ch<='z')){
                return false;
            }
        }
        return true;
    }


}