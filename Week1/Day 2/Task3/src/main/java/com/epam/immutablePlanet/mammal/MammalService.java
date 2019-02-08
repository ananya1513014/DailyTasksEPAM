package com.epam.immutablePlanet.mammal;
/**
 * @author Ananya_Goel
 */

import java.util.ArrayList;
import java.util.List;

import com.epam.immutablePlanet.io.Input;
import com.epam.immutablePlanet.io.Output;

public class MammalService {
	public static List<ImmutableMammal> createMammalList()
	{
		boolean moreAnimalNeeded=true;
		
		List<ImmutableMammal> mammalList = new ArrayList<>();
		
		while(moreAnimalNeeded)
		{			
			Output.printGetMammalDetailMessage();
			mammalList.add(new ImmutableMammal(Input.inputString(), Input.inputInteger()));
			
			Output.printMoreMammalMessage();
			moreAnimalNeeded=Input.inputBoolean();
		}
		
		return mammalList;
	}
}