package io.javabrains.springbootstarter.hello;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
public class ThumbnailObjImpl {
    private String nameOfThumbnail;

    private List<ThumbnailData> thumbnailData = new ArrayList<>();
    public void insertThumbnailData(ThumbnailData data ){
        this.thumbnailData.add(data);
    }
}
