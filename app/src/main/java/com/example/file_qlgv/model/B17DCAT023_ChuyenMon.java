package com.example.file_qlgv.model;

public class B17DCAT023_ChuyenMon {
    private int id;
    private String name;
    private String detail;

    public B17DCAT023_ChuyenMon(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public B17DCAT023_ChuyenMon(int id, String name, String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
