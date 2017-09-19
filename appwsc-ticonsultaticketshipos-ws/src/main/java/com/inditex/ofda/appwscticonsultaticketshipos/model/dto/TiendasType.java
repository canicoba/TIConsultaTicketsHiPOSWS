package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TiendasType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiendasType", propOrder = {
    "idPais",
    "paisIso",
    "idCadena",
    "nombreCadena",
    "idTienda",
    "nombreTienda",
    "pais"
})
public class TiendasType {

    /** The id pais. */
    protected int idPais;
    
    /** The pais iso. */
    protected int paisIso;
    
    /** The id cadena. */
    protected int idCadena;
    
    /** The nombre cadena. */
    @XmlElement(required = true)
    protected String nombreCadena;
    
    /** The id tienda. */
    protected int idTienda;
    
    /** The nombre tienda. */
    @XmlElement(required = true)
    protected String nombreTienda;
    
    /** The pais. */
    @XmlElement(required = true)
    protected String pais;
    
	/**
	 * Instantiates a new tiendas type.
	 */
	public TiendasType() {
		super();
	}
	
	/**
	 * Instantiates a new tiendas type.
	 *
	 * @param idPais the id pais
	 * @param paisIso the pais iso
	 * @param idCadena the id cadena
	 * @param nombreCadena the nombre cadena
	 * @param idTienda the id tienda
	 * @param nombreTienda the nombre tienda
	 * @param pais the pais
	 */
	public TiendasType(int idPais, int paisIso, int idCadena, String nombreCadena, int idTienda,
			String nombreTienda, String pais) {
		super();
		this.idPais = idPais;
		this.paisIso = paisIso;
		this.idCadena = idCadena;
		this.nombreCadena = nombreCadena;
		this.idTienda = idTienda;
		this.nombreTienda = nombreTienda;
		this.pais = pais;
	}

	/**
	 * Gets the id pais.
	 *
	 * @return the idPais
	 */
	public int getIdPais() {
		return idPais;
	}

	/**
	 * Sets the id pais.
	 *
	 * @param idPais the idPais to set
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	/**
	 * Gets the pais iso.
	 *
	 * @return the paisIso
	 */
	public int getPaisIso() {
		return paisIso;
	}

	/**
	 * Sets the pais iso.
	 *
	 * @param paisIso the paisIso to set
	 */
	public void setPaisIso(int paisIso) {
		this.paisIso = paisIso;
	}

	/**
	 * Gets the id cadena.
	 *
	 * @return the idCadena
	 */
	public int getIdCadena() {
		return idCadena;
	}

	/**
	 * Sets the id cadena.
	 *
	 * @param idCadena the idCadena to set
	 */
	public void setIdCadena(int idCadena) {
		this.idCadena = idCadena;
	}

	/**
	 * Gets the nombre cadena.
	 *
	 * @return the nombreCadena
	 */
	public String getNombreCadena() {
		return nombreCadena;
	}

	/**
	 * Sets the nombre cadena.
	 *
	 * @param nombreCadena the nombreCadena to set
	 */
	public void setNombreCadena(String nombreCadena) {
		this.nombreCadena = nombreCadena;
	}

	/**
	 * Gets the id tienda.
	 *
	 * @return the idTienda
	 */
	public int getIdTienda() {
		return idTienda;
	}

	/**
	 * Sets the id tienda.
	 *
	 * @param idTienda the idTienda to set
	 */
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	/**
	 * Gets the nombre tienda.
	 *
	 * @return the nombreTienda
	 */
	public String getNombreTienda() {
		return nombreTienda;
	}

	/**
	 * Sets the nombre tienda.
	 *
	 * @param nombreTienda the nombreTienda to set
	 */
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	/**
	 * Gets the pais.
	 *
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Sets the pais.
	 *
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCadena;
		result = prime * result + idPais;
		result = prime * result + idTienda;
		result = prime * result + ((nombreCadena == null) ? 0 : nombreCadena.hashCode());
		result = prime * result + ((nombreTienda == null) ? 0 : nombreTienda.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + paisIso;
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
		TiendasType other = (TiendasType) obj;
		if (idCadena != other.idCadena) {
			return false;
		}
		if (idPais != other.idPais) {
			return false;
		}
		if (idTienda != other.idTienda) {
			return false;
		}
		if (nombreCadena == null) {
			if (other.nombreCadena != null) {
				return false;
			}
		} else if (!nombreCadena.equals(other.nombreCadena)) {
			return false;
		}
		if (nombreTienda == null) {
			if (other.nombreTienda != null) {
				return false;
			}
		} else if (!nombreTienda.equals(other.nombreTienda)) {
			return false;
		}
		if (pais == null) {
			if (other.pais != null) {
				return false;
			}
		} else if (!pais.equals(other.pais)) {
			return false;
		}
		if (paisIso != other.paisIso) {
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
		builder.append("TiendasType [idPais=");
		builder.append(idPais);
		builder.append(", paisIso=");
		builder.append(paisIso);
		builder.append(", idCadena=");
		builder.append(idCadena);
		builder.append(", nombreCadena=");
		builder.append(nombreCadena);
		builder.append(", idTienda=");
		builder.append(idTienda);
		builder.append(", nombreTienda=");
		builder.append(nombreTienda);
		builder.append(", pais=");
		builder.append(pais);
		builder.append("]");
		return builder.toString();
	}

}
