package com.moses.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moses.Dao.ItemDao;


/**
 * Servlet implementation class RecordServlet
 */
@WebServlet("/RecordServlet")
public class RecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, String> errors;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		errors = new HashMap<>();
	
		
		
		//PrintWriter out = response.getWriter();
		
				int code=Integer.parseInt(request.getParameter("code"));
				String name=request.getParameter("name");
				String brandUnit=request.getParameter("brandUnit");
				Double unitPrice=Double.parseDouble(request.getParameter("unitPrice"));
				String quantity=request.getParameter("quantity");
				LocalDate registrationDate= LocalDate.now();
			
				if(!Integer.toString(code).matches("[0-9]{4}")) {
					errors.put("codeerror", "must be 4 digits");
				}
				
                 if(!errors.isEmpty()) {
					

					request.getSession().setAttribute("errors", errors);
					response.sendRedirect("item-record.jsp");
				}

                 else {
					ItemDao.saveItem(code,  name,  brandUnit,  unitPrice,  quantity,  registrationDate);
					//out.println("save "+ code);
					response.sendRedirect("store.jsp");
                 }
	}

}
