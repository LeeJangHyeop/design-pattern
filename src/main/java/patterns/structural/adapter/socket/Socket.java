package patterns.structural.adapter.socket;

/**
 * Created by LeeJangHyeop on 2018. 7. 10..
 */
abstract public class Socket {
    int acceptVolt;
    String country;

    public int getAcceptVolt() {
        return acceptVolt;
    }

    public void setAcceptVolt(int acceptVolt) {
        this.acceptVolt = acceptVolt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
