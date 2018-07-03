package pattern.prototype.client;

import pattern.prototype.product.AirFilter;
import pattern.prototype.product.BagFilter;
import pattern.prototype.product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class PrototypeMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        List<Product> productListCopy = new ArrayList<>();

        AirFilter airFilter = new AirFilter();
        airFilter.setName("AirFilter 1");
        airFilter.setCreatedDate(new Date());
        airFilter.setDescription("This is AirFilter 1");
        airFilter.setPrice(500L);
        airFilter.setProductType("AirFilter");
        airFilter.setUnit("cm");
        airFilter.setAirFilterMaterial("AirFilterMaterial");

        BagFilter bagFilter = new BagFilter();
        bagFilter.setName("BagFilter 1");
        bagFilter.setCreatedDate(new Date());
        bagFilter.setDescription("This is BagFilter 1");
        bagFilter.setPrice(50000L);
        bagFilter.setProductType("BagFilter");
        bagFilter.setUnit("m");
        bagFilter.setBagFilterMaterial("BagfilterMaterial");

        productList.add(airFilter);
        productList.add(bagFilter);

        cloneAndCompare(productList, productListCopy);
    }

    static void cloneAndCompare(List<Product> list, List<Product> copyList) {
        for(int i=0;i<list.size();i++) {
            copyList.add(list.get(i).myClone());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != copyList.get(i)) {
                System.out.println(i + ": Product are different objects (yay!)");
                if (list.get(i).equals(copyList.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Product objects are the same (booo!)");
            }
        }
    }
}
