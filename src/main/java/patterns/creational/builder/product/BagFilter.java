package patterns.creational.builder.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class BagFilter extends Product {
    private String bagFilterMaterial;

    public String getBagFilterMaterial() {
        return bagFilterMaterial;
    }

    public void setBagFilterMaterial(String bagFilterMaterial) {
        this.bagFilterMaterial = bagFilterMaterial;
    }

    @Override
    public String toString() {
        return "BagFilter{" +
                "bagFilterMaterial='" + bagFilterMaterial + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
