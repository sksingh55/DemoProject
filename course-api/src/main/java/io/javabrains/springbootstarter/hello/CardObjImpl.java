
package io.javabrains.springbootstarter.hello;
import java.util.List;

public class CardObjImpl implements CardObjInterface {

    private String cardName;
    private String cardValue;
    private List<ThumbnailObjImpl> thubmnailList;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardValue() {
        return cardValue;
    }

    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }

    public List<ThumbnailObjImpl> getThubmnailList() {
        return thubmnailList;
    }

    public void setThubmnailList(List<ThumbnailObjImpl> thubmnailList) {
        this.thubmnailList = thubmnailList;
    }

    public void insertThumbnail(ThumbnailObjImpl newThumbnail){
        thubmnailList.add(newThumbnail);
    }
}
