package Aritmetica;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class Aritmetica {

    @WebMethod(operationName ="Suma")
    public String suma (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 + val2;
        return "Resultado: " + result;
    }

    @WebMethod(operationName ="Resta")
    public String resta (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 - val2;
        return "Resultado: " + result;
    }

    @WebMethod(operationName ="Multi")
    public String multi (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 * val2;
        return "Resultado: " + result;
    }

    @WebMethod(operationName ="Div")
    public String div (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        if(val2 == 0)
        {
            return "No es posible dividir entre 0";
        }

        double result = val1 / val2;
        return "Resultado: " + result;
    }
}
