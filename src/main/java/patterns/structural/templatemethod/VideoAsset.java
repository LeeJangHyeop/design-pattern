package patterns.structural.templatemethod;

public class VideoAsset extends AbstractAsset {

    public VideoAsset(String thumbnailImageLink, int duration) {
        this.thumbnailImageLink = thumbnailImageLink;
        this.duration = duration;
    }

    private String thumbnailImageLink;

    private int duration;

    private static final int MIN_DURATION = 10;

    @Override
    void validate() {
        System.out.println("VideoAsset validate");
        if(thumbnailImageLink == null || "".equals(thumbnailImageLink)) {
            throw new RuntimeException("thumbnailImageLink is invalid");
        }

        if(duration < MIN_DURATION) {
            throw new RuntimeException("duration is invalid");
        }
    }

    @Override
    void create() {
        System.out.println("VideoAsset created");
    }

    @Override
    void postProcessing() {
        System.out.println("VideoAsset postProcessing");
    }

    @Override
    protected void hook() {
        System.out.println("VideoAsset hook");
    }
}
