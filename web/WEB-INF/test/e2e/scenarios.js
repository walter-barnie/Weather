'use strict';

/* http://docs.angularjs.org/guide/dev_guide.e2e-testing */

describe('weatherApp App', function () {

    it('should redirect index.html to index.html', function () {
        browser.get('app/index.html');
        browser.getLocationAbsUrl().then(function (url) {
            expect(url).toEqual('/');
        });
    });


    /*describe('Weather info page', function () {

        beforeEach(function () {
            browser.get('app/weatherData.json?zipCode=01603');
        });


        it('should filter the players list as a user types into the search box', function () {

            //var playerList = element.all(by.repeater('player in players'));
            var query = element(by.model('zipCode'));
            var submitButton = element(by.model('submit'));

            //expect(playerList.count()).toBe(9);

            query.sendKeys('01603');
            submitButton.sendKeys.
            expect(playerList.count()).toBe(2);

            query.clear();
            //query.sendKeys('Flute');
            //expect(playerList.count()).toBe(3);
        });


        it('should be possible to control phone order via the drop down select box', function() {

         var phoneNameColumn = element.all(by.repeater('phone in phones').column('phone.name'));
         var query = element(by.model('query'));

         function getNames() {
         return phoneNameColumn.map(function(elm) {
         return elm.getText();
         });
         }

         query.sendKeys('tablet'); //let's narrow the dataset to make the test assertions shorter

         expect(getNames()).toEqual([
         "Motorola XOOM\u2122 with Wi-Fi",
         "MOTOROLA XOOM\u2122"
         ]);

         element(by.model('orderProp')).element(by.css('option[value="name"]')).click();

         expect(getNames()).toEqual([
         "MOTOROLA XOOM\u2122",
         "Motorola XOOM\u2122 with Wi-Fi"
         ]);
         });


        it('should render phone specific links', function () {
            var query = element(by.model('zipCode'));
            query.sendKeys('01603');
            element.all(by.css('.players li a')).first().click();
            browser.getLocationAbsUrl().then(function (url) {
                expect(url).toEqual('/player/1');
            });
        });
    });*/


    /*describe('Player detail view', function () {

        beforeEach(function () {
            browser.get('app/index.html#/player/1');
        });


        it('should display 1 page', function () {
            expect(element(by.binding('player.firstName')).getText()).toBe('Walter Barnie');
        });
    });*/

});