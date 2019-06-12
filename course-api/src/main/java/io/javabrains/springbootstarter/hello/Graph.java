package io.javabrains.springbootstarter.hello;


import java.util.List;

public class Graph {

    private List<Double> data;

    public void setData(List<Double> data){
        this.data = data;
    }

    public List<Double> getData() {
        return this.data;
    }
}
