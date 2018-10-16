package pl.coderslab;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet141", urlPatterns = "/Servlet041")
public class Servlet141 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();

        wr.append("<!doctype html><html><head><title>141</title></head><body>");
        wr.append("<a href=\"/Servlet042?id=6\">Link do 142</a>");
        wr.append("</body></html>");
    }
}
