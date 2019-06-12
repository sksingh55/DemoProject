package io.javabrains.springbootstarter.hello;

import java.util.HashMap;
import java.util.Map;

public class ThumbnailObjImpl {
    private String nameOfThumbnail;
    private Map<String, Map<Integer, String>> typeValueMap;

    public String getNameOfThumbnail() {
        return nameOfThumbnail;
    }

    public void setNameOfThumbnail(String nameOfThumbnail) {
        this.nameOfThumbnail = nameOfThumbnail;
    }

    public Map<String, Map<Integer, String>> getTypeValueMap() {
        return typeValueMap;
    }

    public void setTypeValueMap(Map<String, Map<Integer, String>> typeValueMap) {
        this.typeValueMap = typeValueMap;
    }

    public void insertTypeValue(String nameCorresValue, int value, String valueType){
        Map<Integer, String> tempMap = new HashMap<>();
        tempMap.put(value,valueType);
        typeValueMap.put(nameCorresValue, tempMap);
    }

}
