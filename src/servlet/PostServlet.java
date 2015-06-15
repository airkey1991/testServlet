package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; carset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("...");
		out.println("</html>");

//		request.setCharacterEncoding("UTF-8");
//		String mame = request.getParameter("name");

	}

}
