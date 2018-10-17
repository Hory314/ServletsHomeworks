package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet306", urlPatterns = "/Servlet306")
public class Servlet306 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String[] doubles = request.getParameterValues("number");
        wr.append("Liczby:<br>");


        if(doubles.length > 0)
        {
            double dMult = 1.0;
            double dSum = 0.0;
            int sumOfParsedDoubles = 0;
            for(String d : doubles)
            {
                try
                {
                    double dNumber = Double.parseDouble(d);
                    dSum += dNumber;
                    sumOfParsedDoubles++;
                    dMult *= dNumber;
                    wr.append("- " + dNumber + "<br>");
                }
                catch(NumberFormatException e)
                {
                    continue;
                }
            }
            wr.append("średnia:<br>");
            wr.append("- " + (dSum / sumOfParsedDoubles) + "<br>");

            wr.append("suma:<br>");
            wr.append("- " + dSum + "<br>");

            wr.append("iloczyn:<br>");
            wr.append("- " + dMult + "<br>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        wr.append("<form method='post'>");
        wr.append("<input type='number' step='0.01' name='number' placeholder='Podaj liczbę'><br>");
        wr.append("<input type='number' step='0.01' name='number' placeholder='Podaj liczbę'><br>");
        wr.append("<input type='number' step='0.01' name='number' placeholder='Podaj liczbę''><br>");
        wr.append("<input type='number' step='0.01' name='number' placeholder='Podaj liczbę'><br>");
        wr.append("<input type='submit'>");
        wr.append("</form>");
    }
}
