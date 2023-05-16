import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> arrayList=new ArrayList<>();
        arrayList.add( new City(2,"Kyrgyzstan", "Bishkek", 784884994,1987));
        arrayList.add(new City(3, "Kazakstan", "Astana", 234474747,1995));
        arrayList.add(new City(4, "Uzbekistan", "Tashkent", 234452345, 1990));
        arrayList.add(new City(5,"Tadjikistan", "Dushanbe",1545655,1993));
       arrayList.add( new City(6, "Ajerbaijan", "Baku",234245345,1989));
        arrayList.add(new City( 1,"Russia","Moskva",102990304,1900));
        TreeSet<City> integers = new TreeSet<>();
        for (City i : arrayList) {
            if (i.getCode() % 2 != 0){
                integers.add(i);
            }
        }
        for (City city : integers) {
            System.out.println(city);
        }


    }
}