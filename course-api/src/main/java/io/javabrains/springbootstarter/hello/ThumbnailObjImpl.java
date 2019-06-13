package io.javabrains.springbootstarter.hello;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class ThumbnailObjImpl {
    private String nameOfThumbnail;
    private Map<String, Map<Integer, String>> typeValueMap;


    public void insertTypeValue(String nameCorresValue, int value, String valueType){
        Map<Integer, String> tempMap = new HashMap<>();
        tempMap.put(value,valueType);
        typeValueMap.put(nameCorresValue, tempMap);
    }

}
