'use strict';

describe('service', function() {

  // load modules
  beforeEach(module('weatherApp'));

  // Test service availability
  it('check the existence of Weather factory', inject(function(WeatherService) {
      expect(WeatherService).toBeDefined();
    }));
});