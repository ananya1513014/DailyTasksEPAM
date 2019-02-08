package com.epam.immutablePlanet.animal;
/**
 * @author Ananya_Goel
 */

import java.util.ArrayList;
import java.util.List;

import com.epam.immutablePlanet.io.Input;
import com.epam.immutablePlanet.io.Output;
import com.epam.immutablePlanet.mammal.MammalService;

public class AnimalService {
	public static List<ImmutableAnimal> createAnimalList()
	{
		boolean moreAnimalsNeeded=true;
		
		List<ImmutableAnimal> animalList = new ArrayList<>();

		while(moreAnimalsNeeded)
		{
			Output.printGetAnimalNameMessage();
			animalList.add(new ImmutableAnimal(Input.inputAnimalName(), MammalService.createMammalList()));

			Output.printMoreAnimalMessage();
			moreAnimalsNeeded=Input.inputBoolean();
		}
		
		return animalList;
	}	
}