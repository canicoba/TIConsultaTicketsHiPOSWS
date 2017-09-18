
package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ConsultaTicketsHiposBatchRequestOSB.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaInicio",
    "fechaFin",
    "tipoOperacion",
    "numeroPeticion",
    "tienda",
    "caja"
})
@XmlRootElement(name = "consultaTicketsHiposBatchRequestOSB")
public class ConsultaTicketsHiposBatchRequestOSB {
		
    /** The fecha inicio. */
    @XmlElement(required = true)
    protected String fechaInicio;
    
    /** The fecha fin. */
    @XmlElement(required = true)
    protected String fechaFin;
    
    /** The tipo operacion. */
    protected int tipoOperacion;
    
    /** The numero peticion. */
    protected int numeroPeticion;
    
    /** The tienda. */
    @XmlElement(type = Long.class)
    protected List<Long> tienda;
    
    /** The caja. */
    protected Integer caja;
	
	/**
	 * Instantiates a new consulta tickets hipos batch request osb.
	 */
	public ConsultaTicketsHiposBatchRequestOSB() {
		super();
	}
	
	/**
	 * Instantiates a new consulta tickets hipos batch request osb.
	 *
	 * @param fechaInicio the fecha inicio
	 * @param fechaFin the fecha fin
	 * @param tipoOperacion the tipo operacion
	 * @param numeroPeticion the numero peticion
	 * @param tienda the tienda
	 * @param caja the caja
	 */
	public ConsultaTicketsHiposBatchRequestOSB(String fechaInicio, String fechaFin, int tipoOperacion,
			int numeroPeticion, List<Long> tienda, Integer caja) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoOperacion = tipoOperacion;
		this.numeroPeticion = numeroPeticion;
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
	 * Gets the numero peticion.
	 *
	 * @return the numeroPeticion
	 */
	public int getNumeroPeticion() {
		return numeroPeticion;
	}
	
	/**
	 * Sets the numero peticion.
	 *
	 * @param numeroPeticion the numeroPeticion to set
	 */
	public void setNumeroPeticion(int numeroPeticion) {
		this.numeroPeticion = numeroPeticion;
	}
	
	/**
	 * Gets the tienda.
	 *
	 * @return the tienda
	 */
	public List<Long> getTienda() {
		return tienda;
	}
	
	/**
	 * Sets the tienda.
	 *
	 * @param tienda the tienda to set
	 */
	public void setTienda(List<Long> tienda) {
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
		result = prime * result + numeroPeticion;
		result = prime * result + ((tienda == null) ? 0 : tienda.hashCode());
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
		ConsultaTicketsHiposBatchRequestOSB other = (ConsultaTicketsHiposBatchRequestOSB) obj;
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
		if (numeroPeticion != other.numeroPeticion) {
			return false;
		}
		if (tienda == null) {
			if (other.tienda != null) {
				return false;
			}
		} else if (!tienda.equals(other.tienda)) {
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
		builder.append("ConsultaTicketsHiposBatchRequestOSB [fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", tipoOperacion=");
		builder.append(tipoOperacion);
		builder.append(", numeroPeticion=");
		builder.append(numeroPeticion);
		builder.append(", tienda=");
		builder.append(tienda);
		builder.append(", caja=");
		builder.append(caja);
		builder.append("]");
		return builder.toString();
	}  

}
