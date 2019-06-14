
package io.javabrains.springbootstarter.hello;
;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
public class CardObjImpl implements CardObjInterface {

    private String imageUrl = "mdi mdi-school";
    private String cardName;
    private String cardValue;
    private int size;
    private List<rowData> data = new ArrayList<>();
    public void insertRowData(rowData newdata){
        this.data.add(newdata);
    }
}
