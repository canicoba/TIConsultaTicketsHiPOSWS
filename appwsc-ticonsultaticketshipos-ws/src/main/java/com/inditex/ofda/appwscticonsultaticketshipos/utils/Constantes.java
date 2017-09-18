package com.inditex.ofda.appwscticonsultaticketshipos.utils;

/**
 * The Class Constantes.
 */
public class Constantes {

	public static final String FORMATO_FECHA = "YYYY-MM-DD";
	
	public static final String TIPO_DOCUMENTO_HIPOS = "10";

    public static final String CODIGO_ERROR_FECHA_INICIO_OBLIGATORIO = "001";

    public static final String DESCRIPCION_ERROR_FECHA_INICIO_OBLIGATORIO = "Error en la validacion en la request. El parametro fechaInicio es obligatorio";
    
    public static final String CODIGO_ERROR_FORMATO_FECHA_INICIO_INCORRECTO = "002";
    
    public static final String DESCRIPCION_ERROR_FORMATO_FECHA_INICIO_INCORRECTO = "Error en la validacion en la request. El formato del parametro fechaInicio no es correcto (tiene que ser YYYY-MM-DD)";

    public static final String CODIGO_ERROR_FECHA_FIN_OBLIGATORIO = "003";

    public static final String DESCRIPCION_ERROR_FECHA_FIN_OBLIGATORIO = "Error en la validacion en la request. El parametro fechaFin es obligatorio";
    
    public static final String CODIGO_ERROR_FORMATO_FECHA_FIN_INCORRECTO = "004";
    
    public static final String DESCRIPCION_ERROR_FORMATO_FECHA_FIN_INCORRECTO = "Error en la validacion en la request. El formato del parametro fechaFin no es correcto (tiene que ser YYYY-MM-DD)";
    
    public static final String CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO = "005";

    public static final String DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO = "Error en la validacion en la request. El parametro tipoOperacion es obligatorio";
    
    public static final String CODIGO_ERROR_NUMERO_PETICION_OBLIGATORIO = "006";

    public static final String DESCRIPCION_ERROR_NUMERO_PETICION_OBLIGATORIO = "Error en la validacion en la request. El parametro numeroPeticion es obligatorio";
    
    public static final String CODIGO_ERROR_PAIS_OBLIGATORIO = "007";

    public static final String DESCRIPCION_ERROR_PAIS_OBLIGATORIO = "Error en la validacion en la request. El parametro pais es obligatorio si la tienda no esta informada";
    
    public static final String CODIGO_ERROR_TIENDA_OBLIGATORIO = "008";

    public static final String DESCRIPCION_ERROR_TIENDA_OBLIGATORIO = "Error en la validacion en la request. El parametro tienda es obligatorio";
    
    public static final String CODIGO_ERROR_CAJA_OBLIGATORIO = "009";

    public static final String DESCRIPCION_ERROR_CAJA_OBLIGATORIO = "Error en la validacion en la request. El parametro caja es obligatorio";
    
    public static final String CODIGO_ERROR_NUMERO_OPERACION_OBLIGATORIO = "010";

    public static final String DESCRIPCION_ERROR_NUMERO_OPERACION_OBLIGATORIO = "Error en la validacion en la request. El parametro numeroOperacion es obligatorio si el tipoDocumento es 10";

}
