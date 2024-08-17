package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String[] arr={"cool","lock","cook"};
        System.out.println(commonChars(arr));
//        arr[0].contains('a');
        System.out.println(arr[0].indexOf('a'));
//        arr[0].r
    }
    public static List<String> commonChars(String[] words) {
        int count=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            count=0;
            char ch=words[0].charAt(i);
            for(int j=0;j<words.length;j++){
                String str=words[j];
                int index=str.indexOf(ch);
                if(index != -1){
                    count++;
                }
            }
            if(count == words.length){
                list.add(Character.toString(ch));
            }
        }
        return list;
    }

}