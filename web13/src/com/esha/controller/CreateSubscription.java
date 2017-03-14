package com.esha.controller;


import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;
import com.esha.model.*;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import com.Demo2.My_parent;

import com.esha.model.Success;
import com.esha.service.Create;
import com.esha.utils.Authentication;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.ResponseSuccess;
@WebServlet("/CreateSubscription")
public class CreateSubscription extends HttpServlet {
private static final long serialVersionUID = 1L;

     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ObjectMapper mapper = new ObjectMapper();
    	PrintWriter printWriter = response.getWriter();
    	response.setContentType("application/json");
        String eventUrl= (String) request.getParameter("eventUrl");
        
        response.setStatus(200);
        ResponseSuccess responseObject=null;     
        try{
             OAuthConsumer consumer = new DefaultOAuthConsumer("eshaproduct1-154467", "hLGInup73QSL46Yc");
             URL url = new URL(eventUrl);
             HttpURLConnection req = (HttpURLConnection) url.openConnection();
             req.setRequestProperty("Accept", "application/json");
             consumer.sign(req);
             req.connect();             
                                 
             BufferedReader bufferReader = new BufferedReader(new InputStreamReader(req.getInputStream()));
             String string = bufferReader.readLine();
             System.out.println(string);
             bufferReader.close();
             
             My_parent myParent = mapper.readValue(string,My_parent.class);   
             
             Create create = new Create();
             
             Boolean bool = create.createService(myParent);
             
             if(bool)
                 responseObject = new ResponseSuccess(true,"TechChallenge-account-identifier");
             else
                 responseObject = new ResponseSuccess(false,"TechChallenge-account-identifier");
                
             
             String json = mapper.writeValueAsString(responseObject); 
             printWriter.print(json);
        }catch(Exception e){
            e.printStackTrace();
}
    }
}
