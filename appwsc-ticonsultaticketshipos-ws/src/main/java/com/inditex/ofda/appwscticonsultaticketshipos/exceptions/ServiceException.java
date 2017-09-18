package com.inditex.ofda.appwscticonsultaticketshipos.exceptions;

import java.util.Collection;


/**
 * The Class ServiceException.
 */
public class ServiceException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6912616675499293524L;

	/** The clase. */
	private String clase;

	/** The metodo. */
	private String metodo;

	/** The parametros. */
	private Collection parametros;

	/**
	 * Instancia un nuevo ServiceException.
	 */
	public ServiceException() {
		super();
	}

	/**
	 * Instancia un nuevo ServiceException.
	 *
	 * @param clase clase
	 * @param metodo metodo
	 * @param parametros parametros
	 */
	public ServiceException(final String clase, final String metodo, final Collection parametros)
	{
		this.clase = clase;
		this.metodo = metodo;
		this.parametros = parametros;
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
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "ServiceExceptionBean [clase=" + this.clase + ", metodo=" + this.metodo
				+ ", parametros=" + this.parametros + "]";
	}

}