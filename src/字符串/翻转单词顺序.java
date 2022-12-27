package src.字符串;
//输入: "the sky is blue"
//输出: "blue is sky the"

public class 翻转单词顺序 {
    public String reverseWords(String s) {
        s = s.trim();
        String str[]=s.split(" ");
        String s0="";
        for(int i=str.length-1;i>0;i--){
            if(str[i].equals("")){
                continue;
            }else{
                s0+=str[i]+" ";
            }
        }
        return s0+str[0];
    }
}
