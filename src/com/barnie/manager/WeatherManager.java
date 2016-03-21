package com.barnie.manager;

import com.barnie.generated.*;
import com.barnie.utility.JAXBMapperSample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by WBarnie on 2/19/2015.
 */
public class WeatherManager {
    public String getWeatherByZipCode(String zipCode) {
        String json = "{ \"Success\": false}";
        Weather weather = new Weather();
        WeatherSoap weatherSoap = weather.getWeatherSoap12();
        WeatherReturn weatherReturn = null;
        try {
            weatherReturn = weatherSoap.getCityWeatherByZIP(zipCode);
        } catch (Exception e) {
            return json;
        }
        try {
            JAXBMapperSample jaxbMapperSample = new JAXBMapperSample();
            json = jaxbMapperSample.jsonMarshall(weatherReturn);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
            return json;
        }

        return json;
    }
}
