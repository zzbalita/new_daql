package fpoly.huyndph40487.qlda_bantrsua.Model;

public class Shipper {
    private String name;
    private String phoneNumber;
    private String signal;

    public Shipper() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    public Shipper(String name, String phoneNumber, String signal) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.signal = signal;
    }

}
