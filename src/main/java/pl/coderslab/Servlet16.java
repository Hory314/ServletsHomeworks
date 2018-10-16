package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Servlet16", urlPatterns = "/Servlet16")
public class Servlet16 extends HttpServlet
{


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();

        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements())
        {
            String key = (String)headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            wr.append(key + " : " + map.get(key) + "\n");
        }

    }
}
