/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import com.product.product;

/**
 *
 * @author Jose
 */
public class Equipment extends product {
    private String equipmentSerial1;
    private String equipmentSerial2;
    private String equipmentWarranty;
    
    public Equipment(String productName, String productCode, String productDesc, 
            double productNet, double productGross, int productStack, 
            String productManufacturer, String productModel, 
            String productBarcode, String productType, String equipmentSerial1, String equipmentSerial2, String equipmentWarranty){
        
        super( productName,  productCode,  productDesc, 
             productNet,  productGross,  productStack, 
             productManufacturer,  productModel, 
             productBarcode,  productType);
        
        this.equipmentSerial1 = equipmentSerial1;
        this.equipmentSerial2 = equipmentSerial2;
        this.equipmentWarranty = equipmentWarranty;
        
    }
    
    public void newEquipment(String equipmentSerial1, String equipmentSerial2, String equipmentWarranty){
        this.equipmentSerial1 = equipmentSerial1;
        this.equipmentSerial2 = equipmentSerial2;
        this.equipmentWarranty = equipmentWarranty;
    }
    
    public String getNewEquipment(){
        return "'" + equipmentSerial1 + "' , '" + equipmentSerial2 + "' , '" + equipmentWarranty + "'";
    }
    
    public String getNewEquipmentUpdate(String key){
        return "EQUIP_SERIAL = '" + equipmentSerial1 + "', EQUIP_SERIAL1 = '" + equipmentSerial2 
                + "' , EQUIP_WARRANTY = '" + equipmentWarranty +  "' WHERE EQUIP_ID = '" + key + "'";
    }
    
    
}
