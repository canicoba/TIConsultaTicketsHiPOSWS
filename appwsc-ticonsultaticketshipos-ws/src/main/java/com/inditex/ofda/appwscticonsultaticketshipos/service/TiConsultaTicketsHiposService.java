package com.inditex.ofda.appwscticonsultaticketshipos.service;

import java.text.SimpleDateFormat;
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

import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.GeneralServiceException;
import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.RequestValidationException;
import com.inditex.ofda.appwscticonsultaticketshipos.manager.TiConsultaTicketsHiposManager;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaResponse;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TiendasType;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ValidadorRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.utils.Constantes;


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

        final ValidadorRequest validadorRequest = validaRequestConsultaTicketsHiposBatch(request);
        List<Integer> listaTiendas = new ArrayList<Integer>();
        if (validadorRequest.isEsValido()) {
        	try {
        		if (request.getTienda() == null){
        			GetTiendasByPaisISOyCadenaResponse getTiendasByPaisISOyCadenaResponse = this.tiConsultaTicketsHiposManager.obtenerTiendasByPaisISOyCadena(
        					new GetTiendasByPaisISOyCadenaRequest(new ArrayList<Integer>(request.getPais()),new ArrayList<Integer>(request.getCadena())));
        			LOGGER.info("obtenerTiendasByPaisISOyCadena Tiempo de la solicitud: {} segundos", (System.currentTimeMillis() - startMs) / 1000);
        			for (TiendasType tiendaType : getTiendasByPaisISOyCadenaResponse.getListaTiendas()){
        				listaTiendas.add(tiendaType.getIdTienda());
        			}	
        		}
        		else {
        			listaTiendas.add(request.getTienda());
        		}
        		this.tiConsultaTicketsHiposManager.tiConsultaTicketsHiposBatch(new ConsultaTicketsHiposBatchRequestOSB(request.getFechaInicio(),request.getFechaFin(),
        				request.getTipoOperacion(), request.getNumeroPeticion(), listaTiendas, request.getCaja()));
        		LOGGER.info("tiConsultaTicketsHiposBatch Tiempo de la solicitud: {} segundos", (System.currentTimeMillis() - startMs) / 1000);
        	} catch (final GeneralServiceException e) {
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
        final ValidadorRequest validadorRequest = validaRequestConsultaTicketsHiposOnline(request);
        if (validadorRequest.isEsValido()) {
        	try {
        		response = this.tiConsultaTicketsHiposManager.tiConsultaTicketsHiposOnline(new ConsultaTicketsHiposOnlineRequestOSB(request.getFechaInicio(),
        				request.getFechaFin(), request.getTipoOperacion(), request.getNumeroOperacion(), request.getTienda(), request.getCaja()));
        		LOGGER.info("tiConsultaTicketsHiposOnline Tiempo de la solicitud: {} segundos", (System.currentTimeMillis() - startMs) / 1000);
        	} catch (final GeneralServiceException e) {
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
     * Valida request consulta tickets hipos batch.
     *
     * @param request the request
     * @return the validador request
     */
    public ValidadorRequest validaRequestConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request) {

		List<String> listaCodError = new ArrayList<String>();
		List<String> listaDescError = new ArrayList<String>();
		boolean valido = true;
		
		ValidadorRequest validadorRequest = new ValidadorRequest(true, null, null);
		
		if ((request.getFechaInicio() == null) || (request.getFechaInicio().isEmpty())) {
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_FECHA_INICIO_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_FECHA_INICIO_OBLIGATORIO);
		}
		
		if (request.getFechaInicio() != null) {
			if (!esValidaFormatoFecha(request.getFechaInicio())) {
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_FORMATO_FECHA_INICIO_INCORRECTO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_FORMATO_FECHA_INICIO_INCORRECTO);
			}
		}
		
		if ((request.getFechaFin() == null) || (request.getFechaFin().isEmpty())) {
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_FECHA_FIN_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_FECHA_FIN_OBLIGATORIO);
		}
		
		if (request.getFechaFin() != null) {
			if (!esValidaFormatoFecha(request.getFechaFin())) {
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_FORMATO_FECHA_FIN_INCORRECTO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_FORMATO_FECHA_FIN_INCORRECTO);
			}
		}
		
		if (request.getTipoOperacion() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO);
		}
		
		if (request.getTipoOperacion() != null){
			if (request.getTipoOperacion() < 0 || request.getTipoOperacion() > 99){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_TIPO_OPERACION_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_TIPO_OPERACION_FUERA_RANGO);
			}
		}
		
		if (request.getNumeroPeticion() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_NUMERO_PETICION_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_NUMERO_PETICION_OBLIGATORIO);
		}
		
		if (request.getTienda() == null){
			if (request.getPais() == null){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_PAIS_OBLIGATORIO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_PAIS_OBLIGATORIO);
			}
		}
		
		if (request.getPais() != null){
			if (request.getPais() < 0 || request.getPais() > 999){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_PAIS_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_PAIS_FUERA_RANGO);
			}
		}
		
		if (request.getTienda() != null){
			if (request.getTienda() < 0 || request.getTienda() > 999999){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_TIENDA_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_TIENDA_FUERA_RANGO);
			}
		}
		
		if (request.getCaja() != null){
			if (request.getCaja() < 0 || request.getCaja() > 99){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_CAJA_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_CAJA_FUERA_RANGO);
			}
		}
		
		if (request.getCadena() != null){
			if (request.getCadena() < 0 || request.getCadena() > 9999){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_CADENA_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_CADENA_FUERA_RANGO);
			}
		}
		
		validadorRequest.setEsValido(valido);
		validadorRequest.setCodigoError(listaCodError);
		validadorRequest.setDescripcionError(listaDescError);
		return validadorRequest;
    }
	
    /**
     * Valida request consulta tickets hipos online.
     *
     * @param request the request
     * @return the validador request
     */
    public ValidadorRequest validaRequestConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request) {
		
		List<String> listaCodError = new ArrayList<String>();
		List<String> listaDescError = new ArrayList<String>();
		boolean valido = true;

        ValidadorRequest validadorRequest = new ValidadorRequest(true, null, null);
        
		if ((request.getFechaInicio() == null) || (request.getFechaInicio().isEmpty())) {
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_FECHA_INICIO_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_FECHA_INICIO_OBLIGATORIO);
		}
		
		if (request.getFechaInicio() != null) {
			if (!esValidaFormatoFecha(request.getFechaInicio())) {
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_FORMATO_FECHA_INICIO_INCORRECTO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_FORMATO_FECHA_INICIO_INCORRECTO);
			}
		}
		
		if ((request.getFechaFin() == null) || (request.getFechaFin().isEmpty())) {
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_FECHA_FIN_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_FECHA_FIN_OBLIGATORIO);
		}
		
		if (request.getFechaFin() != null) {
			if (!esValidaFormatoFecha(request.getFechaFin())) {
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_FORMATO_FECHA_FIN_INCORRECTO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_FORMATO_FECHA_FIN_INCORRECTO);
			}
		}
		
		if (request.getTipoOperacion() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO);
		}
		
		if (request.getTipoOperacion().compareTo(new Integer(Constantes.TIPO_DOCUMENTO_HIPOS)) == 0){
			if (request.getNumeroOperacion() == null){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_NUMERO_OPERACION_OBLIGATORIO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_NUMERO_OPERACION_OBLIGATORIO);
			}
		}
		
		if (request.getTipoOperacion() != null){
			if (request.getTipoOperacion() < 0 || request.getTipoOperacion() > 99){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_TIPO_OPERACION_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_TIPO_OPERACION_FUERA_RANGO);
			}
		}
		
		if (request.getNumeroOperacion() != null){
			if (request.getNumeroOperacion() < 0 || request.getNumeroOperacion() > 999999){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_NUMERO_OPERACION_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_NUMERO_OPERACION_FUERA_RANGO);
			}
		}
		
		if (request.getTienda() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_TIENDA_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_TIENDA_OBLIGATORIO);
		}
		
		if (request.getTienda() != null){
			if (request.getTienda() < 0 || request.getTienda() > 999999){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_TIENDA_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_TIENDA_FUERA_RANGO);
			}
		}
		
		if (request.getCaja() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_CAJA_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_CAJA_OBLIGATORIO);
		}
		
		if (request.getCaja() != null){
			if (request.getCaja() < 0 || request.getCaja() > 99){
				valido = false;
				listaCodError.add(Constantes.CODIGO_ERROR_CAJA_FUERA_RANGO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_CAJA_FUERA_RANGO);
			}
		}

		validadorRequest.setEsValido(valido);
		validadorRequest.setCodigoError(listaCodError);
		validadorRequest.setDescripcionError(listaDescError);
		return validadorRequest;
    }
	
	
    /**
     * Es valida formato fecha.
     *
     * @param date the date
     * @return true, if successful
     */
    private boolean esValidaFormatoFecha(final String date) {

        final SimpleDateFormat format = new SimpleDateFormat(Constantes.FORMATO_FECHA);
        format.setLenient(false);

        try {
            format.parse(date);
            return true;
        }
        catch (final Exception e) {
            return false;
        }

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
	 * Gets the ti consulta tickets hipos manager.
	 *
	 * @return the tiConsultaTicketsHiposManager
	 */
	public TiConsultaTicketsHiposManager getTiConsultaTicketsHiposManager() {
		return tiConsultaTicketsHiposManager;
	}

	/**
	 * Sets the ti consulta tickets hipos manager.
	 *
	 * @param tiConsultaTicketsHiposManager the tiConsultaTicketsHiposManager to set
	 */
	public void setTiConsultaTicketsHiposManager(TiConsultaTicketsHiposManager tiConsultaTicketsHiposManager) {
		this.tiConsultaTicketsHiposManager = tiConsultaTicketsHiposManager;
	}


}