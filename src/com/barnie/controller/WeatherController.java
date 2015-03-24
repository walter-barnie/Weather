package com.barnie.controller;

import com.barnie.manager.WeatherManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wbarnie on 2/26/15.
 */
@Controller
@RequestMapping("/app/weatherData")
public class WeatherController {
    @Autowired
    private WeatherManager weatherManager;
    @RequestMapping(method = RequestMethod.GET,produces={"application/xml", "application/json"})
    public
    @ResponseBody
    String getWeatherData(@RequestParam(required = true) final String zipCode) {
       /* if (null == zipCode) {
            return "redirect:/index.html";
        }*/
        String weatherData = weatherManager.getWeatherByZipCode(zipCode);
        return weatherData;
    }
}