package arrays.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagramsLC49 {

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            StringBuilder sTemp = new StringBuilder();
            for(char c:temp){
                sTemp.append(c);
            }
            String key = sTemp.toString();
            ArrayList<Integer> anagrams = new ArrayList<>();
            if(map.containsKey(key)){
                anagrams = map.get(key);
                anagrams.add(i);
                map.put(key,anagrams);
            }else{
                anagrams.add(i);
                map.put(key,anagrams);
            }
        }
        // System.out.println(map);
        List<List<String>> res = new ArrayList<>();
        for(String s:map.keySet()){
            ArrayList<Integer> indices = map.get(s);
            ArrayList<String>temp = new ArrayList<>();
            for(int i:indices){
                temp.add(strs[i]);
            }
            res.add(temp);
        }
        return res;
    }

    //    Solution-2
    public static List<List<String>> groupAnagramsSecond(String[] strs){
          HashMap<HashSet<Character>,ArrayList<String>> anagrams = new HashMap<>();
          for(String s:strs){
              HashSet<Character> keySet = new HashSet<>();
              s.chars().mapToObj(c->(char)c).forEach(keySet::add);
              ArrayList<String> vals = null;
              if(anagrams.containsKey(keySet)){
                  vals = anagrams.get(keySet);
              }else{
                  vals = new ArrayList<>();
              }
              vals.add(s);
              anagrams.put(keySet,vals);
          }
          return anagrams.values().stream().collect(Collectors.toUnmodifiableList());
    }


    public static void main(String[] args){
        String[] strs = new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        System.out.println(groupAnagramsSecond(strs));
    }
}
