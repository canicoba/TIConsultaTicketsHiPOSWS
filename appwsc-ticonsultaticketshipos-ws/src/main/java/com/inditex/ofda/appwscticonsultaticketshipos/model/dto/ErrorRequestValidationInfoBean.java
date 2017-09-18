package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

/**
 * The Class ErrorRequestValidationInfoBean.
 */
public class ErrorRequestValidationInfoBean {

	/** The codigo error. */
	private String codigoError;

	/** The descripcion error. */
	private String descripcionError;

	/**
	 * Instancia un nuevo ErrorRequestValidationInfoBean.
     *
	 */
	public ErrorRequestValidationInfoBean() {
		super();
	}

	/**
	 * Instancia un nuevo ErrorRequestValidationInfoBean.
	 *
	 * @param codigoError codigoError
	 * @param descripcionError descripcionError
	 */
	public ErrorRequestValidationInfoBean(final String codigoError,
			final String descripcionError) {
		super();
		this.codigoError = codigoError;
		this.descripcionError = descripcionError;
	}

	/**
	 * Obtiene codigoError.
	 *
	 * @return codigoError
	 */
	public String getCodigoError() {
		return this.codigoError;
	}

    /**
     * Establece codigoError.
     *
     * @param codigoError
     *            nuevo codigoError
     */
	public void setCodigoError(final String codigoError) {
		this.codigoError = codigoError;
	}

	/**
	 * Obtiene descripcionError.
	 *
	 * @return descripcionError
	 */
	public String getDescripcionError() {
		return this.descripcionError;
	}

    /**
     * Establece descripcionError.
     *
     * @param descripcionError
     *            nuevo descripcionError
     */
	public void setDescripcionError(final String descripcionError) {
		this.descripcionError = descripcionError;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ErrorRequestValidationInfoBean [codigoError=");
		builder.append(this.codigoError);
		builder.append(", descripcionError=");
		builder.append(this.descripcionError);
		builder.append("]");
		return builder.toString();
	}


}
