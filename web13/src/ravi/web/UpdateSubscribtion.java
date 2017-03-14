package ravi.web;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.*;

import org.apache.catalina.User;
import org.codehaus.jackson.map.ObjectMapper;

import com.Demo2.Marketplace;
import com.Demo2.My_parent;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.ResponseSuccess;

public class UpdateSubscribtion  extends HttpServlet{
	private static final long serialVersionUID= 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
	response.setContentType("application/json");
	
	
	ObjectMapper mapper=null;
	My_parent obj=null;

	User u1=null;

		 mapper=new ObjectMapper();
		 PrintWriter out = response.getWriter();
	String eventUrl = (String) request.getParameter("eventUrl");
	
	
	
	
	response.setStatus(200);
	ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-identifier");
	String json = mapper.writeValueAsString(responseObject);
	out.print(json);
	//System.out.println(eventUrl);
	
	OAuthConsumer consumer = new DefaultOAuthConsumer("eshaproduct-154074", "bHSf0hnKwP1f4Ezs");
	URL url = new URL(eventUrl);
	HttpURLConnection req = (HttpURLConnection) url.openConnection();
	
	req.setRequestProperty("Accept", "application/json");
	try{
		consumer.sign(req);
		req.connect();
	}catch(Exception e){
		e.printStackTrace();
	}
	req.connect();
	 BufferedReader f = new BufferedReader(new InputStreamReader(req.getInputStream()));
     String last="";
     String str="";
     while((last=f.readLine())!=null)
     {
         System.out.println(last);
         str=str+last;
     }
     System.out.println("str is "+str);
     ObjectMapper om = new ObjectMapper();

    My_parent p = om.readValue(str,My_parent.class);


     //System.out.println("*********");

     //System.out.println(p);


     Marketplace mp = p.getMarketplace();

     System.out.println(mp.getBaseUrl());
  
	

	 
	 
 }
}
