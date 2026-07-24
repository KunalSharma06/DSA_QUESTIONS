class Solution {
    public int splitNum(int num) {
        String temp = Integer.toString(num);
        int [] arr = new int[temp.length()];
        int index = arr.length - 1;
        while(num > 0){
            arr[index--] = num % 10;
            num /= 10;
        }
        int sum = 0;
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                num1 = (num1 * 10) + arr[i];
            }else{
                num2 = (num2 * 10) + arr[i];
            }
        }
        return num1 + num2;
    }
}