class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int arr[] = new int [n];
        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            arr[nums1.length + i] = nums2[i];
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        double median;
        if(n % 2 != 0){
            median = arr[n/2];
        } else{
            int median1 = arr[(n/2) - 1];
            int median2 = arr[n/2];
            median = (median1 + median2) / 2.0;
        }
        return median;
    }
}