package patterns.structural.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class TemplateMethodMain {
    public static void main(String[] args) {
        ImageAsset imageAsset = new ImageAsset(600, 200, 3);
        VideoAsset videoAsset = new VideoAsset("http://daum.net", 20);

        List<AbstractAsset> assetList = new ArrayList<>();
        assetList.add(imageAsset);
        assetList.add(videoAsset);

        assetList.stream()
                .forEach(a -> a.build());
    }
}
