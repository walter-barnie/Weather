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
        try {
            String json = weatherManager.getWeatherByZipCode("01603");
            assertNotNull("Json string is null", json);
            JAXBMapperSample jaxbMapperSample = new JAXBMapperSample();

            WeatherReturn weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Worcester", weatherReturn.getCity());
            assertEquals("Wrong State returned", "MA", weatherReturn.getState());
            assertEquals("Wrong Description returned", "Cloudy", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "30.03S", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "54", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "", weatherReturn.getVisibility());
            assertEquals("Wrong Weather Id returned", 14, weatherReturn.getWeatherID());
            assertEquals("Wrong Relative Humidity returned", "97", weatherReturn.getRelativeHumidity());
            assertEquals("Wrong Weather Station City( returned", "Worcester", weatherReturn.getWeatherStationCity());
            assertEquals("Wrong Wind returned", "VRB5", weatherReturn.getWind());
            assertEquals("Wrong WindChill returned", "", weatherReturn.getWindChill());

            json = weatherManager.getWeatherByZipCode("10468");
            assertNotNull("Json string is null", json);

            weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Bronx", weatherReturn.getCity());
            assertEquals("Wrong State returned", "NY", weatherReturn.getState());
            assertEquals("Wrong Description returned", "N/A", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "29.97S", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "63", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "", weatherReturn.getVisibility());
            assertEquals("Wrong Weather Id returned", 15, weatherReturn.getWeatherID());
            assertEquals("Wrong Relative Humidity returned", "87", weatherReturn.getRelativeHumidity());
            assertEquals("Wrong Weather Station City( returned", "White Plains", weatherReturn.getWeatherStationCity());
            assertEquals("Wrong Wind returned", "E7", weatherReturn.getWind());
            assertEquals("Wrong WindChill returned", "", weatherReturn.getWindChill());


            json = weatherManager.getWeatherByZipCode("07446");
            assertNotNull("Json string is null", json);

            weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Ramsey", weatherReturn.getCity());
            assertEquals("Wrong State returned", "NJ", weatherReturn.getState());
            assertEquals("Wrong Description returned", "Partly Sunny", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "30.53R", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "61", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "", weatherReturn.getVisibility());
            assertEquals("Wrong Weather Id returned", 9, weatherReturn.getWeatherID());
            assertEquals("Wrong Relative Humidity returned", "75", weatherReturn.getRelativeHumidity());
            assertEquals("Wrong Weather Station City( returned", "Newark", weatherReturn.getWeatherStationCity());
            assertEquals("Wrong Wind returned", "N9", weatherReturn.getWind());
            assertEquals("Wrong WindChill returned", "", weatherReturn.getWindChill());

            json = weatherManager.getWeatherByZipCode("04401");
            assertNotNull("Json string is null", json);

            weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Bangor", weatherReturn.getCity());
            assertEquals("Wrong State returned", "ME", weatherReturn.getState());
            assertEquals("Wrong Description returned", "Cloudy", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "30.08F", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "52", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "", weatherReturn.getVisibility());
            assertEquals("Wrong Weather Id returned", 14, weatherReturn.getWeatherID());
            assertEquals("Wrong Relative Humidity returned", "83", weatherReturn.getRelativeHumidity());
            assertEquals("Wrong Weather Station City( returned", "Bangor", weatherReturn.getWeatherStationCity());
            assertEquals("Wrong Wind returned", "N7", weatherReturn.getWind());
            assertEquals("Wrong WindChill returned", "", weatherReturn.getWindChill());

            json = weatherManager.getWeatherByZipCode("00000");
            assertNotNull("Json string is null", json);

            weatherReturn = jaxbMapperSample.jsonUnmarshall(json, WeatherReturn.class);
            assertTrue("Weather Service Failed", weatherReturn.isSuccess());
            assertEquals("Wrong City returned", "Worcester", weatherReturn.getCity());
            assertEquals("Wrong State returned", "MA", weatherReturn.getState());
            assertEquals("Wrong Description returned", "Cloudy", weatherReturn.getDescription());
            assertEquals("Wrong Pressure returned", "30.03S", weatherReturn.getPressure());
            assertEquals("Wrong Remarks returned", "", weatherReturn.getRemarks());
            assertEquals("City not found", "City Found", weatherReturn.getResponseText());
            assertEquals("Wrong Temperature returned", "54", weatherReturn.getTemperature());
            assertEquals("Wrong Visibility returned", "", weatherReturn.getVisibility());
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
