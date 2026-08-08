class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if(map.size() <= k){
            return 0;
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int delete = 0;
        int remove = map.size() - k;

        for(int i = 0; i < remove; i++){
            delete += list.get(i);
        }
        return delete;
    }
}