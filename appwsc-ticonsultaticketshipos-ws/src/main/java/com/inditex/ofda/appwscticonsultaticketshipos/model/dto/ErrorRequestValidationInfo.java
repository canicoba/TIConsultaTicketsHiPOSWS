package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.util.List;

/**
 * The Class ErrorRequestValidationInfo.
 */
public class ErrorRequestValidationInfo {


	/** The request validation errors. */
	private List<ErrorRequestValidationInfoBean> requestValidationErrors;
	/**
	 * Instancia un nuevo ErrorRequestValidationInfo.
     *
	 */
	public ErrorRequestValidationInfo() {
		super();
	}

	/**
	 * Instancia un nuevo ErrorRequestValidationInfo.
	 *
	 * @param requestValidationErrors the request validation errors
	 */
	public ErrorRequestValidationInfo(
			final List<ErrorRequestValidationInfoBean> requestValidationErrors) {
		super();
		this.requestValidationErrors = requestValidationErrors;
	}


	/**
	 * Obtiene requestValidationErrors.
	 *
	 * @return requestValidationErrors
	 */
	public List<ErrorRequestValidationInfoBean> getRequestValidationErrors() {
		return this.requestValidationErrors;
	}


    /**
     * Establece requestValidationErrors.
     *
     * @param requestValidationErrors
     *            nuevo requestValidationErrors
     */
	public void setRequestValidationErrors(
			final List<ErrorRequestValidationInfoBean> requestValidationErrors) {
		this.requestValidationErrors = requestValidationErrors;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public String toString() {
		return "ErrorRequestValidationInfo [requestValidationErrors="
				+ this.requestValidationErrors + "]";
	}

}
