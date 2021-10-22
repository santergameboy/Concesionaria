package com.santer.moda;

public class Revisiones {
    private String codigo;
    private String filtro;
    private String aceite;
    private String frenos;

    private Coches coches;

    public Revisiones(String codigo, String filtro, String aceite, String frenos, Coches coches) {
        this.setCodigo(codigo);
        this.setFiltro(filtro);
        this.setAceite(aceite);
        this.setFrenos(frenos);
        this.setCoches(coches);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public Coches getCoches() {
        return coches;
    }

    public void setCoches(Coches coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "Revisiones{" +
                "codigo='" + codigo + '\'' +
                ", filtro='" + filtro + '\'' +
                ", aceite='" + aceite + '\'' +
                ", frenos='" + frenos + '\'' +
                ", coches=" + coches +
                '}';
    }
}
