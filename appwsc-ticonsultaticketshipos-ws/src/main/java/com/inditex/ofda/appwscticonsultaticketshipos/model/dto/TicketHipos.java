
package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TicketHipos.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contenidoTicket"
})
@XmlRootElement(name = "TicketHipos")
public class TicketHipos {
	
    /** The contenido ticket. */
    @XmlElement(required = true)
    protected String contenidoTicket;

	/**
	 * Instantiates a new ticket hipos.
	 */
	public TicketHipos() {
		super();
	}

	/**
	 * Instantiates a new ticket hipos.
	 *
	 * @param contenidoTicket the contenido ticket
	 */
	public TicketHipos(String contenidoTicket) {
		super();
		this.contenidoTicket = contenidoTicket;
	}

	/**
	 * Gets the contenido ticket.
	 *
	 * @return the contenidoTicket
	 */
	public String getContenidoTicket() {
		return contenidoTicket;
	}

	/**
	 * Sets the contenido ticket.
	 *
	 * @param contenidoTicket the contenidoTicket to set
	 */
	public void setContenidoTicket(String contenidoTicket) {
		this.contenidoTicket = contenidoTicket;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenidoTicket == null) ? 0 : contenidoTicket.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TicketHipos other = (TicketHipos) obj;
		if (contenidoTicket == null) {
			if (other.contenidoTicket != null) {
				return false;
			}
		} else if (!contenidoTicket.equals(other.contenidoTicket)) {
			return false;
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TicketHipos [contenidoTicket=");
		builder.append(contenidoTicket);
		builder.append("]");
		return builder.toString();
	}

}
