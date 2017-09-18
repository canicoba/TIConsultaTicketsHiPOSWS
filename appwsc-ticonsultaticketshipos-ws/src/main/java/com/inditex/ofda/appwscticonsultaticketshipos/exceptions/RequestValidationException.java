package com.inditex.ofda.appwscticonsultaticketshipos.exceptions;

import java.util.Collection;
import java.util.List;


/**
 * The Class RequestValidationException.
 */
@SuppressWarnings("rawtypes")
public class RequestValidationException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4874616922511160120L;

	/** The clase. */
	private String clase;

	/** The metodo. */
	private String metodo;

	/** The parametros. */
	private Collection parametros;

	/** The codigo error. */
	private List<String> codigoError;

	/** The descripcion error. */
	private List<String> descripcionError;

	/**
	 * Instancia un nuevo RequestValidationException.
	 */
	public RequestValidationException() {
		super();
	}

	/**
	 * Instancia un nuevo RequestValidationException.
	 *
	 * @param clase
	 *            clase
	 * @param metodo
	 *            metodo
	 * @param parametros
	 *            parametros
	 * @param codigoError
	 *            codigoError
	 * @param descripcionError
	 *            descripcionError
	 */
	public RequestValidationException(final String clase, final String metodo, final Collection parametros,
			final List<String> codigoError, final List<String> descripcionError) {
		this.clase = clase;
		this.metodo = metodo;
		this.parametros = parametros;
		this.codigoError = codigoError;
		this.descripcionError = descripcionError;
	}

	/**
	 * Obtiene metodo.
	 *
	 * @return metodo
	 */
	public String getMetodo() {
		return this.metodo;
	}

	/**
	 * Obtiene parametros.
	 *
	 * @return parametros
	 */
	public Collection getParametros() {
		return this.parametros;
	}

	/**
	 * Obtiene clase.
	 *
	 * @return clase
	 */
	public String getClase() {
		return this.clase;
	}

	/**
	 * Obtiene codigoError.
	 *
	 * @return codigoError
	 */
	public List<String> getCodigoError() {
		return this.codigoError;
	}

	/**
	 * Obtiene descripcionError.
	 *
	 * @return descripcionError
	 */
	public List<String> getDescripcionError() {
		return this.descripcionError;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("RequestValidationException [clase=");
		builder.append(this.clase);
		builder.append(", metodo=");
		builder.append(this.metodo);
		builder.append(", parametros=");
		builder.append(this.parametros);
		builder.append(", codigoError=");
		builder.append(this.codigoError);
		builder.append(", descripcionError=");
		builder.append(this.descripcionError);
		builder.append("]");
		return builder.toString();
	}


}