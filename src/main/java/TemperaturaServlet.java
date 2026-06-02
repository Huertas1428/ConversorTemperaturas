import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ConversorTemperatura.ConversorTemperatura;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/TemperaturaServlet")
/**
 *
 * @author Jeremy Huertas
 */
public class TemperaturaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	// Creamos las variables a utilizar obteniendo lo ingresado por el usuario

	double valor = Double.parseDouble(request.getParameter("Temperatura"));
        String opcion = request.getParameter("TempOption");

	// Creamos la instancia para asignar y calcular los valores digitados por el usuario:
        ConversorTemperatura conversor = new ConversorTemperatura();
        conversor.setValor(valor);
        conversor.setOpcion(opcion);

	// Realizamos el cálculo tras las asignaciones y opcion elegida:
        double resultado = conversor.Conversion();

        response.setContentType("text/html;charset=UTF-8");

	// Mostramos el resultado
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>Conversión de temperatura</h1>");
            out.println("<p>Temperatura ingresada: " + valor + "</p>");
            out.println("<p>Conversión seleccionada: " + opcion + "</p>");
            out.println("<p>Resultado: " + resultado + "</p>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}