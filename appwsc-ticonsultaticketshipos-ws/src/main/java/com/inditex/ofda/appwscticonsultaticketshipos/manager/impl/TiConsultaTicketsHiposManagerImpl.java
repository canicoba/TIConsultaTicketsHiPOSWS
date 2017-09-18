package com.inditex.ofda.appwscticonsultaticketshipos.manager.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.inditex.ofda.appwscticonsultaticketshipos.dao.TiConsultaTicketsHiposDAO;
import com.inditex.ofda.appwscticonsultaticketshipos.manager.TiConsultaTicketsHiposManager;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ValidadorRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.utils.Constantes;

/**
 * The Class TiConsultaTicketsHiposManagerImpl.
 */
public class TiConsultaTicketsHiposManagerImpl implements TiConsultaTicketsHiposManager {

	
	/** The ti consultatickets hipos dao. */
	private TiConsultaTicketsHiposDAO tiConsultaticketsHiposDAO;

	
	/**
	 * Instantiates a new ti consulta tickets hipos manager impl.
	 */
	public TiConsultaTicketsHiposManagerImpl() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request)
			throws Exception {

		this.tiConsultaticketsHiposDAO.tiConsultaTicketsHiposBatch(request);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request)
			throws Exception{
		return this.tiConsultaticketsHiposDAO.tiConsultaTicketsHiposOnline(request);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
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
		
		validadorRequest.setEsValido(valido);
		validadorRequest.setCodigoError(listaCodError);
		validadorRequest.setDescripcionError(listaDescError);
		return validadorRequest;
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
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
				listaCodError.add(Constantes.CODIGO_ERROR_TIPO_OPERACION_OBLIGATORIO);
				listaDescError.add(Constantes.DESCRIPCION_ERROR_TIPO_OPERACION_OBLIGATORIO);
			}
		}
		
		if (request.getTienda() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_TIENDA_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_TIENDA_OBLIGATORIO);
		}
		
		if (request.getCaja() == null){
			valido = false;
			listaCodError.add(Constantes.CODIGO_ERROR_CAJA_OBLIGATORIO);
			listaDescError.add(Constantes.DESCRIPCION_ERROR_CAJA_OBLIGATORIO);
		}

		validadorRequest.setEsValido(valido);
		validadorRequest.setCodigoError(listaCodError);
		validadorRequest.setDescripcionError(listaDescError);
		return validadorRequest;
    }
	
	
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
	 * @return the tiConsultaticketsHiposDAO
	 */
	public TiConsultaTicketsHiposDAO getTiConsultaticketsHiposDAO() {
		return tiConsultaticketsHiposDAO;
	}

	/**
	 * @param tiConsultaticketsHiposDAO the tiConsultaticketsHiposDAO to set
	 */
	public void setTiConsultaticketsHiposDAO(TiConsultaTicketsHiposDAO tiConsultaticketsHiposDAO) {
		this.tiConsultaticketsHiposDAO = tiConsultaticketsHiposDAO;
	}

}