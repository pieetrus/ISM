var dashboard = angular.module("dashboard", []);

dashboard.controller("dashboardCtrl", function ($scope) {
  $scope.first = 1;
  $scope.second = 1;

  $scope.updateValue = function () {
    $scope.calculation =
      $scope.first +
      " + " +
      $scope.second +
      " = " +
      (+$scope.first + +$scope.second);
  };
});
