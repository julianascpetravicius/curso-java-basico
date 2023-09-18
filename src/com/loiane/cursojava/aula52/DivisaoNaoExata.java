package com.loiane.cursojava.aula52;

public class DivisaoNaoExata extends Exception {

    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    public DivisaoNaoExata(String message, int num, int dem) {
        super(message);
        this.num = num;
        this.dem = dem;
    }

    public DivisaoNaoExata(String message, Throwable cause, int num, int dem) {
        super(message, cause);
        this.num = num;
        this.dem = dem;
    }

    public DivisaoNaoExata(Throwable cause, int num, int dem) {
        super(cause);
        this.num = num;
        this.dem = dem;
    }

    public DivisaoNaoExata(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int num, int dem) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + "não é um inteiro";
    }
}
