'use strict';

/* jasmine specs for controllers go here */
describe('PhoneCat controllers', function() {

 /* beforeEach(function(){
    this.addMatchers({
      toEqualData: function(expected) {
        return angular.equals(this.actual, expected);
      }
    });
  });*/

  beforeEach(module('weatherApp'));
  beforeEach(module('weatherServices'));

  describe('WeatherController', function(){
    var scope, ctrl, $httpBackend;

    beforeEach(inject(function(_$httpBackend_, $rootScope, $controller) {
      $httpBackend = _$httpBackend_;
        $httpBackend.expectGET('Weather_data/01603.json').respond(
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


        scope = $rootScope.$new();
        ctrl = $controller('WeatherController', {$scope: scope});
    }));


    it('should create "weather" model with the weather for zip code 01603 fetched from xhr', function() {
      expect(scope.weather).toEqualData([]);
      $httpBackend.flush();

      expect(scope.waether).toEqualData(
          [{
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
          }]);
    });


   /* it('should set the default value of orderProp model', function() {
      expect(scope.orderProp).toBe('age');
    });*/
  });


  /*describe('PhoneDetailCtrl', function(){
    var scope, $httpBackend, ctrl,
        xyzPhoneData = function() {
          return {
            name: 'phone xyz',
                images: ['image/url1.png', 'image/url2.png']
          }
        };


    beforeEach(inject(function(_$httpBackend_, $rootScope, $routeParams, $controller) {
      $httpBackend = _$httpBackend_;
      $httpBackend.expectGET('phones/xyz.json').respond(xyzPhoneData());

      $routeParams.phoneId = 'xyz';
      scope = $rootScope.$new();
      ctrl = $controller('PhoneDetailCtrl', {$scope: scope});
    }));


    it('should fetch phone detail', function() {
      expect(scope.phone).toEqualData({});
      $httpBackend.flush();

      expect(scope.phone).toEqualData(xyzPhoneData());
    });
  });*/
});
