
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.barnie.generated;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-02-14T10:26:22.179-05:00
 * Generated source version: 2.7.14
 * 
 */

@javax.jws.WebService(
                      serviceName = "Weather",
                      portName = "WeatherSoap",
                      targetNamespace = "http://ws.cdyne.com/WeatherWS/",
                      wsdlLocation = "http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL",
                      endpointInterface = "com.barnie.generated.WeatherSoap")
                      
public class WeatherSoapImpl1 implements WeatherSoap {

    private static final Logger LOG = Logger.getLogger(WeatherSoapImpl1.class.getName());

    /* (non-Javadoc)
     * @see com.barnie.generated.WeatherSoap#getCityWeatherByZIP(java.lang.String  zip )*
     */
    public com.barnie.generated.WeatherReturn getCityWeatherByZIP(java.lang.String zip) {
        LOG.info("Executing operation getCityWeatherByZIP");
        System.out.println(zip);
        try {
            com.barnie.generated.WeatherReturn _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.barnie.generated.WeatherSoap#getWeatherInformation(*
     */
    public com.barnie.generated.ArrayOfWeatherDescription getWeatherInformation() {
        LOG.info("Executing operation getWeatherInformation");
        try {
            com.barnie.generated.ArrayOfWeatherDescription _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.barnie.generated.WeatherSoap#getCityForecastByZIP(java.lang.String  zip )*
     */
    public com.barnie.generated.ForecastReturn getCityForecastByZIP(java.lang.String zip) {
        LOG.info("Executing operation getCityForecastByZIP");
        System.out.println(zip);
        try {
            com.barnie.generated.ForecastReturn _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
