package lista08;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servelett")
public class servelett extends HttpServlet{
	
	private static final long serialVersionUID = 1;
	
	protected void doPost(HttpServletRequest request,                       
            HttpServletResponse response){
		try{
			String numa = request.getParameter("num1");
			String numb = request.getParameter("num2");
			Integer num1 = Integer.parseInt(numa);
			Integer num2 = Integer.parseInt(numb);
			PrintWriter writer = response.getWriter();
			writer.append( " <HTML>  <BODY> " );
			if(num1!=null   &&  num2!=null) {
				writer.append("<br> Soma:" + (num1 + num2));
				writer.append("<br> Subtracao:" + (num1 - num2));
				writer.append("<br> Divisao:" + (num1 / num2));
				writer.append("<br> Resto da divisao:" + (num1 % num2));
			}else {  
				writer.append("número não pode ser nulo");  
				}
				writer.append( "</BODY>  </HTML>" );
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}




