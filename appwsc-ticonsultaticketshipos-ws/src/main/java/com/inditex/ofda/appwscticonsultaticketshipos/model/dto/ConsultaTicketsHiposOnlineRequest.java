
package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ConsultaTicketsHiposOnlineRequest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaInicio",
    "fechaFin",
    "tipoOperacion",
    "pais",
    "numeroOperacion",
    "tienda",
    "caja"
})
@XmlRootElement(name = "consultaTicketsHiposOnlineRequest")
public class ConsultaTicketsHiposOnlineRequest {

    /** The fecha inicio. */
    @XmlElement(required = true)
    protected String fechaInicio;
    
    /** The fecha fin. */
    @XmlElement(required = true)
    protected String fechaFin;
    
    /** The tipo operacion. */
    protected Integer tipoOperacion;
    
    /** The pais. */
    protected Integer pais;
    
    /** The numero operacion. */
    protected Long numeroOperacion;
    
    /** The tienda. */
    protected Long tienda;
    
    /** The caja. */
    protected Integer caja;
    
	/**
	 * Instantiates a new consulta tickets hipos online request.
	 */
	public ConsultaTicketsHiposOnlineRequest() {
		super();
	}
	
	/**
	 * Instantiates a new consulta tickets hipos online request.
	 *
	 * @param fechaInicio the fecha inicio
	 * @param fechaFin the fecha fin
	 * @param tipoOperacion the tipo operacion
	 * @param pais the pais
	 * @param numeroOperacion the numero operacion
	 * @param tienda the tienda
	 * @param caja the caja
	 */
	public ConsultaTicketsHiposOnlineRequest(String fechaInicio, String fechaFin, Integer tipoOperacion,
			Integer pais, Long numeroOperacion, Long tienda, Integer caja) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoOperacion = tipoOperacion;
		this.pais = pais;
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
	public Integer getTipoOperacion() {
		return tipoOperacion;
	}

	/**
	 * Sets the tipo operacion.
	 *
	 * @param tipoOperacion the tipoOperacion to set
	 */
	public void setTipoOperacion(Integer tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	/**
	 * Gets the pais.
	 *
	 * @return the pais
	 */
	public Integer getPais() {
		return pais;
	}

	/**
	 * Sets the pais.
	 *
	 * @param pais the pais to set
	 */
	public void setPais(Integer pais) {
		this.pais = pais;
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
	public Long getTienda() {
		return tienda;
	}

	/**
	 * Sets the tienda.
	 *
	 * @param tienda the tienda to set
	 */
	public void setTienda(Long tienda) {
		this.tienda = tienda;
	}

	/**
	 * Gets the caja.
	 *
	 * @return the caja
	 */
	public Integer getCaja() {
		return caja;
	}

	/**
	 * Sets the caja.
	 *
	 * @param caja the caja to set
	 */
	public void setCaja(Integer caja) {
		this.caja = caja;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caja == null) ? 0 : caja.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((numeroOperacion == null) ? 0 : numeroOperacion.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((tienda == null) ? 0 : tienda.hashCode());
		result = prime * result + ((tipoOperacion == null) ? 0 : tipoOperacion.hashCode());
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
		ConsultaTicketsHiposOnlineRequest other = (ConsultaTicketsHiposOnlineRequest) obj;
		if (caja == null) {
			if (other.caja != null) {
				return false;
			}
		} else if (!caja.equals(other.caja)) {
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
		if (pais == null) {
			if (other.pais != null) {
				return false;
			}
		} else if (!pais.equals(other.pais)) {
			return false;
		}
		if (tienda == null) {
			if (other.tienda != null) {
				return false;
			}
		} else if (!tienda.equals(other.tienda)) {
			return false;
		}
		if (tipoOperacion == null) {
			if (other.tipoOperacion != null) {
				return false;
			}
		} else if (!tipoOperacion.equals(other.tipoOperacion)) {
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
		builder.append("ConsultaTicketsHiposOnlineRequest [fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", tipoOperacion=");
		builder.append(tipoOperacion);
		builder.append(", pais=");
		builder.append(pais);
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
