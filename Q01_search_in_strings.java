public class Q01_search_in_strings {
    public static void main(String[] args) {
       String name = "sjksjkdgl";
       char target = 'k';
        System.out.println(search(name, target));
    }
    static boolean search(String s,char target){
        if(s.length()==0) return  false;
                // for(int i=0;i<s.length();i++){
                //     if(target==s.charAt(i)){
                //         return true;
                //     }
                // }
        for(char ch :s.toCharArray()){
            if(ch==target) return true;
        }        
        return false;
    }
}
