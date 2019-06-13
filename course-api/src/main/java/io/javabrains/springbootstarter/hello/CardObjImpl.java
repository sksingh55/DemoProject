
package io.javabrains.springbootstarter.hello;
;
import lombok.Data;
import lombok.Value;

import java.util.List;
@Data
public class CardObjImpl implements CardObjInterface {

    private String imageUrl;
    private String cardName;
    private String cardValue;
    private List<ThumbnailObjImpl> thubmnailList;
    public void insertThumbnail(ThumbnailObjImpl newThumbnail){
        thubmnailList.add(newThumbnail);
    }
}
