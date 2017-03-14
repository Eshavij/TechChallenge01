package Demo;
import java.io.*;

import javax.servlet.*;



public class Testing extends GenericServlet
{

	public void init(ServletConfig config){
		System.out.println("my first servlet");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("Welcome to world of hacking");
    out.println("<html><body bgcolor=#936 text=yellow>");
    out.println("<h1 align=center>HAT HACKER</h1>");
    out.println("<ul><li>H</li><li>R</li></ul>");
    out.println("</body></html>");
	
	
	}
	public void destroy(){
		
	}
	

}
