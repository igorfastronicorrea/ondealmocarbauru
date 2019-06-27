package br.com.mobot.ondealmoarembauru.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VotarModel {
    @SerializedName("alu_ra")
    @Expose
    private String aluRa;
    @SerializedName("res_id")
    @Expose
    private Integer resId;

    public String getAluRa() {
        return aluRa;
    }

    public void setAluRa(String aluRa) {
        this.aluRa = aluRa;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }
}
