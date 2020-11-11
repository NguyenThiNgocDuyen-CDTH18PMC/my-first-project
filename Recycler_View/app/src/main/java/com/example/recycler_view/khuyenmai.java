package com.example.recycler_view;

public class khuyenmai {
    private String name;
    private String trangthai;
    private int img;

    public khuyenmai(String name, String trangthai, int img) {
        this.name = name;
        this.trangthai = trangthai;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
