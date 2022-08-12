package Temperatura;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class Temperatura {

    @WebMethod(operationName = "FahrenheitCelcius")
    public String FahrneitCelcius(@WebParam(name = "temperaturaFahrenheit") Double grad) {
        double celsius = ((grad - 32)* 5)/9;
        return "Celsius :" + celsius;
    }

    @WebMethod(operationName = "CelsiusFahrenheit")
    public String CelciusFahrenheit (@WebParam(name = "temperaturaCelcius") Double grad)
    {
        double fahren = (grad * 9/5) + 32;
        return "Fahrenheit :" + fahren;
    }
}
