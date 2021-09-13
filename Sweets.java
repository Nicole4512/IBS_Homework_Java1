package IBS_DZ1;


import java.util.Comparator;
import java.util.Scanner;
;

public abstract class Sweets {
    String name;
    int price;
    int weight;
    int unique;

    Sweets (String name, int price, int weight, int unique)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.unique = unique;
    }

    public int getWeight(){
        return weight;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return name.equals(sweets.name) && price == sweets.price && weight == sweets.weight && unique == sweets.unique;
    }

    @Override
    public String toString ()
    {
        return "Название: " + this.name + " | Цена: " + this.price + " | Вес: " + this.weight
                + " | Уникальный параметр: " + this.unique;
    }


    public static final Comparator<Sweets> Compare_by_Weight = new Comparator<Sweets>() {
        @Override
        public int compare(Sweets sw1, Sweets sw2) {
                return sw1.getPrice() - sw2.getPrice();
        }
    };

    public static final Comparator<Sweets> Compare_by_Price = new Comparator<Sweets>() {
        @Override
        public int compare(Sweets sw1, Sweets sw2) {
            return sw1.getPrice() - sw2.getPrice();
        }
    };



}









