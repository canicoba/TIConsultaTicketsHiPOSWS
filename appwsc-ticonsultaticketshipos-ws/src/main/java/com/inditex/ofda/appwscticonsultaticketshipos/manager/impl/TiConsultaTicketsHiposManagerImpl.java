package com.inditex.ofda.appwscticonsultaticketshipos.manager.impl;

import java.io.InputStream;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inditex.ofda.appwscticonsultaticketshipos.exceptions.GeneralServiceException;
import com.inditex.ofda.appwscticonsultaticketshipos.manager.TiConsultaTicketsHiposManager;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequestOSB;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.GetTiendasByPaisISOyCadenaResponse;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * The Class TiConsultaTicketsHiposManagerImpl.
 */
public class TiConsultaTicketsHiposManagerImpl implements TiConsultaTicketsHiposManager {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(TiConsultaTicketsHiposManagerImpl.class);
	
    private String tiConsultaTicketsHiposBatchServiceUrl;
    
    private String tiConsultaTicketsHiposOnlineServiceUrl;
    
    private String obtenerTiendasByPaisISOyCadenaServiceUrl;
    
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
	public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequestOSB request)
			throws GeneralServiceException {
        Client client = Client.create();

        WebResource webResource = client
                .resource(tiConsultaTicketsHiposBatchServiceUrl);
        ObjectMapper mapper = new ObjectMapper();
        String input = null;
        try {
            input= mapper.writeValueAsString(request);
            LOGGER.info(new StringBuffer("Se va a efectuar la llamada POST al servicio de url ")
                    .append(tiConsultaTicketsHiposBatchServiceUrl).toString());
            LOGGER.info(new StringBuffer("La entrada del servicio es ").append(input).toString());
            ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON_TYPE)
                    .post(ClientResponse.class, input);

            InputStream inputStream = clientResponse.getEntityInputStream();
            StringWriter writer = new StringWriter();
            IOUtils.copy(inputStream, writer, "UTF-8");

        } catch (Exception e) {
            StringBuffer mensajeError = new StringBuffer();
            mensajeError.append("Error en : ").append(this.getClass().getName()).append(", ").append(e.getMessage());
            LOGGER.error(String.format("%s", mensajeError));
            throw new GeneralServiceException(this.getClass().getName(), "tiConsultaTicketsHiposBatch", e);
        }
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequestOSB request)
			throws GeneralServiceException{
		TicketHipos response=null;
        Client client = Client.create();

        WebResource webResource = client
                .resource(tiConsultaTicketsHiposOnlineServiceUrl);
        ObjectMapper mapper = new ObjectMapper();
        String input = null;
        try {
            input= mapper.writeValueAsString(request);
            LOGGER.info(new StringBuffer("Se va a efectuar la llamada POST al servicio de url ")
                    .append(tiConsultaTicketsHiposOnlineServiceUrl).toString());
            LOGGER.info(new StringBuffer("La entrada del servicio es ").append(input).toString());
            ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON_TYPE)
                    .post(ClientResponse.class, input);

            InputStream inputStream = clientResponse.getEntityInputStream();
            StringWriter writer = new StringWriter();
            IOUtils.copy(inputStream, writer, "UTF-8");

            String responseStr = writer.toString();
            response = mapper.readValue(responseStr, TicketHipos.class);

            LOGGER.info(new StringBuffer("La salida del servicio es ").append(responseStr).toString());
        } catch (Exception e) {
            StringBuffer mensajeError = new StringBuffer();
            mensajeError.append("Error en : ").append(this.getClass().getName()).append(", ").append(e.getMessage());
            LOGGER.error(String.format("%s", mensajeError));
            throw new GeneralServiceException(this.getClass().getName(), "tiConsultaTicketsHiposOnline", e);
        }
        return response;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public GetTiendasByPaisISOyCadenaResponse obtenerTiendasByPaisISOyCadena(final GetTiendasByPaisISOyCadenaRequest request)
			throws GeneralServiceException{
		GetTiendasByPaisISOyCadenaResponse response=null;
        Client client = Client.create();

        WebResource webResource = client
                .resource(obtenerTiendasByPaisISOyCadenaServiceUrl);
        ObjectMapper mapper = new ObjectMapper();
        String input = null;
        try {
            input= mapper.writeValueAsString(request);
            LOGGER.info(new StringBuffer("Se va a efectuar la llamada POST al servicio de url ")
                    .append(obtenerTiendasByPaisISOyCadenaServiceUrl).toString());
            LOGGER.info(new StringBuffer("La entrada del servicio es ").append(input).toString());
            ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON_TYPE)
                    .post(ClientResponse.class, input);

            InputStream inputStream = clientResponse.getEntityInputStream();
            StringWriter writer = new StringWriter();
            IOUtils.copy(inputStream, writer, "UTF-8");

            String responseStr = writer.toString();
            response = mapper.readValue(responseStr, GetTiendasByPaisISOyCadenaResponse.class);

            LOGGER.info(new StringBuffer("La salida del servicio es ").append(responseStr).toString());
        } catch (Exception e) {
            StringBuffer mensajeError = new StringBuffer();
            mensajeError.append("Error en : ").append(this.getClass().getName()).append(", ").append(e.getMessage());
            LOGGER.error(String.format("%s", mensajeError));
            throw new GeneralServiceException(this.getClass().getName(), "obtenerTiendasByPaisISOyCadena", e);
        }
        return response;
	}

	/**
	 * @param tiConsultaTicketsHiposBatchServiceUrl the tiConsultaTicketsHiposBatchServiceUrl to set
	 */
	public void setTiConsultaTicketsHiposBatchServiceUrl(String tiConsultaTicketsHiposBatchServiceUrl) {
		this.tiConsultaTicketsHiposBatchServiceUrl = tiConsultaTicketsHiposBatchServiceUrl;
	}
	/**
	 * @param tiConsultaTicketsHiposOnlineServiceUrl the tiConsultaTicketsHiposOnlineServiceUrl to set
	 */
	public void setTiConsultaTicketsHiposOnlineServiceUrl(String tiConsultaTicketsHiposOnlineServiceUrl) {
		this.tiConsultaTicketsHiposOnlineServiceUrl = tiConsultaTicketsHiposOnlineServiceUrl;
	}

	/**
	 * @param obtenerTiendasByPaisISOyCadenaServiceUrl the obtenerTiendasByPaisISOyCadenaServiceUrl to set
	 */
	public void setObtenerTiendasByPaisISOyCadenaServiceUrl(String obtenerTiendasByPaisISOyCadenaServiceUrl) {
		this.obtenerTiendasByPaisISOyCadenaServiceUrl = obtenerTiendasByPaisISOyCadenaServiceUrl;
	}


}