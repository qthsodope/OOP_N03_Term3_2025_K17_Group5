package com.laptopstore.entity;

public class Laptop {
    private Long id;
    private String name;
    private String cpu;
    private String ram;
    private long price;
    private Brand brand;

    public Laptop() {
    }

    public Laptop(Long id, String name, String cpu, String ram, long price, Brand brand) {
        this.id = id;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
