package _18集合框架2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by E430 on 2017/7/30.
 */
public class _09HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key1","value1");//value可以重复
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        //map.put("key5","value3");//会覆盖key5

                                  //没有按照添加顺序显示 因为左边key是set集合 无序
        System.out.println(map); //{key1=value1, key2=value2, key5=value5, key3=value3, key4=value4}

        //map.clear();
        //System.out.println(map);
        
        System.out.println(map.containsKey("key2")); //true
        System.out.println(map.containsValue("value2"));
        
        //get() 根据key找value
        Object val = map.get("key3");
        System.out.println(val); //value3

        System.out.println(map.size());//5

        //putAll  把另外一个map里的数据都添加进来
        
        //remove
        System.out.println(map.remove("key5")); //根据key删除元素 返回被删除的元素
        System.out.println(map);

        //获取map中所有key所组成的集合
        System.out.println("----"); 
        Set<String> keySet = map.keySet();
        for(String ele:keySet){
            System.out.println(ele + "-->" + map.get(ele));
        }

        //获取map中所有value所组成的集合(value可以重复 类似list)
        Collection<Object> values = map.values();
        for(Object ele: values){
            System.out.println(ele);
        }
System.out.println("++++");
        //获取map中所有的Entry(key--value)
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for(Map.Entry<String, Object> entry:entries){
            String key = entry.getKey();//获取entry的key
            Object value = entry.getValue();//获取value的值
            System.out.println(key+"-->"+value); 
        }

        //上面增删查都有了 api中没有改的方法  改就是改value
         //所以 改  就是重新put进去一个新值 key相同 去覆盖原来的
    }
}
