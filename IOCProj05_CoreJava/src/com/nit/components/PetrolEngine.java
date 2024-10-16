package com.nit.components;

public class PetrolEngine implements IEngine {

	@Override
	public void engineAssembly() {
		System.out.println("PetrolEngine: assembly done.");
		
	}

	@Override
	public String toString() {
		return "PetrolEngine [getClass()=" + getClass() + "]";
	}

}
