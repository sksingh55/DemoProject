package io.javabrains.springbootstarter.hello;

import java.util.Map;
public class SchoolCategoryImpl implements SchoolCategoryInterface {
    private Map<String,Map<String, Map<String, Map<Integer, String>>>> schoolCategoryThumbnail;

    public void insertPorperty(String cardName, String propertyName, Map<String, Map<Integer, String>> propertiesValueTypeMap){
        schoolCategoryThumbnail.get(cardName).put(propertyName, propertiesValueTypeMap);
    }
    public void insertCard(String cardName, Map<String, Map<String, Map<Integer, String>>>insideCardDataMap){
        schoolCategoryThumbnail.put(cardName, insideCardDataMap);
    }
}

