'use strict';

/* Directives */

var app = angular.module('weatherDirectives', []);

app.directive('autoFocus', function() {
    return {
        link: {
            pre: function preLink(scope, element, attr) {
                console.debug('prelink called');
                // this fails since the element hasn't rendered
                //element[0].focus();
            },
            post: function postLink(scope, element, attr) {
                console.debug('postlink called');
                // this succeeds since the element has been rendered
                element[0].focus();
            }
        }
    }
});

app.directive('focusInput', function($timeout) {
  return {
    link: function(scope, element, attrs) {
      element.bind('click', function() {
        $timeout(function() {
          element.parent().parent().find('input')[0].focus();
            console.debug('link called in focusInput');
        });
      });
    }
  };
});
