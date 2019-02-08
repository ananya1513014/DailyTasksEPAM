package com.epam.immutablePlanet.planet;
/**
 * @author Ananya_Goel
 */

import com.epam.immutablePlanet.animal.AnimalService;
import com.epam.immutablePlanet.io.Input;
import com.epam.immutablePlanet.io.Output;

public class PlanetServices {
	public static Planet createPlanetObj()
	{
		Output.printGetPlanetNameMessage();
		
		return new Planet(AnimalService.createAnimalList(), Input.getPlanetName());		
	}	

}
