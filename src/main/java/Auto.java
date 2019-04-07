public class Auto {
    Estado estado;
    Tanque tanque;
    Motor motor;
    int velocidad;
    double consumo = 133/1000;

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
        estado.encender(this);
        motor.setTemperatura(0);
    }
    public void acelerar(int velocidad) {
        estado.acelerar(this, velocidad);
        motor.modificarTemperatura(0.2*getVelocidad());
    }
    public void detener() {
        motor.modificarTemperatura(0.04*getVelocidad());
        estado.detener();
    }
    public boolean estaEnReserva() {
        estado.estaEnReserva(this);

    }
    public boolean estaProximoReserva() {
        tanque.estaProximoReserva();
    }
    public boolean estaCalilente() {
        estado.estaCaliente();

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

