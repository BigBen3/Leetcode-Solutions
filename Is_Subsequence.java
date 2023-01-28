public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
           return true;
       }
       if(t.isEmpty()){
           return false;
       }
        if(s.length() == 1 && t.contains(s)) {
          return true;
      }
      int i = 0; 
      int j = 0;
      while(i < s.length()){
          if(j >= t.length()) {
              break;
          }
          if(s.charAt(i) == t.charAt(j)){
              i++;
              j++;
          }
          else {
              j++;
          }
         
      }
          if(i == s.length()) {
              return true; 
          }
              return false;
  }
}
