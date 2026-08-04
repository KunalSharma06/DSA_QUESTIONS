class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s1 = startTime.split(":");
        String[] s2 = endTime.split(":");

        int start = Integer.parseInt(s1[0]) * 3600 + Integer.parseInt(s1[1]) * 60 + Integer.parseInt(s1[2]); 
        int end = Integer.parseInt(s2[0]) * 3600 + Integer.parseInt(s2[1]) * 60 + Integer.parseInt(s2[2]);

        return Math.abs(end - start); 
    }
}