package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@WebServlet(name = "Servlet15", urlPatterns = "/Servlet15")
public class Servlet15 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Writer wr = response.getWriter();
        String relativePath = getServletContext().getRealPath("header.html");

        File file = new File(relativePath);
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine())
        {
            wr.append(scan.nextLine() + "\n");
        }


        Random generator = new Random();
        List<Integer> rand = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            rand.add(generator.nextInt(99) + 1);
        }
        wr.append("<table>\n");
        for(Integer el : rand)
        {
            wr.append("<tr><td>" + el + "</td></tr>\n");
        }
        wr.append("</table>\n<hr>\n");

        // tera sortujemy
        rand.sort((a, b) -> {
            return a - b;
        });
        wr.append("<table>\n");
        for(Integer el : rand)
        {
            wr.append("<tr><td>" + el + "</td></tr>\n");
        }
        wr.append("</table>\n");

        relativePath = getServletContext().getRealPath("footer.html");
        file = new File(relativePath);
        scan = new Scanner(file);
        while(scan.hasNextLine())
        {
            wr.append(scan.nextLine() + "\n");
        }

    }
}
