package patterns.structural.adapter.clazz.plug;

import patterns.structural.adapter.clazz.socket.Socket;

/**
 * Created by LeeJangHyeop on 2018. 7. 10..
 */
abstract public class Plug {
    int volt;
    String country;

    public void insert(Socket socket) {
        if(this.fit(socket)) {
            System.out.println(this.volt + "V " + this.country + " plug is inserted into " + socket.getAcceptVolt() + "V " + socket.getCountry()+ " socket");
        }
        else {
            System.out.println(this.volt + "V " + this.country + " plug is not fit to " + socket.getAcceptVolt() + "V " + socket.getCountry()+ " socket");
        }
    }

    boolean fit(Socket socket) {
        return this.volt == socket.getAcceptVolt();
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
