'use strict';
/**
 * Created by wbarnie on 3/4/15.
 */

/* Services */

var weatherServices = angular.module('weatherServices', []);

weatherServices.factory("WeatherService", ['$http', '$log', function ($http, $log, zipCode) {
    return {
        getWeatherData: function (zipCode) {
            console.log("WeatherService hit");
            $log.zipCode;
            return $http.get('http://localhost:8080/app/weatherData.json', {params: {zipCode: zipCode}});
        }
    };
}]);