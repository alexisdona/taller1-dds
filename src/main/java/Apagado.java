public class Apagado implements Estado {
    @Override
    public void encender(Auto auto) {
        auto.estado = new Encendido();
    }
    @Override
    public void apagar(Auto auto) {
        throw new YaApagadoException("El auto ya está apagado");
    }
    @Override
    public boolean estaEnReserva(Auto auto) {
        throw new YaApagadoException("El auto está apagado");
    }
    @Override
    public boolean estaProximoReserva(Auto auto) {
        throw new YaApagadoException("El auto está apagado");

    }

    @Override
    public boolean estaCaliente(Auto auto) {
        return false;
    }
}
