

package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ConsultaTicketsHiposOnlineRequestOSB.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaInicio",
    "fechaFin",
    "tipoOperacion",
    "numeroOperacion",
    "tienda",
    "caja"
})
@XmlRootElement(name = "consultaTicketsHiposOnlineRequestOSB")
public class ConsultaTicketsHiposOnlineRequestOSB {
	
    /** The fecha inicio. */
    @XmlElement(required = true)
    protected String fechaInicio;
    
    /** The fecha fin. */
    @XmlElement(required = true)
    protected String fechaFin;
    
    /** The tipo operacion. */
    @XmlElement(required = true)
    protected int tipoOperacion;
    
    /** The numero operacion. */
    protected Long numeroOperacion;
    
    /** The tienda. */
    @XmlElement(required = true)
    protected int tienda;
    
    /** The caja. */
    @XmlElement(required = true)
    protected int caja;
    
	/**
	 * Instantiates a new consulta tickets hipos online request osb.
	 */
	public ConsultaTicketsHiposOnlineRequestOSB() {
		super();
	}

	/**
	 * Instantiates a new consulta tickets hipos online request osb.
	 *
	 * @param fechaInicio the fecha inicio
	 * @param fechaFin the fecha fin
	 * @param tipoOperacion the tipo operacion
	 * @param numeroOperacion the numero operacion
	 * @param tienda the tienda
	 * @param caja the caja
	 */
	public ConsultaTicketsHiposOnlineRequestOSB(String fechaInicio, String fechaFin, int tipoOperacion,
			Long numeroOperacion, int tienda, int caja) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoOperacion = tipoOperacion;
		this.numeroOperacion = numeroOperacion;
		this.tienda = tienda;
		this.caja = caja;
	}

	/**
	 * Gets the fecha inicio.
	 *
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * Sets the fecha inicio.
	 *
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * Gets the fecha fin.
	 *
	 * @return the fechaFin
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * Sets the fecha fin.
	 *
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * Gets the tipo operacion.
	 *
	 * @return the tipoOperacion
	 */
	public int getTipoOperacion() {
		return tipoOperacion;
	}

	/**
	 * Sets the tipo operacion.
	 *
	 * @param tipoOperacion the tipoOperacion to set
	 */
	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	/**
	 * Gets the numero operacion.
	 *
	 * @return the numeroOperacion
	 */
	public Long getNumeroOperacion() {
		return numeroOperacion;
	}

	/**
	 * Sets the numero operacion.
	 *
	 * @param numeroOperacion the numeroOperacion to set
	 */
	public void setNumeroOperacion(Long numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}

	/**
	 * Gets the tienda.
	 *
	 * @return the tienda
	 */
	public int getTienda() {
		return tienda;
	}

	/**
	 * Sets the tienda.
	 *
	 * @param tienda the tienda to set
	 */
	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	/**
	 * Gets the caja.
	 *
	 * @return the caja
	 */
	public int getCaja() {
		return caja;
	}

	/**
	 * Sets the caja.
	 *
	 * @param caja the caja to set
	 */
	public void setCaja(int caja) {
		this.caja = caja;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caja;
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((numeroOperacion == null) ? 0 : numeroOperacion.hashCode());
		result = prime * result + (int) (tienda ^ (tienda >>> 32));
		result = prime * result + tipoOperacion;
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
		ConsultaTicketsHiposOnlineRequestOSB other = (ConsultaTicketsHiposOnlineRequestOSB) obj;
		if (caja != other.caja) {
			return false;
		}
		if (fechaFin == null) {
			if (other.fechaFin != null) {
				return false;
			}
		} else if (!fechaFin.equals(other.fechaFin)) {
			return false;
		}
		if (fechaInicio == null) {
			if (other.fechaInicio != null) {
				return false;
			}
		} else if (!fechaInicio.equals(other.fechaInicio)) {
			return false;
		}
		if (numeroOperacion == null) {
			if (other.numeroOperacion != null) {
				return false;
			}
		} else if (!numeroOperacion.equals(other.numeroOperacion)) {
			return false;
		}
		if (tienda != other.tienda) {
			return false;
		}
		if (tipoOperacion != other.tipoOperacion) {
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
		builder.append("ConsultaTicketsHiposOnlineRequestOSB [fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", tipoOperacion=");
		builder.append(tipoOperacion);
		builder.append(", numeroOperacion=");
		builder.append(numeroOperacion);
		builder.append(", tienda=");
		builder.append(tienda);
		builder.append(", caja=");
		builder.append(caja);
		builder.append("]");
		return builder.toString();
	}

}
