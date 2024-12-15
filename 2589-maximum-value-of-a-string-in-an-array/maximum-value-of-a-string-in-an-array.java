class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for(String s: strs){
            try{
                ans = Math.max(ans, Integer.parseInt(s));
            }catch(Exception e){
                ans = Math.max(ans, s.length());
            }
        }
        return ans;
    }
}
