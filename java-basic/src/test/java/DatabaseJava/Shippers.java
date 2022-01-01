package DatabaseJava;

public class Shippers {
    int ShipperID;
    String ShipperName;
    String Phone;

    @Override
    public String toString() {
        return "ShipperID: " + this.ShipperID + ", ShipperName: " + this.ShipperName + ", Phone: " + this.Phone;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String shipperName) {
        ShipperName = shipperName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }





}
