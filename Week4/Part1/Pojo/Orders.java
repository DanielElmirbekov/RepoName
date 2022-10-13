package Part1.Pojo;

import java.util.Date;

public class Orders{
    private long OrdersId;
    private long CarId;
    private long CustomersId;
    private Date Date;

    public Orders(){

    }
    public Orders(long ordersId, long carId, long customersId, Date date){
        OrdersId = ordersId;
        CarId = carId;
        CustomersId = customersId;
        Date = date;
    }

    public void setOrdersId(long ordersId) {
        OrdersId = ordersId;
    }

    public long getOrdersId() {
        return OrdersId;
    }

    public void setCarId(long carId) {
        CarId = carId;
    }

    public long getCarId() {
        return CarId;
    }

    public void setCustomersId(long customersId) {
        CustomersId = customersId;
    }

    public long getCustomersId() {
        return CustomersId;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public java.util.Date getDate() {
        return Date;
    }
}
