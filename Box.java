package IBS_DZ1;


public class Box implements Box_use{
    public static void main(String[] args) {
        Muffin muffin = new Muffin("Маффин с шоколадом", 60, 150, 123);
        Candy candy = new Candy("Леденец", 34, 30, 124);
        Marmalade marmalade = new Marmalade("БонПари", 200, 250, 125);
        Cookie cookie = new Cookie("Oreo", 300,230,167);
        Chocolate chocolate = new Chocolate("Milka",100,90,222);
        Chocolate chocolate1 = new Chocolate("Milka",100,90,222);

        System.out.println(chocolate.equals(chocolate1));

        Box_use.add(muffin);
        Box_use.add(candy);
        Box_use.add(marmalade);
        Box_use.add(chocolate);
        Box_use.add(cookie);
        Box_use.add(chocolate);

        Box_use.removeIndex(5);


        Box_use.showAll();
        Box_use.showWeight();
        Box_use.showPrice();


        Box_use.delMinWeight(300);


        Box_use.showPrice();
        Box_use.showAll();




    }
}
