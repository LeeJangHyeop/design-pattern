package patterns.structural.adapter.socket;

/**
 * Created by LeeJangHyeop on 2018. 7. 10..
 */
public class KoreanSocket extends Socket {
    public KoreanSocket() {
        this.acceptVolt = 220;
        this.country = "korean";
    }
}
