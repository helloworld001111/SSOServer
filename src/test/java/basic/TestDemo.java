package basic;

import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.beanutils.LazyDynaMap;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class TestDemo {
    @Test
    public void fun1(){
        LazyDynaBean ldb = new LazyDynaBean();
        ldb.set("name","张三");
        ldb.set("age",18);
        ldb.set("id",null);
        Map<String, Object> map = ldb.getMap();
        if(map!=null){
            for(Map.Entry<String,Object> entry:map.entrySet()){
                System.out.println(entry.getKey()+"==="+entry.getValue());
            }
        }
    }

    @Test
    public void fun2(){
        LazyDynaMap ldm = new LazyDynaMap();
        ldm.set("name","zhangsan");
        ldm.set("age",19);
        ldm.set("id",null);
        Map<String, Object> map = ldm.getMap();
        if(map!=null){
            for(Map.Entry<String,Object> entry:map.entrySet()){
                System.out.println(entry.getKey()+"==="+entry.getValue());
            }
        }
    }

    @Test
    public void fun3(){
//        System.out.println(System.currentTimeMillis()); //1552024461920
//        System.out.println(new Date());
//        Calendar c = Calendar.getInstance();
////        c.set(Calendar.MONTH,1);
//        int actualMaximum1 = c.getActualMaximum(Calendar.DAY_OF_MONTH); //31 或本Calendar当月的最大日
//        int actualMaximum = c.getActualMaximum(Calendar.MONTH); //11 获取最大月份对应的值
//        System.out.println(actualMaximum1); //31
//        System.out.println(actualMaximum);
//        //依次是：Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
//        //分别对应：1,2,3,4,5,6,7
//        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //6 周五
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("hello");
        list.add("world");
        list.add("");
        list.remove("");
        System.out.println(list); //[hello, world, ]
    }

    @Test
    public void fun4(){
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.DAY_OF_MONTH,-90);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        System.out.println(sdf.format(c.getTime())); //20181211
//        String property = System.getProperty("os.name");
////        System.out.println(property);
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date date = sdf.parse("20190228");
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.set(Calendar.DAY_OF_MONTH,1);
            c.add(Calendar.MONTH,-1);
            c.add(Calendar.DAY_OF_MONTH,-1);
            System.out.println(sdf.format(c.getTime())); //20181231
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void fun5(){
//        Object[] params = new Object[5];
//        //数组父类是Object
////        System.out.println(params instanceof Object);
//        LazyDynaBean bean = new LazyDynaBean();
//        bean.set("name","zhangsan");
//        bean.set("age",18);
//        Map<String, Object> map = bean.getMap();
//        for(Map.Entry<String,Object> entry:map.entrySet()){
//
//            System.out.println(entry.getKey()+"==="+entry.getValue());
//        }
        //isAssignableFrom this object is same or super class or super interface of the paramter specified
        //
        System.out.println(Comparable.class.isAssignableFrom(String.class)); //false
    }
}
