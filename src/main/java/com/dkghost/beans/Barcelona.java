package com.dkghost.beans;

import org.springframework.stereotype.Component;

import com.dkghost.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}
	
}
