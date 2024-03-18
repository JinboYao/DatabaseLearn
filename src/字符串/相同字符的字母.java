package src.字符串;
import java.util.*;
// HashMap<String,List<String>>

public class 相同字符的字母 {
    public static void main(String[] args){

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str:strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String str0 = new String(chr);
            if(!map.containsKey(str0)){
                map.put(str0, new ArrayList<String>());
            }
            map.get(str0).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
