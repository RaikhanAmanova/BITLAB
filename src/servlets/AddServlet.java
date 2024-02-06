package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Item;

import java.io.IOException;

@WebServlet(value = "/addItem")
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id")); // Изменено на Long
        String name = req.getParameter("name");
        Integer price = Integer.parseInt(req.getParameter("price"));
        Integer amount = Integer.parseInt(req.getParameter("amount"));
        Item item = new Item(id, name, price, amount); // Предполагается, что конструктор принимает Long, String, Integer, Integer
        DBManager.addItem(item);
        resp.sendRedirect("/items");




    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addItems.jsp").forward(req,resp);
    }
}
