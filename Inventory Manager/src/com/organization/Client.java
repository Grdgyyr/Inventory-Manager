package com.organization;

/**
 *
 * @author Jose
 */
public class Client extends Organization{
    private String clientPaymentMethod;
    private String clientPaymentType;
    
    public Client(String orgName,String orgAddress,String orgAddress1,
            String orgContact,String orgTelNum,String orgMobile,String orgFax,
            String orgEmail,String orgType, String clientPaymentMethod, String clientPaymentType){
        super(orgName, orgAddress, orgAddress1, orgContact, 
                orgTelNum, orgMobile, orgFax, orgEmail, orgType);
        
        this.clientPaymentMethod = clientPaymentMethod;
        this.clientPaymentType = clientPaymentType;
        
    }
    
    
    public void newClient(String orgName,String orgAddress,String orgAddress1,
            String orgContact,String orgTelNum,String orgMobile,String orgFax,
            String orgEmail,String orgType, String clientPaymentMethod, String clientPaymentType){      
        
        
        
        this.clientPaymentMethod = clientPaymentMethod;
        this.clientPaymentType = clientPaymentType;
        
        super.newOrganization(orgName, orgAddress, orgAddress1, orgContact, 
                orgTelNum, orgMobile, orgFax, orgEmail, orgType);
    }
    
    public String getNewClient(){
        return "'" + clientPaymentMethod + "' , '" + clientPaymentType + "', null, null, null,null,null,null,null" ;
    }
    
    public String getNewClientUpdate(String key){
        return "CLIENT_PAY_METHOD = '" + clientPaymentMethod + "', CLIENT_PAY_TYPE = '" + clientPaymentType 
                + "' WHERE CLIENT_ID = '" + key + "'";
    }
    
    
    
}
