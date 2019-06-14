package io.javabrains.springbootstarter.hello;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Cards {

    private List<CardObjImpl> card = new ArrayList<>();
    public void insertCard(CardObjImpl newCard){
        this.card.add(newCard);
    }
}
