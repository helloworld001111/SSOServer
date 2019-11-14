package basic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SortField {
    private String field;
    //是否递增，默认升序
    private boolean isAdd = true;
}
