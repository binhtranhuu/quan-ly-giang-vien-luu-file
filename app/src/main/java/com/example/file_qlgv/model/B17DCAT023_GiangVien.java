package com.example.file_qlgv.model;

import java.io.Serializable;

public class B17DCAT023_GiangVien implements Serializable {

    private int id;
    private String name;
    private String trinhdo;
    private String kinhnghiem;

    public B17DCAT023_GiangVien(String name, String trinhdo, String kinhnghiem) {
        this.name = name;
        this.trinhdo = trinhdo;
        this.kinhnghiem = kinhnghiem;
    }

    public B17DCAT023_GiangVien(int id, String name, String trinhdo, String kinhnghiem) {
        this.id = id;
        this.name = name;
        this.trinhdo = trinhdo;
        this.kinhnghiem = kinhnghiem;
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

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getKinhnghiem() {
        return kinhnghiem;
    }

    public void setKinhnghiem(String kinhnghiem) {
        this.kinhnghiem = kinhnghiem;
    }
}