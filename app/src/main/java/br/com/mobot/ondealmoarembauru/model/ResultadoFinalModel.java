package br.com.mobot.ondealmoarembauru.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultadoFinalModel {
    @SerializedName("parcial")
    @Expose
    private Object parcial;
    @SerializedName("final")
    @Expose
    private Final _final;
    @SerializedName("mensagem")
    @Expose
    private String mensagem;
    @SerializedName("sucesso")
    @Expose
    private Boolean sucesso;

    public Object getParcial() {
        return parcial;
    }

    public void setParcial(Object parcial) {
        this.parcial = parcial;
    }

    public Final getFinal() {
        return _final;
    }

    public void setFinal(Final _final) {
        this._final = _final;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }
}
