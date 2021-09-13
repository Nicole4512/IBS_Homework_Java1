package IBS_DZ1;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.IndexOutOfBoundsException;

 interface Box_use {
        ArrayList<Sweets> box = new ArrayList<Sweets>();

        static int size()
        {
            return box.size();
        }

        static void add(Sweets s)
        {
            box.add(s);
        }

        static void removeIndex (int i) throws IndexOutOfBoundsException
        {
            try {
                box.remove(i);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Удаление не произошло. Пожалуйста, повторите попытку, " +
                        "указав индекс от 0 до " + (IBS_DZ1.Box_use.size() - 1));
            }

        }

        static void showWeight (){
            float sum = 0;
            for (int i = 0; i < box.size(); i++){
                sum += box.get(i).weight;
            }
            System.out.println("Вес коробки: " + sum);
        }

        static  int showPrice(){
            int sum = 0;
            for (int i = 0; i < box.size(); i++){
                sum += box.get(i).price;
            }
            System.out.println("Цена коробки: "+sum);
            return sum;
        }

        static void showAll(){
            for(Sweets s : box){
                System.out.println(s);
            }
        }

        static int getPrice(){
            int sum = 0;
            for (int i = 0; i < box.size(); i++){
                sum += box.get(i).price;
            }

            return sum;
        }

        static void sort (){
            Collections.sort(box, Sweets.Compare_by_Weight);
        }


        static void delMinWeight (int sum) {
            sort();
            try {
                while (getPrice() >= sum) {
                    removeIndex(0);
                }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Упс, ваша сумма равна нулю, попробуйте еще раз");
            }
        }
    }

