package patterns.creational.prototype.product;

import java.util.Date;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
abstract public class Product {
    protected String name;
    protected String description;
    protected String unit;
    protected Long price;
    protected String productType;
    protected Date createdDate;

    public Product() {

    }

    public Product(Product product) {
        this.name = product.getName();
        this.description = product.getDescription();
        this.unit = product.getUnit();
        this.price = product.getPrice();
        this.productType = product.getProductType();
        this.createdDate = product.getCreatedDate();
    }

    abstract public Product myClone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        if (!unit.equals(product.unit)) return false;
        if (!price.equals(product.price)) return false;
        if (!productType.equals(product.productType)) return false;
        return createdDate.equals(product.createdDate);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + unit.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + productType.hashCode();
        result = 31 * result + createdDate.hashCode();
        return result;
    }
}
