package com.order;

import com.product.product;
import java.util.Date;

/**
 *
 * @author Jose
 */
public class Order extends product{
    
    private String OrderName;
    private String OrderType;
    private String OrderDate;
    private String OrderDeadline;
    private String OrderCode;
    
    public void newOrder(String OrderName, String OrderType, 
            String OrderDate, String OrderDeadline, String OrderCode){
        this.OrderName = OrderName;
        this.OrderType = OrderType;
        this.OrderDate = OrderDate;
        this.OrderDeadline = OrderDeadline;
        this.OrderCode = OrderCode;
    }
    
    public String getNewOrder(){
        return "'" + OrderName + "' , '" + OrderType + "' , '" +  
                OrderCode + "' , '" + OrderDate + "' , '" + OrderDeadline + "'";
    }
    
    public String getNewOrderUpdate(String key){
        return "ORDER_NAME = '" + OrderName + "', ORDER_TYPE = '" + OrderType 
                + "', ORDER_DATE = '" + OrderDate + "', ORDER_DEADLINE = '" + OrderDeadline 
                + "', ORDER_CODE = '" + OrderCode
                + "' WHERE ORDER_ID = '" + key + "'";
    }
    
}
