'use strict';

/* jasmine specs for services go here */
describe('Weather controllers', function () {

describe('WeatherController', function() {
    // Arrange
    var mockScope, controller, backend;

    beforeEach(angular.mock.inject(function($httpBackend) {
            backend = $httpBackend;
            backend.expect("GET", "http://localhost:8080/app/weatherData.json").respond(
                {
                    "Success": true,
                    "ResponseText": "City Found",
                    "State": "MA",
                    "City": "Worcester",
                    "WeatherStationCity": "Worcester",
                    "WeatherID": 14,
                    "Description": "Cloudy",
                    "Temperature": "54",
                    "RelativeHumidity": "97",
                    "Wind": "VRB5",
                    "Pressure": "30.03S",
                    "Visibility": "",
                    "WindChill": "",
                    "Remarks": ""
                }
            )
        }
        ))

    beforeEach(angular.mock.inject(function($controller, $rootScope, $http) {
        mockScope = $rootScope.$new();
        $controller("weatherServices", {
            $scope: mockScope,
            $http: $http
        });
        backend.flush();
    }))
})});
