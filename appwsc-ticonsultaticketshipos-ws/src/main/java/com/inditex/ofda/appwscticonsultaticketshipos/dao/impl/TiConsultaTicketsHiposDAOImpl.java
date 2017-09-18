package com.inditex.ofda.appwscticonsultaticketshipos.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inditex.ofda.appwscticonsultaticketshipos.dao.TiConsultaTicketsHiposDAO;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;

/**
 * The Class TiConsultaTicketsHiposDAOImpl.
 */
public class TiConsultaTicketsHiposDAOImpl implements TiConsultaTicketsHiposDAO {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(TiConsultaTicketsHiposDAOImpl.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request) throws Exception {

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request)
			throws Exception{
		TicketHipos ticketHipos = null;
		return ticketHipos;
	}

}
