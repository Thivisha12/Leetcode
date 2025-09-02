class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                l=Math.max(l,map.get(c)+1);
            }
            map.put(c,i);
            res= Math.max(res,i-l+1);
        }
        return res;
    }
    
}