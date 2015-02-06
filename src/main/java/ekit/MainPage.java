package ekit;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 
public class MainPage extends HttpServlet {
 
    private String responseTemplate;
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }
 
    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        setPage();
        response.setStatus(200);
        response.getWriter().write(responseTemplate);
    }
    private void setPage()
    {
        responseTemplate = "<!doctype html>\n" +
        "<html>\n" +
        "<body>\n" +
        "<pre><font size=\"3\" color=\"#F9074B\">Please, input your name:</font></pre>\n" +
        "<input type=\"text\" value=\"\" id=\"inputfield\" width=\"500\" height=\"20\">\n" +
        "<input type=\"button\" value=\"redirect\" onclick=\"window.location.replace('/SimpleServlet/hello?name=' + inputfield.value);\" width=\"100\" height=\"20\">\n" +
        "</body>\n" +
        "</html>" ;
    }
}