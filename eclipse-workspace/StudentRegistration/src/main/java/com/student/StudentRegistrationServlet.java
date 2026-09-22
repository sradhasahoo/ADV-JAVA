
package com.student;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentRegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Handle GET request
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect(
                request.getContextPath() + "/register.jsp"
        );
    }

    // Handle POST request
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        String errorMessage = null;

        // Name validation
        if (name == null || name.trim().isEmpty()) {

            errorMessage = "Student name cannot be empty.";

        }

        // Email validation
        else if (email == null || email.trim().isEmpty()) {

            errorMessage = "Email ID cannot be empty.";

        }

        else if (!email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            errorMessage = "Please enter a valid email ID.";

        }

        // Course validation
        else if (course == null || course.trim().isEmpty()) {

            errorMessage = "Please select a course.";

        }

        // If validation fails
        if (errorMessage != null) {

            request.setAttribute("error", errorMessage);

        }

        // If validation succeeds
        else {

            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("course", course);

        }

        // Forward to result.jsp
        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}