package interviw_hot.WordLadder_127;

import javafx.util.Pair;

import java.util.*;

public class Solution_java {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < wordList.size(); ++i){
            map.put(wordList.get(i), Integer.MAX_VALUE - 1000);
        }
        for(int i = 0; i < wordList.size(); ++i){
            if(canReach(beginWord, wordList.get(i)))
                map.put(wordList.get(i), 1);
        }
        for(int i = 0; i < wordList.size() - 1; ++i){
            for(int j = i + 1; j < wordList.size(); ++j){
                if(canReach(wordList.get(i), wordList.get(j))){
                    map.put(wordList.get(i), Math.min(map.get(wordList.get(j)) + 1, map.get(wordList.get(i))));
                    map.put(wordList.get(j), Math.min(map.get(wordList.get(i)) + 1, map.get(wordList.get(j))));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < wordList.size(); ++i){
            if(canReach(wordList.get(i), endWord)){
                res = Math.min(res, map.get(wordList.get(i)) + 1);
            }
        }
        return res;
    }

    public boolean canReach(String source, String target){
        int[] sourceArr = new int[26];
        int[] targetArr = new int[26];
        for(int i = 0; i < source.length(); ++i){
            sourceArr[source.charAt(i) - 'a']++;
        }
        for(int i = 0; i < target.length(); ++i){
            targetArr[target.charAt(i) - 'a']++;
        }
        int diff = 0;
        for(int i = 0; i < 26; ++i){
            if(sourceArr[i] !=targetArr[i])
                ++diff;
        }
        return diff > 2 ? false : true;
    }



    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {

        // Since all words are of same length.
        int L = beginWord.length();

        // Dictionary to hold combination of words that can be formed,
        // from any given word. By changing one letter at a time.
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                        // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        ArrayList<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));

        // Visited to make sure we don't repeat processing same word.
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }


    public static void main(String[] args) {

        Solution_java aaa = new Solution_java();
        ArrayList<String> words = new ArrayList<>();
        words.add("hot");
        words.add("dot");
        words.add("dog");
        words.add("lot");
        words.add("log");


        aaa.ladderLength1("hit","cog",words);
    }
}
