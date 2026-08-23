class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i)>=k){
                list.add(i);
            }
        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}