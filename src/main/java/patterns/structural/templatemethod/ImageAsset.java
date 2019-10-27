package patterns.structural.templatemethod;

public class ImageAsset extends AbstractAsset {

    public ImageAsset(int width, int height, int displayRatio) {
        this.width = width;
        this.height = height;
        this.displayRatio = displayRatio;
    }

    private int width;
    private int height;

    private int displayRatio;

    @Override
    void validate() {
        System.out.println("ImageAsset validate");
        if(width/height != displayRatio) {
            throw new RuntimeException("ratio is invalid");
        }
    }

    @Override
    void create() {
        System.out.println("ImageAsset created");
    }

    @Override
    void postProcessing() {
        System.out.println("ImageAsset postProcessing");
    }

    @Override
    protected void hook() {
        System.out.println("ImageAsset hook");
    }
}
