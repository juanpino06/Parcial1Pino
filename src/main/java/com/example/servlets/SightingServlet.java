package com.example.servlets;
import com.example.config.Application;
import com.example.service.ExpeditionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet
public class SightingServlet {

    @Override
    public void init() throws ServletException {
        SightingService = Application
                .getContext()
                .getBean(ExpeditionService.class);
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

    }

}
