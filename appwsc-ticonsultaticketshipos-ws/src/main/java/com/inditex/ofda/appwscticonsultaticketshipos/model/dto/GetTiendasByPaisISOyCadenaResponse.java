package com.inditex.ofda.appwscticonsultaticketshipos.model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GetTiendasByPaisISOyCadenaResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaTiendas"
})
@XmlRootElement(name = "getTiendasByPaisISOyCadenaResponse")
public class GetTiendasByPaisISOyCadenaResponse {
	
    /** The lista tiendas. */
    @XmlElement(required = true)
    protected List<TiendasType> listaTiendas;

	/**
	 * Instantiates a new gets the tiendas by pais is oy cadena response.
	 */
	public GetTiendasByPaisISOyCadenaResponse() {
		super();
	}

	/**
	 * Instantiates a new gets the tiendas by pais is oy cadena response.
	 *
	 * @param listaTiendas the lista tiendas
	 */
	public GetTiendasByPaisISOyCadenaResponse(List<TiendasType> listaTiendas) {
		super();
		this.listaTiendas = listaTiendas;
	}

	/**
	 * Gets the lista tiendas.
	 *
	 * @return the listaTiendas
	 */
	public List<TiendasType> getListaTiendas() {
		if (listaTiendas == null) {
			listaTiendas = new ArrayList<TiendasType>();
        }
        return listaTiendas;
	}

	/**
	 * Sets the lista tiendas.
	 *
	 * @param listaTiendas the listaTiendas to set
	 */
	public void setListaTiendas(List<TiendasType> listaTiendas) {
		this.listaTiendas = listaTiendas;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaTiendas == null) ? 0 : listaTiendas.hashCode());
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
		GetTiendasByPaisISOyCadenaResponse other = (GetTiendasByPaisISOyCadenaResponse) obj;
		if (listaTiendas == null) {
			if (other.listaTiendas != null) {
				return false;
			}
		} else if (!listaTiendas.equals(other.listaTiendas)) {
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
		builder.append("GetTiendasByPaisISOyCadenaResponse [listaTiendas=");
		builder.append(listaTiendas);
		builder.append("]");
		return builder.toString();
	}

}
