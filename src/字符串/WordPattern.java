package src.字符串;
import java.util.*;
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<Character,String>();
        char[] chr= pattern.toCharArray();
        String[] str = s.split(" ");
        if(chr.length!= str.length) return false;
        for(int i=0;i< chr.length;i++){
            if(map.containsKey(chr[i])){
                if(!map.get(chr[i]).equals(str[i])){
                    return false;
                }
            }else{
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(chr[i],str[i]);
            }
        }
        return true;
    }
}
