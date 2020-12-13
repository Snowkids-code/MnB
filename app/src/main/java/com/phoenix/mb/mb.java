package com.phoenix.mb;

public class mb {

    private String order;
    private String place;
    private String table;

    public mb(){

    }

    public mb(String order, String place, String table) {
        this.order = order;
        this.place = place;
        this.table = table;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
