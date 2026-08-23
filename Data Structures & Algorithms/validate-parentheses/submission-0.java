class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                st.push(c);
            }else if(c==')'||c=='}'||c==']'){
                char top = st.peek();
                if(st.isEmpty()) return false;
                if((c=='}'&&top!='{')||(c==')'&&top!='(')||(c==']'&&top!='[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
