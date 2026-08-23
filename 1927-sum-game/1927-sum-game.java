class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int count = 0;
        int sum = 0;
        int question = 0;
        for(int i = 0; i < n / 2; i++){
            if(num.charAt(i) == '?'){
                count++;
                question++;
            }else{
                sum += num.charAt(i) - '0';
            }
        }

        for(int i = n / 2; i < n; i++){
            if(num.charAt(i) == '?'){
                count--;
                question++;
            }else{
                sum -= num.charAt(i) - '0';
            }
        }

        if(question % 2 == 1){
            return true;
        }
        if(count == 0){
            return sum != 0;
        }
        return sum != -count * 9 / 2;
    }
}