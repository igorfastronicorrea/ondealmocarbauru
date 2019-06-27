package br.com.mobot.ondealmoarembauru.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerificarModel {
    @SerializedName("mensagem")
    @Expose
    private String mensagem;
    @SerializedName("sucesso")
    @Expose
    private Boolean sucesso;

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
