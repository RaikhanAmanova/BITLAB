package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Item;

import java.io.IOException;

@WebServlet(value = "/updateItem")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String amount = req.getParameter("amount");
        Item item = new Item();
        item.setId(Long.valueOf(id));
        item.setName(name);
        item.setPrice(Double.parseDouble(price));
        item.setAmount(Integer.parseInt(amount));
        DBManager.updateItem(item);
        resp.sendRedirect("/items");
    }
}