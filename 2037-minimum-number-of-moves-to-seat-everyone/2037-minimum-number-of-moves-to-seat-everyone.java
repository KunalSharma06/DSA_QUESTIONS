class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        int j = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] == seats[j]){
                j++;
            }else{
                ans += Math.abs(students[i] - seats[i]);
            }
        }
        return ans;
    }
}