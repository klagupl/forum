angular.module('demo', [])
    .controller('Sections', function($scope, $http) {
        $http.get('http://localhost:8080/api/sections').
        then(function(response) {
            $scope.section = response.data;
            $scope.subsections=response.data.data;
        });

    });
