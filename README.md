# Complex Number Calculator & User Data Form

🧮 A simple web application demonstrating form handling and server-side processing with Java Servlets. 💻

![Java](https://img.shields.io/badge/-Java-orange?logo=java&logoColor=white)
![HTML5](https://img.shields.io/badge/-HTML5-red?logo=html5&logoColor=white)
![Servlet](https://img.shields.io/badge/-Servlet-blue?logo=java&logoColor=white)

## Overview

This project presents a webpage with two distinct forms:

1. **Complex Number Calculator:** This form takes the real and imaginary parts of a complex number as input and sends them to the server for calculation (not implemented in this example, but could be extended to perform operations like addition, subtraction, etc.).

2. **User Data Form:** This form collects user information like username, gender, and agreement to terms and conditions.

Both forms utilize the POST method to submit data to the `MyServlet` servlet.

## Technologies Used

- **Java:** The core server-side language for the servlet. ☕
- **Servlets (Java):** Handles form submission and server-side logic. ⚙️
- **HTML5:** Structures the webpage and forms. 🌐
- **CSS3:** Styles the webpage (refer to `styles.css`). 🎨

## Setup and Running

1. **Prerequisites:** Ensure you have a Java Development Kit (JDK) and a web server (e.g., Apache Tomcat) installed and configured.
2. **Deployment:** Deploy the compiled servlet (`MyServlet.class`) and associated files (including `index.html` and `styles.css`) to your web server.
3. **Access:** Open the `index.html` file in your web browser.

## Code Structure

- **`index.html`:** Contains the HTML for both forms.
- **`styles.css`:** (Not provided, but assumed) Includes the CSS styling for the webpage.
- **`MyServlet.java`:** (Not provided, but crucial) The Java servlet that processes the form data. This servlet would handle the `doPost` method to retrieve the submitted values.

## Future Enhancements

- Implement actual complex number calculations within `MyServlet`.
- Add input validation to both forms.
- Enhance the user interface with JavaScript for dynamic interactions.
- Provide server-side validation and error handling.
- Implement data persistence (e.g., using a database) to store user data.

## Contributing

Contributions are welcome! Please feel free to submit pull requests.

## License

MIT License
