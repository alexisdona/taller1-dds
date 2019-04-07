public interface Estado {
    public void encender(Auto auto);
    void apagar(Auto auto);
    void acelerar(Auto auto,int velocidad);
    void detener(Auto auto);
    boolean estaEnReserva(Auto auto);
    boolean estaProximoReserva(Auto auto);
    boolean estaCaliente(Auto auto);

}
