package com.epam.immutablePlanet;
/**
 * @author Ananya_Goel
 */
import com.epam.immutablePlanet.planet.Planet;
import com.epam.immutablePlanet.planet.PlanetServices;

public class Main {
	public static void main(String[] args)
	{
		Planet earthObj = PlanetServices.createPlanetObj();
	}
}