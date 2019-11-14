package basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.dubei.sso.pojo.Person;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class SortListMapDemo {
    @Test
    public void fun1() throws  IOException {
//        List<SortField> list = new ArrayList<>();
//        SortField field =  new SortField("name",true);
//        list.add(field);
//        SortListMap sortListMap = new SortListMap(list);
//        List<Map<String, Object>> listMap = new ArrayList<>();
//        Map<String, Object> map1 = new HashMap<>();
//        map1.put("name","wangwu");
//        map1.put("age",18);
//        Map<String, Object> map3 = new HashMap<>();
//        map3.put("name","lisi");
//        map3.put("age",20);
//        Map<String, Object> map2 = new HashMap<>();
//        map2.put("name","zhangsan");
//        map2.put("age",17);
//        listMap.add(map1);
//        listMap.add(map2);
//        listMap.add(map3);
//        Collections.sort(listMap,sortListMap);
//        for(Map<String,Object> map:listMap){
//            System.out.println(map);
//        }
        ObjectMapper mapper = new ObjectMapper();
        //实体属性为空或者为null时不打印该值。这里hello可以打印，Person中的null和空串不打印
//        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
//        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        HashMap<String, Object> map = new HashMap<>();
        map.put("hello","");
        Person p = new Person("", 18);
        map.put("person",p);
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }

    @Test
    public void fun2(){
//        BigDecimal bd1 = new BigDecimal("1712366247.80");
//        BigDecimal bd2 = new BigDecimal("396038136.19");
//        BigDecimal bd3 = new BigDecimal("1751529028.01");
//        BigDecimal bd4 = new BigDecimal("0.00");
//        BigDecimal bd5 = new BigDecimal("356875355.98");
//        BigDecimal bd6 = new BigDecimal("0.00");
//        System.out.println(bd1.add(bd2).subtract(bd3));
//        System.out.println(bd4.add(bd5).subtract(bd6));
        Random r = new Random();
        int i = r.nextInt(10);
        System.out.println(i);
    }

    @Test
    public void fun3(){
        System.out.println(Status.SCUUESS.name()); //SCUUESS
        System.out.println(Status.SCUUESS.ordinal()); //0
        System.out.println(Status.SCUUESS.getClass()); //class basic.Status
        System.out.println(Status.SCUUESS.getDeclaringClass()); //class basic.Status
        System.out.println(Status.SCUUESS.getDesc()); //class basic.Status
        System.out.println(Status.SCUUESS.getValue()); //class basic.Status
        System.out.println(Status.SCUUESS.compareTo(Status.FAILED)); //class basic.Status
        System.out.println(String.class.getName()); //java.lang.String
    }
}
