package model;

public class Orders {
    int itemcode;
    int userid;
    int price;
    int quantity;

    public Orders(int itemcode, int userid, int price, int quantity) {
        this.itemcode = itemcode;
        this.userid = userid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemcode() {
        return itemcode;
    }

    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
