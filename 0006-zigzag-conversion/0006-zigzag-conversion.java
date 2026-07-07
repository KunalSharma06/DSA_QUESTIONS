class Solution {
    public String convert(String s, int numRows) {
        String[] arr = new String[numRows];
        if(numRows == 1){
            return s;
        }
        for(int i = 0; i < numRows; i++){
            arr[i] = "";
        }
        int currentRow = 0;
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[currentRow] += ch;
            if(i != 0){
                if(currentRow == numRows - 1 || currentRow == 0){
                flag = !flag;
                }
            }
            if(flag){
                currentRow++;
            }else{
                currentRow--;
            }
        }
        String str = "";
        for(int i = 0; i < numRows; i++){
            str += arr[i];
        }
        return str;
    }
}