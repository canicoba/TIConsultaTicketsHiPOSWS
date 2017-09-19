package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GetTiendasByPaisISOyCadenaRequest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codPaisIso",
    "idCadena"
})
@XmlRootElement(name = "getTiendasByPaisISOyCadenaRequest")
public class GetTiendasByPaisISOyCadenaRequest {
	
    /** The cod pais iso. */
    @XmlElement(type = Integer.class)
    protected List<Integer> codPaisIso;
    
    /** The id cadena. */
    @XmlElement(type = Integer.class)
    protected List<Integer> idCadena;
	
	/**
	 * Instantiates a new gets the tiendas by pais is oy cadena request.
	 */
	public GetTiendasByPaisISOyCadenaRequest() {
		super();
	}
	
	/**
	 * Instantiates a new gets the tiendas by pais is oy cadena request.
	 *
	 * @param codPaisIso the cod pais iso
	 * @param idCadena the id cadena
	 */
	public GetTiendasByPaisISOyCadenaRequest(List<Integer> codPaisIso, List<Integer> idCadena) {
		super();
		this.codPaisIso = codPaisIso;
		this.idCadena = idCadena;
	}
	
	/**
	 * Gets the cod pais iso.
	 *
	 * @return the codPaisIso
	 */
	public List<Integer> getCodPaisIso() {
		if (codPaisIso == null) {
			codPaisIso = new ArrayList<Integer>();
        }
        return codPaisIso;
	}
	
	/**
	 * Sets the cod pais iso.
	 *
	 * @param codPaisIso the codPaisIso to set
	 */
	public void setCodPaisIso(List<Integer> codPaisIso) {
		this.codPaisIso = codPaisIso;
	}
	
	/**
	 * Gets the id cadena.
	 *
	 * @return the idCadena
	 */
	public List<Integer> getIdCadena() {
		if (idCadena == null) {
			idCadena = new ArrayList<Integer>();
        }
        return idCadena;
	}
	
	/**
	 * Sets the id cadena.
	 *
	 * @param idCadena the idCadena to set
	 */
	public void setIdCadena(List<Integer> idCadena) {
		this.idCadena = idCadena;
	}
	
	/**
     * {@inheritDoc}
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPaisIso == null) ? 0 : codPaisIso.hashCode());
		result = prime * result + ((idCadena == null) ? 0 : idCadena.hashCode());
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
		GetTiendasByPaisISOyCadenaRequest other = (GetTiendasByPaisISOyCadenaRequest) obj;
		if (codPaisIso == null) {
			if (other.codPaisIso != null) {
				return false;
			}
		} else if (!codPaisIso.equals(other.codPaisIso)) {
			return false;
		}
		if (idCadena == null) {
			if (other.idCadena != null) {
				return false;
			}
		} else if (!idCadena.equals(other.idCadena)) {
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
		builder.append("GetTiendasByPaisISOyCadenaRequest [codPaisIso=");
		builder.append(codPaisIso);
		builder.append(", idCadena=");
		builder.append(idCadena);
		builder.append("]");
		return builder.toString();
	}

}
