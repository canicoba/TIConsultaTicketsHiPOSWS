package com.inditex.ofda.appwscticonsultaticketshipos.manager;

import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ValidadorRequest;


/**
 * The Interface TiConsultaTicketsHiposManager.
 */
public interface TiConsultaTicketsHiposManager {
	
	/**
	 * Ti consulta tickets hipos batch.
	 *
	 * @param request the request
	 * @throws Exception the exception
	 */
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request)
			throws Exception;
	
	/**
	 * Ti consulta tickets hipos online.
	 *
	 * @param request the request
	 * @return the ticket hipos
	 * @throws Exception the exception
	 */
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request)
			throws Exception;

	/**
	 * Valida request consulta tickets hipos batch.
	 *
	 * @param request the request
	 * @return the validador request
	 */
	public ValidadorRequest validaRequestConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request);
	
	/**
	 * Valida request consulta tickets hipos online.
	 *
	 * @param request the request
	 * @return the validador request
	 */
	public ValidadorRequest validaRequestConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request);
	
}