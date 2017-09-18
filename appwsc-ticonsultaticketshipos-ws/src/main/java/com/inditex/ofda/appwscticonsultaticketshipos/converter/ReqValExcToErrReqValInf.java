package com.inditex.ofda.appwscticonsultaticketshipos.converter;

import java.util.ArrayList;
import java.util.List;

import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.RequestValidationException;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ErrorRequestValidationInfo;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ErrorRequestValidationInfoBean;


/**
 * The Class ReqValExcToErrReqValInf.
 */
public class ReqValExcToErrReqValInf {


	/**
	 * Convierte una RequestValidationException en un ErrorRequestValidationInfo.
	 *
	 * @param requestValidationException the request validation exception
	 * @return ErrorRequestValidationInfo
	 */
	public static ErrorRequestValidationInfo convertir(final RequestValidationException requestValidationException) {
		final ErrorRequestValidationInfo errorRequestValidationInfo = new ErrorRequestValidationInfo();
		final List<String> listaCodError = requestValidationException.getCodigoError();
		final List<String> listaDescError = requestValidationException.getDescripcionError();
		final List<ErrorRequestValidationInfoBean> listaErrValInf = new ArrayList<ErrorRequestValidationInfoBean>();

		for (int i = 0; i < listaCodError.size(); i++) {
			listaErrValInf
					.add(new ErrorRequestValidationInfoBean(listaCodError.get(i), listaDescError.get(i)));
		}
		errorRequestValidationInfo.setRequestValidationErrors(listaErrValInf);
		
		return errorRequestValidationInfo;
	}

}
