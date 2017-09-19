package com.inditex.ofda.appwscticonsultaticketshipos.manager;

import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.GeneralServiceException;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaResponse;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;

/**
 * The Interface TiConsultaTicketsHiposManager.
 */
public interface TiConsultaTicketsHiposManager {
	

	/**
	 * Ti consulta tickets hipos batch.
	 *
	 * @param request the request
	 * @throws GeneralServiceException the general service exception
	 */
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequestOSB request)
			throws GeneralServiceException;
	

	/**
	 * Ti consulta tickets hipos online.
	 *
	 * @param request the request
	 * @return the ticket hipos
	 * @throws GeneralServiceException the general service exception
	 */
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequestOSB request)
			throws GeneralServiceException;
	
	
	/**
	 * Obtener tiendas by pais is oy cadena.
	 *
	 * @param request the request
	 * @return the gets the tiendas by pais is oy cadena response
	 * @throws GeneralServiceException the general service exception
	 */
	public GetTiendasByPaisISOyCadenaResponse obtenerTiendasByPaisISOyCadena(final GetTiendasByPaisISOyCadenaRequest request)
			throws GeneralServiceException;

}