/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

/**
 *
 * @author Jose
 */
public class Linen extends product{
    private String linenFabric;
    private String linenColor;
    private String linenSize;
    
    
    public Linen(String productName, String productCode, String productDesc, 
            double productNet, double productGross, int productStack, 
            String productManufacturer, String productModel, 
            String productBarcode, String productType,String linenFabric, 
            String linenColor, String linenSize){
                  
        super( productName,  productCode,  productDesc, 
             productNet,  productGross,  productStack, 
             productManufacturer,  productModel, 
             productBarcode,  productType);
        
        this.linenFabric = linenFabric;
        this.linenColor = linenColor;
        this.linenSize = linenSize;
        
        
    }
    
    
    public void newLinen(String linenFabric, String linenColor, String linenSize){
        this.linenFabric = linenFabric;
        this.linenColor = linenColor;
        this.linenSize = linenSize;
    }
    
    public String getNewLinen(){
        return "'" + linenFabric + "' , '" + linenColor + "' , '" + linenSize + "'";
    }
    
    public String getNewLinenUpdate(String key){
        return "LINEN_FABRIC = '" + linenFabric + "', LINEN_COLOR = '" + linenColor 
                + "' , LINEN_SIZE = '" + linenSize +  "' WHERE LINEN_ID = '" + key + "'";
    }
    
    
    
}
