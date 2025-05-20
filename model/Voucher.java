package model;

import java.util.Date;

public class Voucher {
    private int id;
    private String code;
    private double discount;
    private Date validFrom;
    private Date validTo;
    private boolean status;

    public Voucher() {}

    public Voucher(int id, String code, double discount, Date validFrom, Date validTo, boolean status) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public Date getValidFrom() { return validFrom; }
    public void setValidFrom(Date validFrom) { this.validFrom = validFrom; }

    public Date getValidTo() { return validTo; }
    public void setValidTo(Date validTo) { this.validTo = validTo; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public String toString() {
        return "Voucher{" + " id: " + id + ", code: " + code  + ", discount: " + discount + ", validFrom: " + validFrom + ", validTo: " + validTo + ", status: " + status + '}';

    }
}
