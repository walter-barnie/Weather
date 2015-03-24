'use strict';

/* Controllers */
(function () {
    var weatherControllers = angular.module('weatherControllers', []);

    weatherControllers.controller('WeatherController', ['$scope', '$http', '$log', 'WeatherService', function ($scope, $http, $log, WeatherService) {
        this.zipCode = "";
        this.weatherData = {};
        this.loading = false;
        var thisWeather = this;
        this.getWeatherData = function (zipCode) {
            $scope.loading = true;
            WeatherService.getWeatherData(zipCode).success(function (data) {
                thisWeather.weatherData = data;
                thisWeather.zipCode = '';
                $scope.loading = false;
            }).error(function (data) {
                $scope.loading = false
                console.log('Error' + data);
            });
        }
    }]);
})();