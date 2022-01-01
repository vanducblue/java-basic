package DatabaseJava;

public class Products {
    int ProductID;
    String ProductName;
    int SupplierID;
    int CategoryID;
    String Unit;
    Double Price;

    @Override
    public String toString() {
        return "ProductID: " + this.ProductID + ", ProductName: " + this.ProductName + ", SupplierID: " + this.SupplierID + ", CategoryID: " + this.CategoryID + ", Unit: " + this.Unit + ", Price: " + this.Price;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }




}
