package com.epam.immutablePlanet.planet;
/**
 * @author Ananya_Goel
 */

import java.util.List;

import com.epam.immutablePlanet.animal.ImmutableAnimal;

public final class Planet {
	final List<ImmutableAnimal> animalList;
	final String planetName;
	
	public Planet(List<ImmutableAnimal> animalList, String planetName) {
		super();
		this.animalList = animalList;
		this.planetName = planetName;
	}

	public List<ImmutableAnimal> getAnimalList() {
		return animalList;
	}

	public String getPlanetName() {
		return planetName;
	}
}
