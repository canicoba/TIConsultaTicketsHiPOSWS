package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.io.Serializable;

/**
 * The Class GeneralErrorInfo.
 */
public class GeneralErrorInfo implements Serializable{
    
    /** The clase. */
    private String clase;
    
    /** The metodo. */
    private String metodo;
    
    /** The codigo error. */
    private int codigoError;
    
    /** The descripcion error. */
    private String descripcionError;

    /**
     * Gets the descripcion error.
     *
     * @return the descripcion error
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Sets the descripcion error.
     *
     * @param descripcionError the new descripcion error
     */
    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    /**
     * Gets the clase.
     *
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * Sets the clase.
     *
     * @param clase the new clase
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Gets the metodo.
     *
     * @return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * Sets the metodo.
     *
     * @param metodo the new metodo
     */
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    /**
     * Gets the codigo error.
     *
     * @return the codigo error
     */
    public int getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the codigo error.
     *
     * @param codigoError the new codigo error
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * Returns a string representation of the object.
     * @return  a string representation of the object.
     */
    @Override
    public String toString() {
        return new StringBuffer().append("GeneralErrorInfo{clase='").append(clase).append("', metodo='")
                .append("', codigoError='").append(codigoError).append("', descripcioEnrror='").append(descripcionError)
                .append("'}").toString();
    }
}
