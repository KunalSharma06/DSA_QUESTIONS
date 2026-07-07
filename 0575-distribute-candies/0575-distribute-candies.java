class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }

        int candies = candyType.length / 2;
        if(set.size() == candies){
            return set.size();
        }else if(set.size() < candies){
            return set.size();
        }
        return candies;
    }
}