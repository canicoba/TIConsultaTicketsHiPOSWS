package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ConsultaTicketsHiposBatchRequest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaInicio",
    "fechaFin",
    "tipoOperacion",
    "numeroPeticion",
    "pais",
    "tienda",
    "caja",
    "cadena"
})
@XmlRootElement(name = "consultaTicketsHiposBatchRequest")
public class ConsultaTicketsHiposBatchRequest {
	
	
    /** The fecha inicio. */
    protected String fechaInicio;
    
    /** The fecha fin. */
    protected String fechaFin;
    
    /** The tipo operacion. */
    protected Integer tipoOperacion;
    
    /** The numero peticion. */
    protected Integer numeroPeticion;
    
    /** The pais. */
    protected Integer pais;
    
    /** The tienda. */
    protected Long tienda;
    
    /** The caja. */
    protected Integer caja;
    
    /** The cadena. */
    protected Integer cadena;
    
	/**
	 * Instantiates a new consulta tickets hipos batch request.
	 */
	public ConsultaTicketsHiposBatchRequest() {
		super();
	}

	/**
	 * Instantiates a new consulta tickets hipos batch request.
	 *
	 * @param fechaInicio the fecha inicio
	 * @param fechaFin the fecha fin
	 * @param tipoOperacion the tipo operacion
	 * @param numeroPeticion the numero peticion
	 * @param pais the pais
	 * @param tienda the tienda
	 * @param caja the caja
	 * @param cadena the cadena
	 */
	public ConsultaTicketsHiposBatchRequest(String fechaInicio, String fechaFin, Integer tipoOperacion,
			Integer numeroPeticion, Integer pais, Long tienda, Integer caja, Integer cadena) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoOperacion = tipoOperacion;
		this.numeroPeticion = numeroPeticion;
		this.pais = pais;
		this.tienda = tienda;
		this.caja = caja;
		this.cadena = cadena;
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
	 * Gets the numero peticion.
	 *
	 * @return the numeroPeticion
	 */
	public Integer getNumeroPeticion() {
		return numeroPeticion;
	}

	/**
	 * Sets the numero peticion.
	 *
	 * @param numeroPeticion the numeroPeticion to set
	 */
	public void setNumeroPeticion(Integer numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
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
	 * Gets the cadena.
	 *
	 * @return the cadena
	 */
	public Integer getCadena() {
		return cadena;
	}

	/**
	 * Sets the cadena.
	 *
	 * @param cadena the cadena to set
	 */
	public void setCadena(Integer cadena) {
		this.cadena = cadena;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadena == null) ? 0 : cadena.hashCode());
		result = prime * result + ((caja == null) ? 0 : caja.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((numeroPeticion == null) ? 0 : numeroPeticion.hashCode());
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
		ConsultaTicketsHiposBatchRequest other = (ConsultaTicketsHiposBatchRequest) obj;
		if (cadena == null) {
			if (other.cadena != null) {
				return false;
			}
		} else if (!cadena.equals(other.cadena)) {
			return false;
		}
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
		if (numeroPeticion == null) {
			if (other.numeroPeticion != null) {
				return false;
			}
		} else if (!numeroPeticion.equals(other.numeroPeticion)) {
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
		builder.append("ConsultaTicketsHiposBatchRequest [fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", tipoOperacion=");
		builder.append(tipoOperacion);
		builder.append(", numeroPeticion=");
		builder.append(numeroPeticion);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", tienda=");
		builder.append(tienda);
		builder.append(", caja=");
		builder.append(caja);
		builder.append(", cadena=");
		builder.append(cadena);
		builder.append("]");
		return builder.toString();
	}

}
