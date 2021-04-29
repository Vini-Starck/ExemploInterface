package exemplointerface;

public class Microondas implements IMicroondas, IEletronico {

    private int potencia;
    private int timer;
    private int tensao;
    private boolean status;

    public Microondas(int tensao) {
        this.timer = 0;
        this.tensao = tensao;
        this.status = true;
        this.potencia = 3;
    }

    public int getTimer() {
        return this.timer;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getTensao() {
        return this.tensao;
    }

    public void setTimer(int t) {
        this.timer = t;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void setTensao(int t) {
        this.tensao = t;
    }

    //métodos das interface IMicroondasvoid 
    public void ligaFuncaoPipoca() {
        this.timer += 180;
        this.status = true;
    }

    public void timer1Min() {
        this.timer += 60;
    }

    public void setPotencia(int p) {
        this.potencia = p;
    }

    public int getPotencia() {
        return this.potencia;
    }

    //métodos da interface IEletronico
    public void on() {
        this.status = true;
    }

    public void off() {
        this.status = false;
        this.timer = 0;
    }

    public void getDeviceSpec() {
        System.out.println("Tensao: " + this.getTensao());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Timer: " + this.getTimer());
    }
}
