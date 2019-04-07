
public class Encendido implements Estado {

    @Override
    public void apagar(Auto auto) {
        auto.estado = new Apagado();
    }

    @Override
    public void encender(Auto auto) {
        throw new YaEncendidoException("Ya estoy encendido, no me puedo encender");
    }

    @Override
    public void acelerar(Auto auto, int velocidad) {
        auto.setVelocidad(velocidad);

    }

    @Override
    public void detener(Auto auto) {
        auto.setVelocidad(0);
    }

    @Override
    public boolean estaEnReserva(Auto auto) {
        return auto.tieneTanqueEnReserva();
    }
    @Override
    public boolean estaProximoReserva(Auto auto) {
        return auto.tieneTanqueProximoReserva();
    }

    @Override
    public boolean estaCaliente(Auto auto) {
        return auto.motor.estaCaliente();
    }

}

