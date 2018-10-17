package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet301", urlPatterns = "/Servlet301")
public class Servlet301 extends HttpServlet
{
    public static double EurToPln(double eur)
    {
        return eur * 4.2936;
    }

    public static double PlnToEur(double pln)
    {
        return pln / 4.2936;
    }

    public static double UsdToPln(double usd)
    {
        return usd * 3.7123;
    }

    public static double PlnToUsd(double pln)
    {
        return pln / 3.7123;
    }

    public static double UsdToEur(double usd)
    {
        return usd * 0.8652;
    }

    public static double EurToUsd(double eur)
    {
        return eur / 0.8652;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try
        {
            double val = Double.parseDouble(request.getParameter("price"));
            String convType = request.getParameter("convType");
            switch(convType)
            {
                case "eurusd":
                    wr.append((EurToUsd(val)) + "");
                    break;
                case "usdeur":
                    wr.append(UsdToEur(val) + "");
                    break;
                case "eurpln":
                    wr.append(EurToPln(val) + "");
                    break;
                case "plneur":
                    wr.append((PlnToEur(val)) + "");
                    break;
                case "usdpln":
                    wr.append(UsdToPln(val) + "");
                    break;
                case "plnusd":
                    wr.append((PlnToUsd(val)) + "");
                    break;
                default:
                    break;
            }
        }
        catch(NumberFormatException e)
        {
            wr.append("Podana wartosc nie jest liczba");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().append("<a href='/index301.html'>Formularz</a>");
    }
}
