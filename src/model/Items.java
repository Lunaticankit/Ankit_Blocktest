package model;

public class Items {
    String itemname;
    int itemcode;
    String brand;
    int price;

    public Items(String itemname, int itemcode, String brand, int price) {
        this.itemname = itemname;
        this.itemcode = itemcode;
        this.brand = brand;
        this.price = price;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemcode() {
        return itemcode;
    }

    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printFormat() {
        System.out.println(itemname);
        System.out.println(itemcode);
        System.out.println(brand);
        System.out.println(price);

    }



    }
