import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "CurrencyConverterServlet", value = "/convert")

public class CurrencyConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));

        double vnd = rate * usd;

        PrintWriter writer = response.getWriter();

        writer.print("<p>Rate : " + rate + "</p>");
        writer.print("<p>USD : " + usd + "</p>");
        writer.print("<p>VND : " + vnd + "</p>");
        response.addHeader("output", "" + vnd);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
