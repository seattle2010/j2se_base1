package com.Page.controller.domain;

public class Product {
    private Long id;
    private String productName;
    private Long dir_id;
    private Double salePrice;
    private String supplier;
    private String brand;
    private Double cutoff;
    private Double costPrice;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", supplier='" + supplier + '\'' +
                ", salePrice=" + salePrice +
                ", costPrice=" + costPrice +
                ", cutoff=" + cutoff +
                ", dir_id=" + dir_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getCutoff() {
        return cutoff;
    }

    public void setCutoff(Double cutoff) {
        this.cutoff = cutoff;
    }

    public Long getDir_id() {
        return this.dir_id;
    }

    public void setDir_id(Long dir_id) {
        this.dir_id = dir_id;
    }
}
