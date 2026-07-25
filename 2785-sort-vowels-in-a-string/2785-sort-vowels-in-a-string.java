class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'
        || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I'){
            return true;
        }
        return false;
    }

    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);

        char [] arr = s.toCharArray();
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(isVowel(arr[i])){
                arr[i] = vowels.get(j++);
            }
        }
        return new String(arr);
    }
}