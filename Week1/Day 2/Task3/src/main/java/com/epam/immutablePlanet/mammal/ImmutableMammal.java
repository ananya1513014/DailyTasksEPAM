package com.epam.immutablePlanet.mammal;
/**
 * @author Ananya_Goel
 */

public final class ImmutableMammal {
	final String name;
	final int avgAge;
	public ImmutableMammal(String name, int avgAge) {
		super();
		this.name = name;
		this.avgAge = avgAge;
	}
	public String getName() {
		return name;
	}
	public int getAvgAge() {
		return avgAge;
	}
}
