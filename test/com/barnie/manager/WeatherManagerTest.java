package com.barnie.manager;

import com.barnie.generated.WeatherReturn;
import com.barnie.utility.JAXBMapperSample;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import com.barnie.manager.WeatherManager;

import javax.xml.ws.BindingProvider;
import java.io.IOException;


/**
 * Created by wbarnie on 2/23/15.
 */
public class WeatherManagerTest {
    @Test
    public void testWeatherByZipcode() {
        WeatherManager weatherManager = new WeatherManager();
        String json = weatherManager.getWeatherByZipCode("01603");
        assertNotNull("Json string is null", json);
        JAXBMapperSample jaxbMapperSample = new JAXBMapperSample();
        try {
            WeatherReturn weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Worcester", weatherReturn.getCity());
            assertEquals("Wrong State returned", "MA", weatherReturn.getState());
            assertEquals("Wrong Description returned", "Cloudy", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "30.03S", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "54", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "",weatherReturn.getVisibility());
            assertEquals("Wrong Weather Id returned", 14, weatherReturn.getWeatherID());
            assertEquals("Wrong Relative Humidity returned", "97", weatherReturn.getRelativeHumidity());
            assertEquals("Wrong Weather Station City( returned", "Worcester", weatherReturn.getWeatherStationCity());
            assertEquals("Wrong Wind returned", "VRB5", weatherReturn.getWind());
            assertEquals("Wrong WindChill returned", "", weatherReturn.getWindChill());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
