package com.inditex.ofda.appwscticonsultaticketshipos.dao;

import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;

/**
 * The Interface TiConsultaticketsHiposDAO.
 */
public interface TiConsultaTicketsHiposDAO {

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

}
