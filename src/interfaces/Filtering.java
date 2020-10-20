package interfaces;


import com.company.Product;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Filtering {

    public void filterByAny(List list);
    public default List filterByName(List<Product> list, String name){
        List<Product> filteredList;
        filteredList = list.stream().filter(x->x.equals(name)).collect(Collectors.toList());
        return filteredList;
    }
    public default void filterBySuperieurPrice(){
       //List<Product> filteredList;
//        filteredList = list.stream().filter(x->{return x.getPrice() >= (price);}).collect(Collectors.toList());
//        return filteredList;
        System.out.println("xxxx");
        System.out.println("xxxx");
    }
}
