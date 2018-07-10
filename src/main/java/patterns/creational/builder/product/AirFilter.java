package patterns.creational.builder.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class AirFilter extends Product {
    private String airFilterMaterial;

    public String getAirFilterMaterial() {
        return airFilterMaterial;
    }

    public void setAirFilterMaterial(String airFilterMaterial) {
        this.airFilterMaterial = airFilterMaterial;
    }

    @Override
    public String toString() {
        return "AirFilter{" +
                "airFilterMaterial='" + airFilterMaterial + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
