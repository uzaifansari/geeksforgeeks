class Solution{
    static String magicalString(String S){
        // code here
            // code here
       String str="";
       for(int i=0; i<S.length(); i++){
           str=str+(char)(122-(S.charAt(i)-97));
       }
       return str;
            
    }
}
