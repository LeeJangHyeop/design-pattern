package patterns.creational.builder.builder;

import patterns.creational.builder.product.AirFilter;
import patterns.creational.builder.product.Product;

import java.util.Date;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class AirFilterBuilder implements Builder{
    private String name;
    private String description;
    private String unit;
    private Long price;
    private String productType;
    private Date createdDate;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public Product build() {
        AirFilter airFilter = new AirFilter();
        airFilter.setName(this.name);
        airFilter.setDescription(this.description);
        airFilter.setUnit(this.unit);
        airFilter.setPrice(this.price);
        airFilter.setProductType(this.productType);
        airFilter.setCreatedDate(this.createdDate);

        airFilter.setAirFilterMaterial("AIRFILTER_MATERIAL");
        return airFilter;
    }
}
