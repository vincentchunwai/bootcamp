class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i = 0;
        
        if (s2 == (s1))
          return true;
        while (i < s2.length()/2){
            char temp = s2.charAt(i);
            s2.charAt(i) = s2.charAt(s2.length()-1-i);
            s2.charAt(s2.length()-1-i) = temp;

            if (s2 == s1)
                return true;
            i++;
        }
        return false;
    }
}