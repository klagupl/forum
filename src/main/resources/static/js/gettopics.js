angular.module('topic', [])
    .controller('topics', function($scope, $http, $window) {
       var path=$window.location.pathname;
        $scope.pathscope = $window.location.pathname;
        $http.get("/api"+path).
        then(function(response) {
            $scope.topicss = response.data;

            });
        });
