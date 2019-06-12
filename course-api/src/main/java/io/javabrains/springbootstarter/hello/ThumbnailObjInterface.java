package io.javabrains.springbootstarter.hello;

import java.util.HashMap;
import java.util.Map;

public interface ThumbnailObjInterface {

    public String getNameOfThumbnail();

    public void setNameOfThumbnail(String nameOfThumbnail);

    public Map<String, Map<Integer, String>> getTypeValueMap();

    public void setTypeValueMap(Map<String, Map<Integer, String>> typeValueMap);

    public void insertTypeValue(String nameCorresValue, int value, String valueType);

}
