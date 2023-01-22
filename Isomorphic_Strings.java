import java.util.HashMap;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) {
                return false;
                //to check if a new character is being assinged a value that is already assigned. 
            }
            
            else if(map.containsKey(s.charAt(i)) && !map.get(s.charAt(i)).equals(t.charAt(i))) {
               
                return false;
            }
            else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;  
  
 }
}
