package ConversorTemperatura;

/*
 * @author Jeremy Huertas
 */
public class ConversorTemperatura {
    private double Valor = 0;
    private String Opcion = "";

    public ConversorTemperatura() {
    }

    public double getValor() {
        return Valor;
    }

    public String getOpcion() {
        return Opcion;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }
    
    
    public double Conversion()
    {
    double resultado = 0;

    switch (this.Opcion)
    {
        case "Celsius → Fahrenheit":
            resultado = (Valor * 9.0 / 5.0) + 32;
            break;

        case "Fahrenheit → Celsius":
            resultado = (Valor - 32) * 5.0 / 9.0;
            break;

        case "Celsius → Kelvin":
            resultado = Valor + 273.15;
            break;

        case "Kelvin → Celsius":
            resultado = Valor - 273.15;
            break;
    }

    return resultado;
    }
}