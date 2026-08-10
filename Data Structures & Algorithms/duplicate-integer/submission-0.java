class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i : nums){
        if(true){
        map.put(i, map.getOrDefault(i, 0) + 1);
        }
       }
       Collection<Integer> values = map.values();
       for(int value : values){
        if(value>1) return true;
       }
       return false;
    }
}