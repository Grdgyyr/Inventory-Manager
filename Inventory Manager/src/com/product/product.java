
package com.product;

import com.organization.Organization;
import java.security.SecureRandom;



/**
 *
 * @author Jose III
 */
public class product  {
    
    private String productName;
    private String productCode;
    private String productDesc;
    private double productNet;
    private double productGross;
    private int productStack;
    private String productManufacturer;
    private String productModel;
    private String productBarcode;
    private String productType;
    
    private final double VAT = 0.12;
    
    public product(String productName, String productCode, String productDesc, 
            double productNet, double productGross, int productStack, 
            String productManufacturer, String productModel, 
            String productBarcode, String productType){
        
        this.productName = productName;
        this.productCode = productCode;
        this.productDesc = productDesc;
        this.productNet = productNet;
        this.productGross = productGross;
        this.productStack = productStack;
        this.productManufacturer = productManufacturer;
        this.productModel = productModel;
        this.productBarcode = productBarcode;
        this.productType = productType;
         
    }
    
    public product(){
        
    }
    
    public void newProduct(String productName, String productCode, String productDesc, 
            double productNet, double productGross, int productStack, 
            String productManufacturer, String productModel, 
            String productBarcode, String productType){
        
        this.productName = productName;
        this.productCode = productCode;
        this.productDesc = productDesc;
        this.productNet = productNet;
        this.productGross = productGross;
        this.productStack = productStack;
        this.productManufacturer = productManufacturer;
        this.productModel = productModel;
        this.productBarcode = productBarcode;
        this.productType = productType;
        
        
    }
    
    public String getNewProduct(){
        return "'" + productName +"' , '"+ productCode +"' , '"+ productDesc + "'" + "," 
                + productNet + "," + productGross + "," + productStack + "," + "'" + productManufacturer + "'"
                + "," + "'" + productModel +"' , '"+ productBarcode+"' , '"+productType+"'";
    }
    
    public String getUpdateProduct(String key){
        return "PROD_NAME = '" + productName + "', PROD_CODE = '" + productCode 
                + "' , PROD_DESC = '" + productDesc + "' , PROD_NET = '" + productNet + "' , PROD_GROSS = '" 
                + productGross + "' , PROD_STACK = '" + productStack + "' , PROD_MANUFACTURER = '" + productManufacturer 
                + "' , PROD_MODEL = '" + productModel + "' , PROD_BARCODE = '" + productBarcode + "' , PROD_TYPE = '" + productType
                + "' WHERE PROD_ID = '" + key + "'";
    }
    
    public double calculateGross(double gross, int amount){
        double calc = gross * amount;
        
        
        
        return Double.parseDouble(String.format("%.2f", calc));
    }
    public double calculateGrossVAT(double gross){
        
        double calc = gross * VAT;

        return Double.parseDouble(String.format("%.2f", calc));
    }
    
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    
     public String generateCode( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ) 
           sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
}
    
    
    
    
}
