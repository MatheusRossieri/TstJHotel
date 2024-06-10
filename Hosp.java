//Nome: Matheus José Rossieri  RA: 2600986

public class Hosp extends Pessoa {
    
    private int reserva;
    private String data_checkin;
    private String data_checkout;
    private int uh;

    public int getReserva() {
        return reserva;
    }
    public void setReserva(int reserva) {
        this.reserva = reserva;
    }
    public String getData_checkin() {
        return data_checkin;
    }
    public void setData_checkin(String data_checkin) {
        this.data_checkin = data_checkin;
    }
    public String getData_checkout() {
        return data_checkout;
    }
    public void setData_checkout(String data_checkout) {
        this.data_checkout = data_checkout;
    }
    public int getUh() {
        return uh;
    }
    public void setUh(int uh) {
        this.uh = uh;
    }

}
