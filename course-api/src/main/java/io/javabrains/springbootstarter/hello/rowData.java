package io.javabrains.springbootstarter.hello;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class rowData {
    private List<ThumbnailObjImpl> thumbnailList = new ArrayList<>();
    public void insertThumbnail(ThumbnailObjImpl newThumbnail){
        System.out.println(newThumbnail);
        this.thumbnailList.add(newThumbnail);
    }
}
