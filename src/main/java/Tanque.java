public class Tanque {
    Auto auto;
    double capacidadTotal;
    double capacidadReal;
    double porcentaje = this.capacidadReal/this.capacidadTotal;
    public boolean estaEnReserva() {
        return (this.porcentaje < 0.1);
        }
    public boolean estaProximoReserva()   {
        return ( this.porcentaje > 0.1 && this.porcentaje < 0.15);
    }
    void consumirCombustible(double consumo) {
        this.capacidadReal -= this.capacidadReal*(consumo/100);
    }
}
