var app = angular.module('app', ['ngMaterial']);
app.controller('squareRootCtrl', function ($scope, $http) {


    $scope.doCalc = function () {
        $scope.wrongInput = false;
        var inputValue = $scope.inputValue;
        $http.get("calc?inputValue=" + inputValue)
            .then(function (response) {
                $scope.outputValue = response.data.outputValue;
            })
            .catch(function (error) {
                $scope.wrongInput = true;
            });
    };

    $scope.onKeyPress = function ($event) {
        if ($event.keyCode != 13) {
            $scope.outputValue = null;
            $scope.wrongInput = false;
        }
    };

});

app.config(function ($mdThemingProvider) {
    $mdThemingProvider.theme('squareRoots').primaryPalette('deep-orange');
});