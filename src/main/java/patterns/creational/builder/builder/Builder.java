package patterns.creational.builder.builder;

import patterns.creational.builder.product.Product;

import java.util.Date;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public interface Builder {
    void setName(String name);
    void setDescription(String description);
    void setUnit(String unit);
    void setPrice(Long price);
    void setProductType(String productType);
    void setCreatedDate(Date createdDate);
    Product build();
}
