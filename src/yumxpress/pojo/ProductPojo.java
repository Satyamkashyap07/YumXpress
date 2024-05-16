/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.pojo;

import java.awt.Image;

/**
 *
 * @author sanja
 */
public class ProductPojo {
    private String productId;
    private String productName;
    private String companyId;
    private double productPrice;
    private Image productImage;
    private String productImageType;
    @Override
    public String toString() {
        return "ProductPojo{" + "productId=" + productId + ", productName=" + productName + ", companyId=" + companyId + ", productPrice=" + productPrice + ", productImage=" + productImage + ", productImageType=" + productImageType + '}';
    }

    public ProductPojo() {
    }

    public ProductPojo(String productId, String productName, String companyId, double productPrice, Image productImage, String productImageType) {
        this.productId = productId;
        this.productName = productName;
        this.companyId = companyId;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productImageType = productImageType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public String getProductImageType() {
        return productImageType;
    }

    public void setProductImageType(String productImageType) {
        this.productImageType = productImageType;
    }
    
    
}
