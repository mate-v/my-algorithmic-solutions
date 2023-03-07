/*
https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/java
*/
public class Accumul {
    
    public static String accum(String s) {
     String[] arr = new String[s.length()];
      
     StringBuilder strB = new StringBuilder();
      
     for (int i = 0; i < s.length(); i++) {
      String ch = String.valueOf(s.charAt(i)).toUpperCase();
        
      strB.append(ch);
        
      for (int j = 0; j < i; j++) {
       strB.append(ch.toLowerCase());
      }
        
      if (i != s.length() - 1) {
       arr[i] = strB.append("-").toString();
      } else {
       arr[i] = strB.toString();
      }
     }
      
     return strB.toString();
    }
}
