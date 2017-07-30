package _18集合框架2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by E430 on 2017/7/30.
 */
//需求 计算一个字符串中 每个字符出现的次数
public class _13MapTrainDemo {
    public static void main(String[] args) {
        String str = "aabcdefghhhhjjjk";
        //把字符串转换成为char数组
        char[] array = str.toCharArray();
        //key存储字符名字,value存储出现次数
        Map<Character, Integer> map = new HashMap<>();//linkedHashmap
        //循环每一个字符
        for(char ele:array){
            //System.out.println(ele); 
            if(map.containsKey(ele)){
                Integer old = map.get(ele);//get()根据key找对应value
                map.put(ele, old + 1);
            }else {
                map.put(ele, 1);
            }
        }
        System.out.println(map); //{a=2, b=1, c=1, d=1, e=1, f=1, g=1, h=4, j=3, k=1}

    }
}
