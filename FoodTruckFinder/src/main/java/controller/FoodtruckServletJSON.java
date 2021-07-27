package controller;

import com.google.gson.Gson;
import models.FoodTruckJSON;
import service.FoodtruckServiceJSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FoodtruckServletJSON", value = "/FoodtruckServletJSON")
public class FoodtruckServletJSON extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private FoodtruckServiceJSON service = new FoodtruckServiceJSON();

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Return Java Object to JSON from the Java servlet
        List<FoodTruckJSON> foodTrucks = new ArrayList<>();
        foodTrucks = service.getFoodtrucks();

        // Create a Gson object to convert java object to JSON
        // and JSON to java object.
        Gson gson = new Gson();
        String foodTruckJSON = gson.toJson(foodTrucks);

        // Create a printWriter object from the response object
        PrintWriter pw = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Write a json to the printwriter
        pw.write(foodTruckJSON);
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
