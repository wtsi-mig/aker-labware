package uk.ac.sanger.mig.aker.labware.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author pi1
 * @since March 2015
 */
@Entity
@Table(name = "sizes")
public class Size extends BaseEntity {

	@Column(nullable = false)
	private long columns;

	@Column(nullable = false)
	private long rows;

	@Column(nullable = false, unique = true)
	private String name;

	public long getColumns() {
		return columns;
	}

	public void setColumns(long columns) {
		this.columns = columns;
	}

	public long getRows() {
		return rows;
	}

	public void setRows(long rows) {
		this.rows = rows;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Size rhs = (Size) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.columns, rhs.columns)
				.append(this.rows, rhs.rows)
				.append(this.name, rhs.name)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(columns)
				.append(rows)
				.append(name)
				.toHashCode();
	}
}
