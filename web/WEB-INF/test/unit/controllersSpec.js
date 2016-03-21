'use strict';

/* jasmine specs for controllers go here */
describe('Weather controllers', function () {


        beforeEach(module('weatherApp'));
        beforeEach(module('weatherServices'));


    describe('WeatherController', function(){
        var mockScope, controller, backend;

        beforeEach(angular.mock.inject(function($httpBackend) {
          backend = $httpBackend;
            backend.expect("GET", "???").respond(
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
          $httpBackend = _$httpBackend_;
          $httpBackend.expectGET('Weather_data/01603.json').
              respond([{Success: 'true'}, {ResponseText: 'City Found'}]);

          scope = $rootScope.$new();
          ctrl = $controller('WeatherController', {
              $scope: scope
          });
        }));
        it('should create "phones" model with 2 phones fetched from xhr', function() {
            expect(scope.phones).toEqualData([]);
            $httpBackend.flush();

            expect(scope.phones).toEqualData(
                [{name: 'Nexus S'}, {name: 'Motorola DROID'}]);
          });


          it('should set the default value of orderProp model', function() {
            expect(scope.orderProp).toBe('age');
          });
        });

        /*it("Should Work", function() {
                expect(this.zipCode).toBe(undefined);
            })*/
});
