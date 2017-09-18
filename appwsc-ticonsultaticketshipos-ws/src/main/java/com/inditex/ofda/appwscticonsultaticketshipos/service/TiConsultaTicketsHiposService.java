package com.inditex.ofda.appwscticonsultaticketshipos.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.RequestValidationException;
import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.ServiceException;
import com.inditex.ofda.appwscticonsultaticketshipos.manager.TiConsultaTicketsHiposManager;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ValidadorRequest;


/**
 * The Class TiConsultaTicketsHiposService.
 */
@WebService
@Path("/tiConsultaticketsHipos")
public class TiConsultaTicketsHiposService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(TiConsultaTicketsHiposService.class);

	/** The ti consulta tickets hipos manager. */
	private TiConsultaTicketsHiposManager tiConsultaTicketsHiposManager;

	/** The version. */
	private String version;

	/**
	 * Instantiates a new ti consulta tickets hipos service.
	 */
	public TiConsultaTicketsHiposService() {
	}
	
	/**
	 * Ti consulta tickets hipos batch.
	 *
	 * @param request the request
	 * @throws Exception the exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Path("/tiConsultaTicketsHiposBatch")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request)
			throws Exception {

		LOGGER.info("Request: {}", request.toString());

		final long startMs = System.currentTimeMillis();

        final ValidadorRequest validadorRequest =
                this.tiConsultaTicketsHiposManager.validaRequestConsultaTicketsHiposBatch(request);
        if (validadorRequest.isEsValido()) {
        	try {
        		this.tiConsultaTicketsHiposManager.tiConsultaTicketsHiposBatch(request);
        		LOGGER.info("tiConsultaTicketsHiposBatch Tiempo de la solicitud: {} segundos", (System.currentTimeMillis() - startMs) / 1000);
        	} catch (final ServiceException e) {
        		LOGGER.error("Error: TiConsultaTicketsHiposService ,tiConsultaTicketsHiposBatch", e);
        	    throw e;
        	}
        }
        else {
            final String mensajeError = "Error en tiConsultaTicketsHiposBatch: " +
                    validadorRequest.getCodigoError() + ", "
                    + validadorRequest.getDescripcionError() + ".";
            LOGGER.error(String.format("%s", mensajeError));
            final List parametros = new ArrayList();
            parametros.add(request.getFechaInicio());
            parametros.add(request.getFechaFin());
            parametros.add(request.getTipoOperacion());
            parametros.add(request.getNumeroPeticion());
            parametros.add(request.getPais());
            parametros.add(request.getTienda());
            parametros.add(request.getCaja());
            parametros.add(request.getCadena());
            final RequestValidationException exc = new RequestValidationException(this.getClass()
                    .getName(), "tiConsultaTicketsHiposBatch", parametros,
                    validadorRequest.getCodigoError(),
                    validadorRequest.getDescripcionError());
            throw exc;
        }

	}
	
	/**
	 * Ti consulta tickets hipos online.
	 *
	 * @param request the request
	 * @return the ticket hipos
	 * @throws Exception the exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Path("/tiConsultaTicketsHiposOnline")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request)
			throws Exception {

		LOGGER.info("Request: {}", request.toString());

		final long startMs = System.currentTimeMillis();

		TicketHipos response = null;
        final ValidadorRequest validadorRequest =
                this.tiConsultaTicketsHiposManager.validaRequestConsultaTicketsHiposOnline(request);
        if (validadorRequest.isEsValido()) {
        	try {
        		response = this.tiConsultaTicketsHiposManager.tiConsultaTicketsHiposOnline(request);
        		LOGGER.info("tiConsultaTicketsHiposOnline Tiempo de la solicitud: {} segundos", (System.currentTimeMillis() - startMs) / 1000);
        	} catch (final ServiceException e) {
        		LOGGER.error("Error: TiConsultaTicketsHiposService ,tiConsultaTicketsHiposOnline", e);
        	    throw e;
        	}
        }
        else {
            final String mensajeError = "Error en tiConsultaTicketsHiposOnline: " +
                    validadorRequest.getCodigoError() + ", "
                    + validadorRequest.getDescripcionError() + ".";
            LOGGER.error(String.format("%s", mensajeError));
            final List parametros = new ArrayList();
            parametros.add(request.getFechaInicio());
            parametros.add(request.getFechaFin());
            parametros.add(request.getTipoOperacion());
            parametros.add(request.getPais());
            parametros.add(request.getNumeroOperacion());
            parametros.add(request.getTienda());
            parametros.add(request.getCaja());
            final RequestValidationException exc = new RequestValidationException(this.getClass()
                    .getName(), "tiConsultaTicketsHiposOnline", parametros,
                    validadorRequest.getCodigoError(),
                    validadorRequest.getDescripcionError());
            throw exc;
        }
        return response;

	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 */
	public void setVersion(final String version) {
		this.version = version;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	@Path("/getVersion")
	@GET
	public String getVersion() {
		return this.version;
	}

	/**
	 * Test.
	 *
	 * @return true, if successful
	 */
	@Path("/test")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public boolean test() {

		return true;
	}

	/**
	 * @return the tiConsultaTicketsHiposManager
	 */
	public TiConsultaTicketsHiposManager getTiConsultaTicketsHiposManager() {
		return tiConsultaTicketsHiposManager;
	}

	/**
	 * @param tiConsultaTicketsHiposManager the tiConsultaTicketsHiposManager to set
	 */
	public void setTiConsultaTicketsHiposManager(TiConsultaTicketsHiposManager tiConsultaTicketsHiposManager) {
		this.tiConsultaTicketsHiposManager = tiConsultaTicketsHiposManager;
	}


}