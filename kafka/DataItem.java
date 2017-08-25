package test.rxjava.model;

import lombok.Data;

import java.util.Date;

@Data
public class DataItem {

    private String data;
    private Date date;
    private int sequence;

    public DataItem(String data) {
        this.data = data;
    }

}