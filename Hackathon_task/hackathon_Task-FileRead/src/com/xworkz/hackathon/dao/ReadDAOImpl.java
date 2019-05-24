package com.xworkz.hackathon.dao;

import com.xworkz.hackathon.entity.ReadEntity;

public class ReadDAOImpl implements ReadDAO{
	SessionFactory factory;
	@Override
	public Integer save(ReadEntity entity) {
		System.out.println("invoked "+this.getClass().getSimpleName());
		
			
		
		return null;
	}
	
	

}
