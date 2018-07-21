package ua.airline.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PlaneType {

	BOEING_737_200("BOEING 737", 200), BOEING_777_200("BOEING 777", 200);

	private String name;
	private int seetsNumber;

	public String getName() {
		return name;
	}

	public int getSeetsNumber() {
		return seetsNumber;
	}

	private PlaneType(String name, int seetsNumber) {
		this.name = name;
		this.seetsNumber = seetsNumber;
	}

}
