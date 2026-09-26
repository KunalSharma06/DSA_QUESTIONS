class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                StringBuilder key = new StringBuilder();
                i++;
                while(s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }
                if(map.containsKey(key.toString())){
                    ans.append(map.get(key.toString()));
                }else{
                    ans.append("?");
                }
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}