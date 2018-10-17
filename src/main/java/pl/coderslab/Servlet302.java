package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet302", urlPatterns = "/Servlet302")
public class Servlet302 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String binary = request.getParameter("binary");
        if(binary.matches("^1{1}[01]*$|^0$"))
        {
            char[] chars;
            chars = binary.toCharArray();

            for(int i = chars.length-1; i >= 0; i--)
            {
                //todo chars[i]
            }
        }
        else
        {
            wr.append("Podany ciąg nie jest poprawną liczbą binarną");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().append("<a href='/index302.html'>Formularz</a>");

    }
}
