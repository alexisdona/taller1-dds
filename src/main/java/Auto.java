public class Auto {
    public Estado estado;
    private Tanque tanque;
    public Motor motor;
    private int velocidad;
    private double consumo = 133/1000;

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return this.velocidad;
    }
    public void encender() {
        estado.encender(this);
        motor.setTemperatura(70);
        tanque.consumirCombustible(0.001);
    }
    public void apagar() {
        estado.apagar(this);
        motor.setTemperatura(0);
    }
    public void acelerar(int velocidad) {
        estado.acelerar(this, velocidad);
        motor.modificarTemperatura(0.2*getVelocidad());
    }
    public void detener() {
        motor.modificarTemperatura(0.04*getVelocidad());
        estado.detener(this);
    }
    public boolean estaEnReserva() {
       return estado.estaEnReserva(this);
    }
    public boolean estaProximoReserva() {
       return tanque.estaProximoReserva();
    }
    public boolean estaCalilente() {
      return estado.estaCaliente(this);

    }
    public boolean tieneTanqueEnReserva(){
        return this.tanque.estaEnReserva();
    }
    public boolean tieneTanqueProximoReserva(){
        return this.tanque.estaProximoReserva();
    }
    public boolean tieneMotorCaliente() {
        return this.motor.estaCaliente();
    }
    public void activarElectro() {
        if(motor.estaCaliente()) {
            motor.modificarTemperatura(-15);
        }

    }


}

//ver excepciones bien
//hacer test
//mandar repo para correcciones al grupo.
//la resoluciones está en el repo publico dds-utnfrba-17/granviaje
//email de docente: ezequieloscarescobar2@gmail.com

