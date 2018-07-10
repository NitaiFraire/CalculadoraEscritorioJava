package class20calculadora;

public class Calculadora
{
    public double Suma(double a, double b)
    {
        return a + b;
    }
    
    public double Resta(double a, double b)
    {
        return a - b;
    }
    
    public double Multiplicacion(double a, double b)
    {
        return a * b;
    }
    
    public double Division(double a, double b)
    {
        return a / b;
    }
    
    public double Potencia(double a, double b)
    {
        double resultado = Math.pow(a, b);
        return resultado;
    }
    
}
