package io.javabrains.springbootstarter.hello;

import java.util.List;

public interface CardObjInterface {
    public String getCardName();

    public void setCardName(String cardName);

    public String getCardValue();

    public void setCardValue(String cardValue);

    public List<ThumbnailObjImpl> getThubmnailList();

    public void setThubmnailList(List<ThumbnailObjImpl> thubmnailList);

    public void insertThumbnail(ThumbnailObjImpl newThumbnail);

}
