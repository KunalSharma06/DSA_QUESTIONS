class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < keyName.length; i++){
            String name = keyName[i];
            String time = keyTime[i];

            int hour = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            int min = hour * 60 + minutes;

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(min);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String name : map.keySet()){ 
            ArrayList<Integer> arr = map.get(name);
            Collections.sort(arr);
            for(int i = 0; i + 2 < arr.size(); i++){
                if(arr.get(i + 2) - arr.get(i) <= 60){
                    ans.add(name);
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}