package br.com.mobot.ondealmoarembauru.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Final {
    @SerializedName("VCD_ID")
    @Expose
    private Integer vCDID;
    @SerializedName("VCD_DATA")
    @Expose
    private String vCDDATA;
    @SerializedName("RES_ID")
    @Expose
    private Integer rESID;
    @SerializedName("Restaurante")
    @Expose
    private Restaurante restaurante;

    public Integer getVCDID() {
        return vCDID;
    }

    public void setVCDID(Integer vCDID) {
        this.vCDID = vCDID;
    }

    public String getVCDDATA() {
        return vCDDATA;
    }

    public void setVCDDATA(String vCDDATA) {
        this.vCDDATA = vCDDATA;
    }

    public Integer getRESID() {
        return rESID;
    }

    public void setRESID(Integer rESID) {
        this.rESID = rESID;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

}
