import java.util.Date;

public class Reserva {
    String localizador;
    Date fechaEmicion;
    Trayecto trayecto;

    public Reserva(String localizador, Date fechaEmicion, Trayecto trayecto) {
        this.localizador = localizador;
        this.fechaEmicion = fechaEmicion;
        this.trayecto = trayecto;
    }
}
