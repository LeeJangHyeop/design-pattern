package pattern.prototype.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class BagFilter extends Product {

    private String bagFilterMaterial;

    public BagFilter() {
        super();
    }

    public BagFilter(BagFilter bagFilter) {
        super(bagFilter);
        if(bagFilter != null) {
            this.bagFilterMaterial = bagFilter.getBagFilterMaterial();
        }
    }

    @Override
    public Product myClone() {
        return new BagFilter(this);
    }

    public String getBagFilterMaterial() {
        return bagFilterMaterial;
    }

    public void setBagFilterMaterial(String bagFilterMaterial) {
        this.bagFilterMaterial = bagFilterMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BagFilter)) return false;
        if (!super.equals(o)) return false;

        BagFilter bagFilter = (BagFilter) o;

        return bagFilterMaterial.equals(bagFilter.bagFilterMaterial);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bagFilterMaterial.hashCode();
        return result;
    }
}
