package ravi.web;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.net.HttpURLConnection;

import java.net.URL;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.Demo2.Marketplace;
import com.Demo2.My_parent;

import oauth.signpost.OAuthConsumer;

import oauth.signpost.basic.DefaultOAuthConsumer;

import ravi.model.ResponseSuccess;



//@WebServlet("/CreateSubscription")

/*public class CreateSubscription extends HttpServlet {


private static final long serialVersionUID = 1L;

       

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    response.setContentType("application/json");


    PrintWriter out= response.getWriter();


    String eventUrl= (String) request.getParameter("eventUrl");


    System.out.println(eventUrl);


			ObjectMapper mapper= new ObjectMapper();
			
			
			ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-modifier");
			
			
			
			String json= mapper.writeValueAsString(responseObject);
			
			
			out.print(json);
			
			
			OAuthConsumer consumer = new DefaultOAuthConsumer("eshaproduct-154074", "bHSf0hnKwP1f4Ezs");
			
			URL url = new URL(eventUrl);
			
			HttpURLConnection requestres = (HttpURLConnection) url.openConnection();
			
			requestres.setRequestProperty("Accept", "application/json");
			
			
			try
			
			{
			
			consumer.sign(requestres);
			
			requestres.connect();
			
			}
			
			catch(Exception e)
			
			{
			
			e.printStackTrace();
			
			}
			
			
			BufferedReader js= new BufferedReader(new InputStreamReader(requestres.getInputStream()));
			
			String line = "";
			
			String row = "";
			
			
			while((line = js.readLine())!=null)
			
			{
			
			//System.out.println(l);
			
			  row = row + line;
			
			}
			
			System.out.println(row);
			
			
			ObjectMapper mapme = new ObjectMapper();
			
			My_parent par = mapme.readValue(row,My_parent.class);
			
			
			System.out.println("*********");
			
			
			Marketplace mp = par.getMarketplace();
			
			
			System.out.println(mp.getBaseUrl());
			
			
			}
			
			}*/
