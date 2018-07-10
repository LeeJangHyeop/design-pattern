package patterns.structural.adapter.client;

import patterns.structural.adapter.plug.JapanessPlug;
import patterns.structural.adapter.plug.KoreanPlug;
import patterns.structural.adapter.socket.KoreanSocket;

/**
 * Created by LeeJangHyeop on 2018. 7. 10..
 */
public class AdapterMain {
    public static void main(String[] args) {
        // plugs
        KoreanPlug koreanPlug = new KoreanPlug();
        JapanessPlug japanessPlug = new JapanessPlug();

        // a socket
        KoreanSocket koreanSocket = new KoreanSocket();

        // normal case
        koreanPlug.insert(koreanSocket);

        // before using adapter
        japanessPlug.insert(koreanSocket);

        // a adapter not fit
        JapanessToKoreanPlugAdapter adapterNotFit = new JapanessToKoreanPlugAdapter(koreanPlug);

        // a adapter
        JapanessToKoreanPlugAdapter adapter = new JapanessToKoreanPlugAdapter(japanessPlug);

        // After using adapter
        japanessPlug.insert(koreanSocket);
    }
}
