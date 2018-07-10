package patterns.creational.prototype.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class AirFilter extends Product {

    private String airFilterMaterial;

    public AirFilter() {
        super();
    }

    public AirFilter(AirFilter airFilter) {
        super(airFilter);
        if(airFilter != null) {
            this.airFilterMaterial = airFilter.getAirFilterMaterial();
        }
    }

    @Override
    public Product myClone() {
        return new AirFilter(this);
    }

    public String getAirFilterMaterial() {
        return airFilterMaterial;
    }

    public void setAirFilterMaterial(String airFilterMaterial) {
        this.airFilterMaterial = airFilterMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirFilter)) return false;
        if (!super.equals(o)) return false;

        AirFilter airFilter = (AirFilter) o;

        return airFilterMaterial.equals(airFilter.airFilterMaterial);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + airFilterMaterial.hashCode();
        return result;
    }
}
