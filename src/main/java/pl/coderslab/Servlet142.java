package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet142", urlPatterns = "/Servlet042")
public class Servlet142 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };

        try
        {
            wr.append(products[id]);
        }
        catch(IndexOutOfBoundsException e)
        {
            wr.append("Product not found");
        }
    }
}
