/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jose III
 */
@Entity
@Table(name = "product", catalog = "rjr", schema = "")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProdId", query = "SELECT p FROM Product p WHERE p.prodId = :prodId")
    , @NamedQuery(name = "Product.findByProdName", query = "SELECT p FROM Product p WHERE p.prodName = :prodName")
    , @NamedQuery(name = "Product.findByProdCode", query = "SELECT p FROM Product p WHERE p.prodCode = :prodCode")
    , @NamedQuery(name = "Product.findByProdDesc", query = "SELECT p FROM Product p WHERE p.prodDesc = :prodDesc")
    , @NamedQuery(name = "Product.findByProdNet", query = "SELECT p FROM Product p WHERE p.prodNet = :prodNet")
    , @NamedQuery(name = "Product.findByProdGross", query = "SELECT p FROM Product p WHERE p.prodGross = :prodGross")
    , @NamedQuery(name = "Product.findByProdStack", query = "SELECT p FROM Product p WHERE p.prodStack = :prodStack")
    , @NamedQuery(name = "Product.findByProdSerial", query = "SELECT p FROM Product p WHERE p.prodSerial = :prodSerial")})
public class Product implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROD_ID")
    private Integer prodId;
    @Basic(optional = false)
    @Column(name = "PROD_NAME")
    private String prodName;
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;
    @Basic(optional = false)
    @Column(name = "PROD_DESC")
    private String prodDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROD_NET")
    private Double prodNet;
    @Column(name = "PROD_GROSS")
    private Double prodGross;
    @Basic(optional = false)
    @Column(name = "PROD_STACK")
    private String prodStack;
    @Column(name = "PROD_SERIAL")
    private String prodSerial;

    public Product() {
    }

    public Product(Integer prodId) {
        this.prodId = prodId;
    }

    public Product(Integer prodId, String prodName, String prodCode, String prodDesc, String prodStack) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCode = prodCode;
        this.prodDesc = prodDesc;
        this.prodStack = prodStack;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        Integer oldProdId = this.prodId;
        this.prodId = prodId;
        changeSupport.firePropertyChange("prodId", oldProdId, prodId);
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        String oldProdName = this.prodName;
        this.prodName = prodName;
        changeSupport.firePropertyChange("prodName", oldProdName, prodName);
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        String oldProdCode = this.prodCode;
        this.prodCode = prodCode;
        changeSupport.firePropertyChange("prodCode", oldProdCode, prodCode);
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        String oldProdDesc = this.prodDesc;
        this.prodDesc = prodDesc;
        changeSupport.firePropertyChange("prodDesc", oldProdDesc, prodDesc);
    }

    public Double getProdNet() {
        return prodNet;
    }

    public void setProdNet(Double prodNet) {
        Double oldProdNet = this.prodNet;
        this.prodNet = prodNet;
        changeSupport.firePropertyChange("prodNet", oldProdNet, prodNet);
    }

    public Double getProdGross() {
        return prodGross;
    }

    public void setProdGross(Double prodGross) {
        Double oldProdGross = this.prodGross;
        this.prodGross = prodGross;
        changeSupport.firePropertyChange("prodGross", oldProdGross, prodGross);
    }

    public String getProdStack() {
        return prodStack;
    }

    public void setProdStack(String prodStack) {
        String oldProdStack = this.prodStack;
        this.prodStack = prodStack;
        changeSupport.firePropertyChange("prodStack", oldProdStack, prodStack);
    }

    public String getProdSerial() {
        return prodSerial;
    }

    public void setProdSerial(String prodSerial) {
        String oldProdSerial = this.prodSerial;
        this.prodSerial = prodSerial;
        changeSupport.firePropertyChange("prodSerial", oldProdSerial, prodSerial);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ui.Product[ prodId=" + prodId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
