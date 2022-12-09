import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Items> i1=new ArrayList<>();
        Items item1=new Items("Tshirt",2100,"Dior",20000);
        Items item2=new Items("Nerd",5666,"levis",12345);
        Items item3=new Items("pant",3000, "Supreme",10000);
        Items item4=new Items("jacket",4000,"TheNorthFace",5000);
        Items item5=new Items("hoodie",3500,"akkosozz",3500);
        i1.add(item1);
        i1.add(item2);
        i1.add(item3);
        i1.add(item4);
        i1.add(item5);

        ArrayList<Orders> o2=new ArrayList<>();
        Orders order1=new Orders(2100,1,20000,2);
        Orders order2=new Orders(3000,2,10000,1);
        o2.add(order1);
        o2.add(order2);


        ArrayList<Users> u1=new ArrayList<>();
        Users user1=new Users("Ankit",984232432,18);
        u1.add(user1);

        item2.printFormat();
        System.out.println(item2);




    }
}
