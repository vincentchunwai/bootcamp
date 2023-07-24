class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        String Ans = "";
        char[] str1c = str1.toCharArray();
        char[] str2c = str2.toCharArray();
        int i = 0;
        int acc = 0;
        while (str1c[i] == str2c[i] && i < str1c.length && i < str2c.length){
            i++;
            acc++;
        }
        for (int y = 0; y < acc; y++){
            Ans += str1c[y];
        }
        
        return Ans;

    }
  }