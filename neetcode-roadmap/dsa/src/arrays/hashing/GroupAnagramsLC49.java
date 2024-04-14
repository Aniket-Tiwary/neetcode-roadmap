package arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
    public static void main(String[] args){
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
