package com.epam.immutablePlanet.animal;
/**
 * @author Ananya_Goel
 */

import java.util.List;

import com.epam.immutablePlanet.mammal.ImmutableMammal;

public final class ImmutableAnimal {
	
	final String animalName;
	final List<ImmutableMammal>	mammalList;

	public ImmutableAnimal(String animalName, List<ImmutableMammal> mammalList) {
		super();
		this.mammalList = mammalList;
		this.animalName = animalName;
	}
	public List<ImmutableMammal> getMammalList() {
		return mammalList;
	}
	public String getAnimalName() {
		return animalName;
	}
}
