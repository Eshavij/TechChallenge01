package com.esha.utils;

import org.codehaus.jackson.map.ObjectMapper;

import com.Demo2.My_parent;

public class Map {

	public My_parent jmap(String str)
	{
		ObjectMapper om = new ObjectMapper();

		My_parent p = new My_parent();

		try

		{

		p=om.readValue(str,My_parent.class);

		}

		catch(Exception e)

		{

		e.printStackTrace();

		}

		return p;
}	

}
