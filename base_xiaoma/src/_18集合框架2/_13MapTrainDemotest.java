package _18集合框架2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by E430 on 2017/8/1.
 */
public class _13MapTrainDemotest {
    public static void main(String[] args) {
        String str = "fdsaffdsfas";
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ele:array){
            if(map.containsKey(ele)){
                Integer old = map.get(ele);
                map.put(ele,old+1 );
            }else{
                map.put(ele, 1);
            }
        }
        System.out.println(map); 
    }
}
