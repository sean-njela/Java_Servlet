import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("real") != null && request.getParameter("imaginary") != null) {
                // Complex number calculations
                try {
                    double real = Double.parseDouble(request.getParameter("real"));
                    double imaginary = Double.parseDouble(request.getParameter("imaginary"));

                    double absolute = calculateAbsolute(real, imaginary);
                    double argument = calculateArgument(real, imaginary);
                    String conjugate = calculateConjugate(real, imaginary);

                    // Output HTML with linked CSS
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Complex Results</title>");
                    out.println("<link rel=\"stylesheet\" href=\"styles.css\">"); // Link to CSS
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div class=\"grid-item\">"); // Use CSS class


                    out.println("<table>");
                    out.println("<tr><th>Property</th><th>Value</th></tr>");
                    out.println("<tr><td>Absolute Value</td><td>" + absolute + "</td></tr>");
                    out.println("<tr><td>Argument</td><td>" + argument + " radians</td></tr>");
                    out.println("<tr><td>Conjugate</td><td>" + conjugate + "</td></tr>");
                    out.println("</table>");

                    out.println("</div>"); // Close the div
                    out.println("</body>");
                    out.println("</html>");



                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    out.println("<!DOCTYPE html>");
                    out.println("<html><head><title>Error</title><link rel=\"stylesheet\" href=\"styles.css\"></head><body>");
                    out.println("<div class=\"grid-item\">");  // Ensure consistent styling for errors
                    out.println("<p>Invalid input for complex numbers.</p>");
                    out.println("</div>");
                    out.println("</body></html>");

                }

            } else { // other form processing (username, gender, terms)
                 String username = request.getParameter("username");
                String gender = request.getParameter("gender");
                String terms = request.getParameter("terms");

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>User Input Results</title>"); 
                out.println("<link rel=\"stylesheet\" href=\"styles.css\">"); // Link to CSS
                out.println("</head>");
                out.println("<body>");

                out.println("<div class=\"grid-item\">"); // Use CSS class
                if (username != null && gender != null) {
                   out.println("<p>Username: " + username + "</p>");
                   out.println("<p>Gender: " + gender + "</p>");
                    if (terms != null && terms.equals("agree")) {
                      out.println("<p>Terms and Conditions: Agreed</p>");
                    } else {
                      out.println("<p>Terms and Conditions: Not Agreed</p>");
                   }
                } else {
                    out.println("<p>No data submitted.</p>"); 
                }
               out.println("</div>"); // Close the div
                out.println("</body>");
                out.println("</html>");
            }
        }
    }



    private double calculateAbsolute(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    private double calculateArgument(double real, double imaginary) {
        return Math.atan2(imaginary, real);
    }

    private String calculateConjugate(double real, double imaginary) {
        return real + " - " + imaginary + "i";
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doPost(request, response); // Handle GET requests the same as POST

    }



    @Override
    public String getServletInfo() {
        return "Servlet handling complex numbers and other form data";
    }
}

