package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.util.List;

/**
 * The Class ValidadorRequest.
 */
public class ValidadorRequest {

	/** The es valido. */
	private boolean esValido;

	/** The codigo error. */
	private List<String> codigoError;

	/** The descripcion error. */
	private List<String> descripcionError;

	/**
	 * Instancia un nuevo ValidadorRequest.
	 */
	public ValidadorRequest() {
		super();
	}

	/**
	 * Instancia un nuevo ValidadorRequest.
	 *
	 * @param esValido esValido
	 * @param codigoError codigoError
	 * @param descripcionError descripcionError
	 */
	public ValidadorRequest(final boolean esValido, final List<String> codigoError,
			final List<String> descripcionError) {
		super();
		this.esValido = esValido;
		this.codigoError = codigoError;
		this.descripcionError = descripcionError;
	}

    /**
     * Obtiene esValido.
     *
     * @return esValido
     */
	public boolean isEsValido() {
		return this.esValido;
	}

    /**
     * Establece esValido.
     *
     * @param esValido
     *            nuevo esValido
     */
	public void setEsValido(final boolean esValido) {
		this.esValido = esValido;
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
     * Establece codigoError.
     *
     * @param codigoError
     *            nuevo codigoError
     */
	public void setCodigoError(final List<String> codigoError) {
		this.codigoError = codigoError;
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
     * Establece descripcionError.
     *
     * @param descripcionError
     *            nuevo descripcionError
     */
	public void setDescripcionError(final List<String> descripcionError) {
		this.descripcionError = descripcionError;
	}

}
