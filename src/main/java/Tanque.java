public class Tanque {
    Auto auto;
    private double capacidadTotal;
    private double capacidadReal;
    private double porcentajeDisponible = this.capacidadReal/this.capacidadTotal;
    public Tanque (double capacidadTotal,double capacidadReal) {
        this.capacidadTotal = capacidadTotal;
        this.capacidadReal = capacidadReal;
    }

    public boolean estaEnReserva() {
        return (this.porcentajeDisponible < 0.1);
        }
    public boolean estaProximoReserva()   {
        return ( this.porcentajeDisponible > 0.1 && this.porcentajeDisponible < 0.15);
    }
    void consumirCombustible(double consumo) {
        this.capacidadReal -= this.capacidadReal*(consumo/100);
    }
}
