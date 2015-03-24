'use strict';

/* jasmine specs for controllers go here */
describe('Weather controllers', function () {

    describe('WeatherCtrl', function () {

        beforeEach(module('weatherApp'));

        it('should create "weather" model with data', inject(function ($controller) {
            var scope = {},
                ctrl = $controller('WeatherCtrl', {$scope: scope});
            expect(scope.weather.Success).toBe(true);
            expect(scope.weather.City).toBe("Worcester");
            expect(scope.weather.Description).toBe("Cloudy");
            expect(scope.weather.Pressure).toBe("30.03S");
            expect(scope.weather.RelativeHumidity).toBe("97");
            expect(scope.weather.Remarks).toBe("");
            expect(scope.weather.ResponseText).toBe("City Found");
            expect(scope.weather.State).toBe("MA");
            expect(scope.weather.Temperature).toBe("54");
            expect(scope.weather.Visibility).toBe("");
            expect(scope.weather.WeatherID).toBe(14);
            expect(scope.weather.WeatherStationCity).toBe("Worcester");
            expect(scope.weather.Wind).toBe("VRB5");
            expect(scope.weather.WindChill).toBe("");
        }));

    });
});
