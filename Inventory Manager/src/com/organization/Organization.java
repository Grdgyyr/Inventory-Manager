
package com.organization;

/**
 *
 * @author Jose III
 */
public class Organization {
    
    private String orgName;
    private String orgAddress;
    private String orgAddress1;
    private String orgContact;
    private String orgTelNum;
    private String orgMobile;
    private String orgFax;
    private String orgEmail;
    private String orgType;
    
    public  Organization(String orgName,String orgAddress,String orgAddress1,
            String orgContact,String orgTelNum,String orgMobile,String orgFax,
            String orgEmail,String orgType){
        
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgAddress1 = orgAddress1;
        this.orgContact = orgContact;
        this.orgTelNum = orgTelNum;
        this.orgMobile = orgMobile;
        this.orgFax = orgFax;
        this.orgEmail = orgEmail;
        this.orgType = orgType;
    }
    
    public void newOrganization(String orgName,String orgAddress,String orgAddress1,
            String orgContact,String orgTelNum,String orgMobile,String orgFax,
            String orgEmail,String orgType){
        
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgAddress1 = orgAddress1;
        this.orgContact = orgContact;
        this.orgTelNum = orgTelNum;
        this.orgMobile = orgMobile;
        this.orgFax = orgFax;
        this.orgEmail = orgEmail;
        this.orgType = orgType;
        
    }
    
    public String getNewOrganization(){
        return "'" + orgName + "'" + "," + "'" + orgAddress + "'" + "," + "'" + orgAddress1 + "'" + 
                "," + "'" + orgContact + "'" + "," + "'" + orgTelNum + "'" + "," + "'" + orgMobile + 
                "'" + "," + "'" + orgFax + "'" + "," + "'" + orgEmail + "'" + "," + "'" + orgType + "'";
    }
    public String getUpdateOrganization(String key){
        return "ORG_NAME = '" + orgName + "', ORG_ADDRESS1 = '" + orgAddress 
                + "' , ORG_ADDRESS2 = '" + orgAddress1 + "' , ORG_CONTACT = '" + orgContact + "' , ORG_TELNUM = '" 
                + orgTelNum + "' , ORG_MOBILE = '" + orgMobile + "' , ORG_FAX = '" + orgFax 
                + "' , ORG_EMAIL = '" + orgEmail + "' , ORG_TYPE = '" + orgType 
                + "' WHERE ORG_ID = '" + key + "'";
    }
    
    
    
    
    
}
