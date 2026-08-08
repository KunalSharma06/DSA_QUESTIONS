class Solution {

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
    public String sortVowels(String s) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if(!first.containsKey(ch)){
                    first.put(ch, i);
                }
            }
        }

        ArrayList<Character> vowels = new ArrayList<>(map.keySet());
        vowels.sort((a, b) -> {
           if(!map.get(a).equals(map.get(b))){
            return map.get(b) - map.get(a);
           }
           return first.get(a) - first.get(b);
        });

        StringBuilder ans = new StringBuilder();
        int index = 0;

        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                char vowel = vowels.get(index);
                ans.append(vowel);

                map.put(vowel, map.get(vowel) - 1);
                if(map.get(vowel) == 0){
                    index++;
                }
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}