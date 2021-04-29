package exemplointerface;

public class Main {

    public static void main(String[] args) {
        TV minhaTV = new TV(220);

        minhaTV.getDeviceSpec();
        minhaTV.on();

        minhaTV.getDeviceSpec();
        minhaTV.mute();

        minhaTV.getDeviceSpec();
        minhaTV.mute();
        minhaTV.getDeviceSpec();

        IEletronico tomada = minhaTV;

        tomada.getDeviceSpec();
        tomada.off();
        tomada.getDeviceSpec();

        ITelevisao cr = minhaTV;
        cr.volumeUp();
        tomada.getDeviceSpec();
    }

}
