'use strict';

// Declare app level module which depends on views, and components
var weatherApp = angular.module('weatherApp', [
    'ngRoute',
    'weatherControllers',
    'weatherServices',
    'weatherDirectives'
]);


weatherApp.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.otherwise({redirectTo: '/'});
    }]);