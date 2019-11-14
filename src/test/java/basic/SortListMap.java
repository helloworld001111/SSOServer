package basic;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/*
    由于HashMap自身不具有比较性，因此自定义比较器按照Map中的某些字段进行比较排序，需要实现Comparator

 */
public class SortListMap implements Comparator<Map<String,Object>> {
    private List<SortField> list;

    public SortListMap(List<SortField> list){
        this.list = list;
    }

    @Override
    public int compare(Map<String,Object> map1,Map<String,Object> map2){
        return 0;
    }

}
