public class Q1{

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("String length = "+ stringlength(str));
        System.out.println("String to lower case = " + stringLowerCase(str));
        System.out.println("Reversed string = " + reverseString(str));
        System.out.println("Is string palindrome? " +palindrome(str));
        System.out.println("Duplicate chars in string");
        duplicateChars(str);
        System.out.println("Is string valid? " + isValidString(str));
        wordsAndVowels(str);

    }

    private static int stringlength(String str){
        int count=0;
        for(char ch: str.toCharArray()){
            count++;
        }
        return count;
    }
    private static String stringLowerCase(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                newStr+=ch;
            }else{
                newStr+=(char)(ch+32);
            }
        }
        return newStr;
    }
    private static void wordsAndVowels(String str){
        int vowels=0;
        int words=0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowels++;
            }
            if(ch==' ') words++;
        }
        System.out.println("Vowels = " + vowels + "  Words= "+(words+1));
    }
    private static String reverseString(String str){
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    private static boolean palindrome(String str){
        int i=0,j=str.length()-1;

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