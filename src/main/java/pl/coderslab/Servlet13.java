package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

@WebServlet(name = "Servlet13", urlPatterns = {"/Servlet13"})
public class Servlet13 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //todo
        /*Scanner scan = new Scanner("oop.txt");
        while(scan.hasNextLine())
        {

        }*/

        String oop = "ABAP\n" + "Ada 95\n" + "AmigaE\n" + "BETA\n" + "Blue\n" + "Boo\n" + "C++\n" + "C#\n" + "Ceylon\n" + "Chapel\n" + "Clarion\n" + "CLU\n" + "COBOL\n" + "Cobra\n" + "ColdFusion\n" + "Common Lisp\n" + "COOL\n" + "CorbaScript\n" + "Curl\n" + "D\n" + "Dart\n" + "DataFlex\n" + "Dylan\n" + "E\n" + "Eiffel\n" + "Sather\n" + "Elixir\n" + "Falcon\n" + "Fortran 2003\n" + "FPr\n" + "FreeBASIC\n" + "F-Script\n" + "F#\n" + "Gambas\n" + "Go\n" + "Graphtalk\n" + "IDLscript\n" + "J\n" + "J#\n" + "JADE\n" + "Java\n" + "Groovy\n" + "Join Java\n" + "X10\n" + "Julia\n" + "Lasso\n" + "Lava\n" + "Lexico\n" + "Lingo\n" + "LISP\n" + "Logtalk\n" + "MATLAB\n" + "Modula-2\n" + "Modula-3\n" + "Nemerle\n" + "NetRexx\n" + "Nim\n" + "Noop\n" + "Oberon (Oberon-1)\n" + "Oberon-2\n" + "Object Pascal\n" + "Delphi\n" + "Free Pascal\n" + "Turbo Pascal\n" + "Object REXX\n" + "Objective-C\n" + "OCaml\n" + "Omnis Studio\n" + "OpenEdge Advanced Business Language\n" + "Oz, Mozart Programming System\n" + "Perl since v5\n" + "PHP5\n" + "Power Builder\n" + "Prototype-based languages\n" + "Actor-Based Concurrent Languages: ABCL/1, ABCL/R, ABCL/R2, ABCL/c+\n" + "Agora\n" + "Cecil\n" + "ECMAScript\n" + "ActionScript\n" + "JavaScript\n" + "JScript\n" + "Etoys (in Squeak)\n" + "Io\n" + "Lua\n" + "Lisaac\n" + "MOO\n" + "NewtonScript\n" + "Obliq\n" + "REBOL\n" + "Self\n" + "Python\n" + "REALbasic\n" + "Ruby\n" + "Rust\n" + "S\n" + "R\n" + "Scala\n" + "Seed7\n" + "SenseTalk\n" + "Simula\n" + "Smalltalk\n" + "Self\n" + "Bistro\n" + "Squeak\n" + "Pharo\n" + "Newspeak\n" + "Squirrel\n" + "Swift\n" + "TADS\n" + "Tcl\n" + "Xotcl (similar to CLOS)\n" + "Snit (uses delegation)\n" + "incr Tcl (itcl; similar to C++)\n" + "Transcript\n" + "TypeScript\n" + "Ubercode\n" + "Vala\n" + "Visual Basic\n" + "Visual Basic .NET (VB.NET)\n" + "VBScript\n" + "Visual Basic for Applications (VBA)\n" + "Visual FoxPro\n" + "Visual Prolog\n" + "XBase++ (extends xBase standard language)\n" + "ZZT-oop\n";
        Writer wr = response.getWriter();

        wr.append(oop);
    }
}
