package exemplointerface;

public class TV implements ITelevisao, IEletronico {

    private int tensaoEletrica;
    private int canalAtual;
    private boolean status;
    private int volume;
    private int input;
    private boolean muteStatus;
    private int volumeAux;

    public TV(int tensao) {
        this.tensaoEletrica = tensao;
        this.canalAtual = 2;
        this.status = false;
        this.volume = 3;
        this.input = 0;
        this.muteStatus = false;
    }

    public int getTensaoEletrica() {
        return this.tensaoEletrica;
    }

    public int getCanalAtual() {
        return this.canalAtual;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setTensaoEletrica(int t) {
        this.tensaoEletrica = t;
    }

    public void setCanalAtual(int c) {
        this.canalAtual = c;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //métodos exigidos por ITelevisao
    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public void mute() {
        if (!this.muteStatus) {
            this.volumeAux = this.volume;
            this.volume = 0;
            this.muteStatus = true;
        } else {
            this.volume = this.volumeAux;
            this.muteStatus = false;
        }
    }

    public void changeChannel(int chanell) {
        this.canalAtual = chanell;
    }

    public void switchInput(int input) {
        this.input = input;
    }

    //métodos da interface IEletronico
    public void on() {
        this.status = true;
    }

    public void off() {
        this.status = false;
    }

    public void getDeviceSpec() {
        System.out.println("Status: " + (this.status ? "Ligado" : "Desligado"));
        System.out.println("Tensão: " + this.getTensaoEletrica());
        System.out.println("Canal: " + this.canalAtual);
        System.out.println("Input: " + this.input);
        System.out.println("Volume: " + this.volume);
        System.out.println();
    }
}
