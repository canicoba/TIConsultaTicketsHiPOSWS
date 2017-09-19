package com.inditex.ofda.appwscticonsultaticketshipos.utils;

/**
 * The Class Constantes.
 */
public class Constantes {

	/** The Constant FORMATO_FECHA. */
	public static final String FORMATO_FECHA = "yyyy-mm-dd";
	
	/** The Constant TIPO_DOCUMENTO_HIPOS. */
	public static final String TIPO_DOCUMENTO_HIPOS = "10";
	
	/** The Constant CODIGO_ERROR_INTERNO. */
	public static final int CODIGO_ERROR_INTERNO = 0;
	
	/** The Constant DESCRIPCION_ERROR_INTERNO. */
	public static final String DESCRIPCION_ERROR_INTERNO = "Error interno del servicio. Avise al administrador del mismo";

    /** The Constant CODIGO_ERROR_FECHA_INICIO_OBLIGATORIO. */
    public static final String CODIGO_ERROR_FECHA_INICIO_OBLIGATORIO = "001";

    /** The Constant DESCRIPCION_ERROR_FECHA_INICIO_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_FECHA_INICIO_OBLIGATORIO = "Error en la validacion en la request. El parametro fechaInicio es obligatorio";
    
    /** The Constant CODIGO_ERROR_FORMATO_FECHA_INICIO_INCORRECTO. */
    public static final String CODIGO_ERROR_FORMATO_FECHA_INICIO_INCORRECTO = "002";
    
    /** The Constant DESCRIPCION_ERROR_FORMATO_FECHA_INICIO_INCORRECTO. */
    public static final String DESCRIPCION_ERROR_FORMATO_FECHA_INICIO_INCORRECTO = "Error en la validacion en la request. El formato del parametro fechaInicio no es correcto (tiene que ser YYYY-MM-DD)";

    /** The Constant CODIGO_ERROR_FECHA_FIN_OBLIGATORIO. */
    public static final String CODIGO_ERROR_FECHA_FIN_OBLIGATORIO = "003";

    /** The Constant DESCRIPCION_ERROR_FECHA_FIN_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_FECHA_FIN_OBLIGATORIO = "Error en la validacion en la request. El parametro fechaFin es obligatorio";
    
    /** The Constant CODIGO_ERROR_FORMATO_FECHA_FIN_INCORRECTO. */
    public static final String CODIGO_ERROR_FORMATO_FECHA_FIN_INCORRECTO = "004";
    
    /** The Constant DESCRIPCION_ERROR_FORMATO_FECHA_FIN_INCORRECTO. */
    public static final String DESCRIPCION_ERROR_FORMATO_FECHA_FIN_INCORRECTO = "Error en la validacion en la request. El formato del parametro fechaFin no es correcto (tiene que ser yyyy-mm-dd)";
    
    /** The Constant CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO. */
    public static final String CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO = "005";

    /** The Constant DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO = "Error en la validacion en la request. El parametro tipoOperacion es obligatorio";
    
	/** The Constant CODIGO_ERROR_TIPO_OPERACION_FUERA_RANGO. */
	public static final String CODIGO_ERROR_TIPO_OPERACION_FUERA_RANGO = "006";

	/** The Constant DESCRIPCION_ERROR_TIPO_OPERACION_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_TIPO_OPERACION_FUERA_RANGO = "Error en la validacion en la request. El parametro tipoOperacion tiene que estar comprendido entre 00 y 99";
    
    /** The Constant CODIGO_ERROR_NUMERO_PETICION_OBLIGATORIO. */
    public static final String CODIGO_ERROR_NUMERO_PETICION_OBLIGATORIO = "007";

    /** The Constant DESCRIPCION_ERROR_NUMERO_PETICION_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_NUMERO_PETICION_OBLIGATORIO = "Error en la validacion en la request. El parametro numeroPeticion es obligatorio";
    
    /** The Constant CODIGO_ERROR_PAIS_OBLIGATORIO. */
    public static final String CODIGO_ERROR_PAIS_OBLIGATORIO = "008";

    /** The Constant DESCRIPCION_ERROR_PAIS_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_PAIS_OBLIGATORIO = "Error en la validacion en la request. El parametro pais es obligatorio si la tienda no esta informada";
    
	/** The Constant CODIGO_ERROR_PAIS_FUERA_RANGO. */
	public static final String CODIGO_ERROR_PAIS_FUERA_RANGO = "009";

	/** The Constant DESCRIPCION_ERROR_PAIS_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_PAIS_FUERA_RANGO = "Error en la validacion en la request. El parametro pais tiene que estar comprendido entre 0 y 999";
    
    /** The Constant CODIGO_ERROR_TIENDA_OBLIGATORIO. */
    public static final String CODIGO_ERROR_TIENDA_OBLIGATORIO = "010";

    /** The Constant DESCRIPCION_ERROR_TIENDA_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_TIENDA_OBLIGATORIO = "Error en la validacion en la request. El parametro tienda es obligatorio";
    
	/** The Constant CODIGO_ERROR_TIENDA_FUERA_RANGO. */
	public static final String CODIGO_ERROR_TIENDA_FUERA_RANGO = "011";

	/** The Constant DESCRIPCION_ERROR_TIENDA_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_TIENDA_FUERA_RANGO = "Error en la validacion en la request. El parametro tienda tiene que estar comprendido entre 0 y 999999";
    
    /** The Constant CODIGO_ERROR_CAJA_OBLIGATORIO. */
    public static final String CODIGO_ERROR_CAJA_OBLIGATORIO = "012";

    /** The Constant DESCRIPCION_ERROR_CAJA_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_CAJA_OBLIGATORIO = "Error en la validacion en la request. El parametro caja es obligatorio";
    
	/** The Constant CODIGO_ERROR_CAJA_FUERA_RANGO. */
	public static final String CODIGO_ERROR_CAJA_FUERA_RANGO = "013";

	/** The Constant DESCRIPCION_ERROR_CAJA_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_CAJA_FUERA_RANGO = "Error en la validacion en la request. El parametro caja tiene que estar comprendido entre 0 y 99";
    
    /** The Constant CODIGO_ERROR_NUMERO_OPERACION_OBLIGATORIO. */
    public static final String CODIGO_ERROR_NUMERO_OPERACION_OBLIGATORIO = "014";
    
    /** The Constant DESCRIPCION_ERROR_NUMERO_OPERACION_OBLIGATORIO. */
    public static final String DESCRIPCION_ERROR_NUMERO_OPERACION_OBLIGATORIO = "Error en la validacion en la request. El parametro numeroOperacion es obligatorio si el tipoDocumento es 10";
    
	/** The Constant CODIGO_ERROR_NUMERO_OPERACION_FUERA_RANGO. */
	public static final String CODIGO_ERROR_NUMERO_OPERACION_FUERA_RANGO = "015";

	/** The Constant DESCRIPCION_ERROR_NUMERO_OPERACION_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_NUMERO_OPERACION_FUERA_RANGO = "Error en la validacion en la request. El parametro numeroOperacion tiene que estar comprendido entre 0 y 999999";
	
	/** The Constant CODIGO_ERROR_CADENA_FUERA_RANGO. */
	public static final String CODIGO_ERROR_CADENA_FUERA_RANGO = "016";

	/** The Constant DESCRIPCION_ERROR_CADENA_FUERA_RANGO. */
	public static final String DESCRIPCION_ERROR_CADENA_FUERA_RANGO = "Error en la validacion en la request. El parametro cadena tiene que estar comprendido entre 0 y 9999";

}
