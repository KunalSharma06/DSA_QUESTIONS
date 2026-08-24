class Solution {
    public int[] finalPrices(int[] prices) {
        // for(int i = 0; i < prices.length; i++){
        //     for(int j = i + 1; j < prices.length; j++){
        //         if(prices[j] <= prices[i]){
        //             prices[i] = prices[i] - prices[j];
        //             break;
        //         }
        //     }
        // }
        // return prices;
        int n = prices.length;
        int[] arr = prices.clone();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && prices[st.peek()] >= prices[i]){
                int index = st.pop();

                arr[index] = prices[index] - prices[i];
            }
            st.push(i);
        }
        return arr;
    }
}