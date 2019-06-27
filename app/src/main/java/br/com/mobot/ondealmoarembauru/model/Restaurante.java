package br.com.mobot.ondealmoarembauru.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Restaurante {

    @SerializedName("RES_ID")
    @Expose
    private Integer rESID;
    @SerializedName("RES_NOME")
    @Expose
    private String rESNOME;
    @SerializedName("RES_OPCAO")
    @Expose
    private String rESOPCAO;
    @SerializedName("RES_GASTRONOMIA")
    @Expose
    private String rESGASTRONOMIA;
    @SerializedName("RES_PRECO_MEDIO")
    @Expose
    private Double rESPRECOMEDIO;

    public Integer getRESID() {
        return rESID;
    }

    public void setRESID(Integer rESID) {
        this.rESID = rESID;
    }

    public String getRESNOME() {
        return rESNOME;
    }

    public void setRESNOME(String rESNOME) {
        this.rESNOME = rESNOME;
    }

    public String getRESOPCAO() {
        return rESOPCAO;
    }

    public void setRESOPCAO(String rESOPCAO) {
        this.rESOPCAO = rESOPCAO;
    }

    public String getRESGASTRONOMIA() {
        return rESGASTRONOMIA;
    }

    public void setRESGASTRONOMIA(String rESGASTRONOMIA) {
        this.rESGASTRONOMIA = rESGASTRONOMIA;
    }

    public Double getRESPRECOMEDIO() {
        return rESPRECOMEDIO;
    }

    public void setRESPRECOMEDIO(Double rESPRECOMEDIO) {
        this.rESPRECOMEDIO = rESPRECOMEDIO;
    }
}
