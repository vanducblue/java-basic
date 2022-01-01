package DatabaseJava;

public class Controller {
    public static void main(String[] args){
        Customers customer1 = new Customers();
        customer1.setCustomerID(1);
        customer1.setCustomerName("Alfreds Futterkiste");
        customer1.setContactName("Maria Anders");
        customer1.setAddress("Obere Str. 57");
        customer1.setCity("Berlin");
        customer1.setPostalCode("12209");
        customer1.setCountry("Germany");

        System.out.println(customer1);

        Categories category1 = new Categories();
        category1.setCategoryID(1);
        category1.setCategoryName("Beverages");
        category1.setDescription("Soft drinks, coffees, teas, beers, and ales");

        System.out.println(category1);

        Employees emp1 = new Employees();
        emp1.setEmployeeID(1);
        emp1.setLastName("Davolio");
        emp1.setFirstName("Nancy");
        emp1.setBirthDate("1968-12-08");
        emp1.setPhoto("EmpID1.pic");
        emp1.setNotes("Education includes a BA in psychology from Colorado State University. She also completed (The Art of the Cold Call). Nancy is a member of 'Toastmasters International'.");

        System.out.println(emp1);

        OrderDetails oderD1 = new OrderDetails();
        oderD1.setOrderDetailID(1);
        oderD1.setOrderID(10248);
        oderD1.setProductID(11);
        oderD1.setQuantity(12);

        System.out.println(oderD1);

        Orders order1 = new Orders();
        order1.setOrderID(10248);
        order1.setCustomerID(90);
        order1.setEmployeeID(5);
        order1.setOrderDate("1996-07-04");
        order1.setShipperID(3);

        System.out.println(order1);

       Products product1 = new Products();
       product1.setProductID(1);
       product1.setProductName("Chais");
       product1.setSupplierID(1);
       product1.setCategoryID(1);
       product1.setUnit("10 boxes x 20 bags");
       product1.setPrice(18.0);

        System.out.println(product1);

        Shippers ship1 = new Shippers();
        ship1.setShipperID(1);
        ship1.setShipperName("Speedy Express");
        ship1.setPhone("(503) 555-9831");

        System.out.println(ship1);

        Suppliers sup1 = new Suppliers();
        sup1.setSupplierID(1);
        sup1.setSupplierName("Exotic Liquid");
        sup1.setContactName("Charlotte Cooper");
        sup1.setAddress("49 Gilbert St.");
        sup1.setCity("Londona");
        sup1.setPostalCode("EC1 4S");
        sup1.setCountry("UK");
        sup1.setPhone("(171) 555-2222");

        System.out.println(sup1);
    }
}
