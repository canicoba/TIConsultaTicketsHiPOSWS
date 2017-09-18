package com.inditex.ofda.appwscticonsultaticketshipos.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inditex.ofda.appwscticonsultaticketshipos.converter.ReqValExcToErrReqValInf;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ErrorRequestValidationInfo;

/**
 * The Class RequestValidationExceptionMapper.
 */
@Repository
@Provider
public class RequestValidationExceptionMapper implements ExceptionMapper<RequestValidationException> {

	/** The Constant MAPPER. */
	private static final transient ObjectMapper MAPPER = new ObjectMapper();

	/**
     * {@inheritDoc}
     */
	@Override
	public Response toResponse(final RequestValidationException requestValidationException) {
		final ResponseBuilder builder = Response.status(Status.BAD_REQUEST)
				.entity(defaultJSON(requestValidationException)).type(MediaType.APPLICATION_JSON);
		return builder.build();
	}

	/**
	 * Default json.
	 *
	 * @param requestValidationException
	 *            the request validation exception
	 * @return the string
	 */
	private String defaultJSON(final RequestValidationException requestValidationException) {
		final ErrorRequestValidationInfo errorRequestValidationInfo = new ReqValExcToErrReqValInf()
				.convertir(requestValidationException);

		try {
			return MAPPER.writeValueAsString(errorRequestValidationInfo);
		} catch (final JsonProcessingException e) {
			return "{\"message\":\"An internal error occurred\"}";
		}
	}

}