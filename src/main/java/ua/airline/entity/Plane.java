package ua.airline.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.airline.entity.enums.PlaneType;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "palne")
public class Plane extends BaceEntity {
	
	@ManyToOne
	@JoinColumn (name = "company_id")
	private AirCompany airCompany;
	
	@Enumerated (EnumType.STRING)
	private PlaneType planeType;

}
