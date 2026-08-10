class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : s.toLowerCase().toCharArray()){
            if(true){
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
        }
        for(char c : t.toLowerCase().toCharArray()){
            if(true){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
        }
        Set<Character> keys1 = map1.keySet(); 
        Set<Character> keys2 = map2.keySet();
        if(keys1.equals(keys2)==true){
            for(char key : keys1){
                if(map1.get(key).equals(map2.get(key))){
                    continue;
                }else{
                    return false;
                }
               
            }
             return true;
        }
        return false;
    }
}
