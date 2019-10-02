package patterns.structural.adapter.clazz.client;

import patterns.structural.adapter.clazz.plug.*;

/**
 * Created by LeeJangHyeop on 2018. 7. 10..
 */
public class JapanessToKoreanPlugAdapter {
    int inputVolt = 110;
    int outputVolt = 220;

    Plug plug;

    public JapanessToKoreanPlugAdapter(Plug plug) {
        if(this.inputVolt == plug.getVolt()) {
            this.plug = plug;
            doAdapt();
            System.out.println("Adapter changed " + inputVolt + "V " + plug.getCountry() + " plug to " + outputVolt + "V " + plug.getCountry() + " plug");
        }
        else {
            System.out.println("This adapter is not fit to " + plug.getVolt() + "V " + plug.getCountry() + " plug");
        }
    }

    public void doAdapt() {
        this.plug.setVolt(outputVolt);
    }
}
