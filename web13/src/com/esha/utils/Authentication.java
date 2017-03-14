package com.esha.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.Demo2.Marketplace;
import com.Demo2.My_parent;
import com.esha.utils.*;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;


public class Authentication {
	public static My_parent Signin(String myurl){
		
        String str="";

		try {

	        DefaultOAuthConsumer e = new DefaultOAuthConsumer("eshaproduct1-154467", "hLGInup73QSL46Yc");

	           
	            URL url = new URL(myurl);
	          
	            HttpURLConnection request = (HttpURLConnection)url.openConnection();
	        
	            request.setRequestProperty("Accept", "application/json");

	            e.sign(request);
	            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));

	            String line="";

	         
	            while((line = in.readLine())!=null)

	            {

	            str= str+line;

	            }

	            System.out.println("str is "+str);

	            ObjectMapper om = new ObjectMapper();

	            My_parent p = om.readValue(str, My_parent.class);

	            Marketplace mp = p.getMarketplace();

	            System.out.println(mp.getBaseUrl());

	        
		}
	        catch (Exception e) {

	        e.printStackTrace();

	        }       

	      
			return new Map().jmap(str);
		
		
	}

}
