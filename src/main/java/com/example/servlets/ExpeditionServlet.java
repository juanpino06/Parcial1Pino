package com.example.servlets;
import com.example.service.ExpeditionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/expeditions")
public class ExpeditionServlet extends HttpServlet {
    private ExpeditionService expeditionService;

    @Override
    public void init() throws ServletException {
        missionLogService = Application
                .getContext()
                .getBean(MissionLogService.class);
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Expedition Management</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Expedition Management</h1>");

        out.println(
                "<a href='"
                        + request.getContextPath()
                        + "/sighting'>View sighting</a>"
        );

        String error = (String) request.getAttribute("error");

        if (error != null) {
            out.println("<p style='color:red;'>" + error + "</p>");
        }

        printForm(out, request);
        printSighting(out);

        out.println("</body>");
        out.println("</html>");
    }
}