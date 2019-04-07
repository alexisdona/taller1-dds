public class Motor {
    double temperatura;
    //Auto auto;
    public boolean estaCaliente() {
        return this.temperatura>95;

    }
    public void modificarTemperatura(double valor) {
        this.temperatura+=valor;
    }
    public void setTemperatura(double valor) {
        this.temperatura = valor;
    }
}
