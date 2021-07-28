package com.nglah.masrytechn.network.networkModel.request.driver;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AcceptNqlahRequest {


    @SerializedName("driverId")
    @Expose
    private Integer driverId;
    @SerializedName("naqlaId")
    @Expose
    private Integer price;
    @SerializedName("price")
    @Expose
    private Integer naqlaId;

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNaqlaId() {
        return naqlaId;
    }

    public void setNaqlaId(Integer naqlaId) {
        this.naqlaId = naqlaId;
    }
}
