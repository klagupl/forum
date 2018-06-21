angular.module('demo', [])
    .controller('Sections', function($scope, $http) {
        $http.get('http://localhost:8080/sections').
        then(function(response) {
            $scope.section = response.data;
        });

    })
.controller('SubSections', function($scope, $http) {
    $http.get('http://localhost:8080/subsections').
    then(function(response) {
        $scope.subsections = response.data;
    });

});