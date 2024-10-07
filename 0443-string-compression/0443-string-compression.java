
class Solution {
    public int compress(char[] chars) {
        // int n = chars.length;
        // int i = 0;
        // int idx = 0;
        // while (i < n) {
        //     int c=0;
        //     char ch = chars[i];
        //     while (i < n && chars[i] == ch){
        //         c++;
        //         i++;
        //     }
        //     chars[idx++] = ch;
        //    if(c>1){
                
        //         String s=String.valueOf(c);
        //         for (char chh : s.toCharArray())
        //             chars[idx++] = chh;
        //     }
        // }
        // return idx;
        int n=chars.length;
        int i=0;
        int idx=0;
       while(i<n)
       {
        int c=0;
        char ch=chars[i];
        while(i<n && chars[i]==ch)
        {
            c++;
            i++;

        }
        chars[idx++]=ch;
        if(c>1)
        {
             String s=String.valueOf(c);
        for(char chh : s.toCharArray())
        chars[idx++]=chh;
        }
       }
       return idx;
    }
}