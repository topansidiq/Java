package web;

import java.io.IOException;

import java.lang.InterruptedException;
import java.lang.RuntimeException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/unsafe")
public class UnsafeServlet extends HttpServlet {

  private String response = "";

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    String name = req.getParameter("name");
    Long sleep = Long.parseLong(req.getParameter("sleep"));

    response = "Hello " + name;
    try {
      Thread.sleep(sleep);
    } catch (InterruptedException exception) {
      throw new RuntimeException(exception);
    }
    res.getWriter().println(response);
  }

}
