package IBS_DZ1;


import java.util.Comparator;
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
        public int compare(Sweets lhs, Sweets rhs) {
            return lhs.getWeight() - rhs.getWeight();
        }
    };
}









