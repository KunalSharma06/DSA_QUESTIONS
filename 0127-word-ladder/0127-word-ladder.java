class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < wordList.size(); i++){
            set.add(wordList.get(i));
        }
        if(!set.contains(endWord)) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.poll();
            if(word.equals(endWord)){
                return steps;
            }
            for(int i = 0; i < word.length(); i++){
                for(char ch = 'a'; ch <= 'z'; ch++){
                    char[] replaceWord = word.toCharArray();
                    replaceWord[i] = ch;
                    String replaceStr = new String(replaceWord);

                    if(set.contains(replaceStr)){
                        set.remove(replaceStr);
                        q.add(new Pair(replaceStr, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
}