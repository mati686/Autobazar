import java.time.LocalDate;

public class Owner {
    String name;
    String address;
    boolean vip = false;
    LocalDate birthdate = null;

    public Owner (String name, String address, LocalDate birthdate) {
        this(name, address, false, birthdate);
    }
    public Owner (String name, String address, boolean vip, LocalDate birthdate) {
        this.name = name;
        this.address = address;
        this.vip = false;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
