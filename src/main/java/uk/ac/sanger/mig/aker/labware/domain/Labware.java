package uk.ac.sanger.mig.aker.labware.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author pi1
 * @since March 2015
 */
@Entity
@Table(name = "labware")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Labware extends BaseEntity {

	@ManyToOne(optional = false)
	private Type type;

	@ManyToOne(optional = false)
	private Size size;

	@Column(nullable = false)
	private String owner;

	@Transient
	private String barcode;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		Labware rhs = (Labware) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.type, rhs.type)
				.append(this.size, rhs.size)
				.append(this.owner, rhs.owner)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(type)
				.append(size)
				.append(owner)
				.toHashCode();
	}
}
