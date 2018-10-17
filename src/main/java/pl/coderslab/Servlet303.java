package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet303")
public class Servlet303 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        wr.append("<form method='post'>");
        wr.append("<input type='text' name='somename' placeholder='Wpisz coś' value=''><br>");
        wr.append("<input type='text' name='somename' placeholder='Wpisz coś' value=''><br>");
        wr.append("<input type='text' name='somename' placeholder='Wpisz coś' value=''><br>");
        wr.append("<input type='text' name='somename' placeholder='Wpisz coś' value=''><br>");
        wr.append("<input type='text' name='somename' placeholder='Wpisz coś' value=''><br>");
        wr.append("<input type='submit'>");
        wr.append("</form>");

        // todo sesje

    }
}
