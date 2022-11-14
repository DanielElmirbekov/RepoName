package Part1.Pojo;

public class Customers {
    private long CustomersId;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerEmail;
    private String PhoneNumber;

    public Customers(){

    }

    public Customers(long customersId, String customerName, String customerAddress, String customerEmail, String phoneNumber){
        CustomersId = customersId;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        CustomerEmail = customerEmail;
        PhoneNumber = phoneNumber;
    }

    public void setCustomersId(long customersId){
        CustomersId = customersId;
    }
    public long getCustomersId() {
        return CustomersId;
    }
    public void setCustomerName(String customerName){
        CustomerName = customerName;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerAddress (String customerAddress){
        CustomerAddress = customerAddress;
    }
    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
