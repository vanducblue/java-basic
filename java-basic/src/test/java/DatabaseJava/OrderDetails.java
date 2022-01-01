package DatabaseJava;

public class OrderDetails {
    int OrderDetailID;
    int OrderID;
    int ProductID;
    int Quantity;

    @Override
    public String toString() {
        return "OrderDetailID: " + this.OrderDetailID + ", OrderID" + this.OrderID + ", ProductID: " + this.ProductID + ", Quantity: " + this.Quantity;
    }
    public int getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        OrderDetailID = orderDetailID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }




}
