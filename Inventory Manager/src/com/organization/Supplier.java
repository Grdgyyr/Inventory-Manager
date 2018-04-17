package com.organization;

/**
 *
 * @author Jose
 */
public class Supplier extends Organization {
    private String supplierBusinessType;
    private String supplierSupplies;
    private String supplierTIN;
    
    
    
    public Supplier(String orgName,String orgAddress,String orgAddress1,
            String orgContact,String orgTelNum,String orgMobile,String orgFax,
            String orgEmail,String orgType,String supplierBusinessType, String supplierSupplies, String supplierTIN){
        super(orgName, orgAddress, orgAddress1, orgContact, 
                orgTelNum, orgMobile, orgFax, orgEmail, orgType);
        
        this.supplierBusinessType = supplierBusinessType;
        this.supplierSupplies = supplierSupplies;
        this.supplierTIN = supplierTIN;
        
    }
    
    
    public void newSupplier( String supplierBusinessType, String supplierSupplies, String supplierTIN){           
        
        this.supplierBusinessType = supplierBusinessType;
        this.supplierSupplies = supplierSupplies;
        this.supplierTIN = supplierTIN;
        
        
    }
    
    public String getNewSupplier(){
        return  "'" + supplierBusinessType + "' , '" + supplierSupplies + "' , '" + supplierTIN + "'";
    }
    
     public String getNewSupplierUpdate(String key){
        return "SUPP_BUS_TYPE = '" + supplierBusinessType + "', SUPP_SUPPLIES = '" + supplierSupplies 
                + "' , SUPP_TIN = '" + supplierTIN +  "' WHERE SUPP_ID = '" + key + "'";
    }
    
}
