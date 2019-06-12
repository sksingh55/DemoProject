package io.javabrains.springbootstarter.hello;

import java.util.Map;

public interface SchoolCategoryInterface {
    public void insertPorperty(String cardName, String propertyName, Map<String, Map<Integer, String>> propertiesValueTypeMap);
    public void insertCard(String cardName, Map<String, Map<String, Map<Integer, String>>>insideCardDataMap);
}
