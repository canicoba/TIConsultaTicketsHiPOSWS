package com.inditex.ofda.appwscticonsultaticketshipos.exceptions;

import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GeneralErrorInfo;
import com.inditex.ofda.appwscticonsultaticketshipos.utils.Constantes;

import java.io.Serializable;


/**
 * The Class GeneralServiceException.
 */
public class GeneralServiceException extends Exception implements Serializable{
    
    /** The general error info. */
    GeneralErrorInfo generalErrorInfo;

    /**
     * Instantiates a new general service exception.
     */
    public GeneralServiceException() {
        super();
    }

    /**
     * Instantiates a new general service exception.
     *
     * @param generalErrorInfo the general error info
     */
    public GeneralServiceException(GeneralErrorInfo generalErrorInfo) {
        this.generalErrorInfo = generalErrorInfo;
    }
    
    /**
     * Instantiates a new general service exception.
     *
     * @param clase the clase
     * @param metodo the metodo
     * @param codigoError the codigo error
     * @param descripcionError the descripcion error
     */
    public GeneralServiceException(String clase, String metodo, int codigoError, String descripcionError) {
        final GeneralErrorInfo gEI = new GeneralErrorInfo();
        gEI.setClase(clase);
        gEI.setMetodo(metodo);
        gEI.setCodigoError(codigoError);
        gEI.setDescripcionError(descripcionError);
        this.generalErrorInfo = gEI;
    }

    /**
     * Instantiates a new general service exception.
     *
     * @param clase the clase
     * @param metodo the metodo
     * @param e the e
     */
    public GeneralServiceException(String clase, String metodo, Exception e) {
        final GeneralErrorInfo gEI = new GeneralErrorInfo();
        gEI.setClase(clase);
        gEI.setMetodo(metodo);
        gEI.setCodigoError(Constantes.CODIGO_ERROR_INTERNO);
        gEI.setDescripcionError(Constantes.DESCRIPCION_ERROR_INTERNO);
        this.generalErrorInfo = gEI;
    }


    /**
     * Instantiates a new general service exception.
     *
     * @param clase the clase
     * @param metodo the metodo
     */
    public GeneralServiceException(String clase, String metodo) {
        final GeneralErrorInfo gEI = new GeneralErrorInfo();
        gEI.setClase(clase);
        gEI.setMetodo(metodo);
        gEI.setCodigoError(Constantes.CODIGO_ERROR_INTERNO);
        gEI.setDescripcionError(Constantes.DESCRIPCION_ERROR_INTERNO);
        this.generalErrorInfo = gEI;
    }

    /**
     * Gets the general error info.
     *
     * @return the general error info
     */
    public GeneralErrorInfo getGeneralErrorInfo() {
        return generalErrorInfo;
    }

    /**
     * Sets the general error info.
     *
     * @param generalErrorInfo the new general error info
     */
    public void setGeneralErrorInfo(GeneralErrorInfo generalErrorInfo) {
        this.generalErrorInfo = generalErrorInfo;
    }

    /**
     * Returns a short description of this throwable.
     * The result is the concatenation of:
     * <ul>
     * <li> the {@linkplain Class#getName() name} of the class of this object
     * <li> ": " (a colon and a space)
     * <li> the result of invoking this object's {@link #getLocalizedMessage}
     *      method
     * </ul>
     * If {@code getLocalizedMessage} returns {@code null}, then just
     * the class name is returned.
     *
     * @return a string representation of this throwable.
     */
    @Override
    public String toString() {
        return new StringBuffer().append("GeneralServiceException{generalErrorInfo=")
                .append(generalErrorInfo.toString()).append("}").toString();

    }
}
