package pattern.builder.builder;

import pattern.builder.product.BagFilter;
import pattern.builder.product.Product;

import java.util.Date;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class BagFilterBuilder implements Builder{
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
        BagFilter bagFilter = new BagFilter();
        bagFilter.setName(this.name);
        bagFilter.setDescription(this.description);
        bagFilter.setUnit(this.unit);
        bagFilter.setPrice(this.price);
        bagFilter.setProductType(this.productType);
        bagFilter.setCreatedDate(this.createdDate);

        bagFilter.setBagFilterMaterial("BAGFILTER_MATERIAL");
        return bagFilter;
    }
}
