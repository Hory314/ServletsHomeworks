package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet304", urlPatterns = "/Servlet304")
public class Servlet304 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        Cookie cookie = CookieService.getCookie(request, "visits");
        int counter = 0;
        try
        {
            counter = Integer.parseInt(cookie.getValue());
        }
        catch(NullPointerException | NumberFormatException e) // jak sie nie uda parsować (czyli w ciachu są jakieś nie-liczby) to niby ze nie ma ciacha
        {
            cookie = null;
        }

        if(cookie != null) // mamy ciacho!
        {

            wr.append("<h2>Odwiedziłeś już naszą stronę " + counter + " razy.</h2>");
            cookie.setValue("" + (counter + 1));
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
        }
        else // nie ma ciacha :(
        {
            wr.append("<h1>Witaj pierwszy raz na naszej stronie!<h1>");
            cookie = new Cookie("visits", "1");
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
        }
    }
}
