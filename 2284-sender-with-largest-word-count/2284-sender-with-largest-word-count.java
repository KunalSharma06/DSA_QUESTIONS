class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < messages.length; i++){
            int word = messages[i].split(" ").length;
            map.put(senders[i], map.getOrDefault(senders[i], 0) + word);
        }

        String ans = "";
        int max = 0;
        for(String name : map.keySet()){
            int count = map.get(name);
            if(count > max || (count == max) && name.compareTo(ans) > 0){
                max = count;
                ans = name;
            }
        }
        return ans;
    }
}