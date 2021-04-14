
angular.module('dashboard', []).controller(
		'dashboardCtrl',
		function($scope, $http) {
			$http.get('http://localhost:8080/v1/game/?area=court').then(
					function(response) {
						$scope.games = response.data;
					});
			$scope.id = '';
			$scope.courtId = '';
			$scope.sportHallId = '';
			$scope.price = '';
			$scope.date = '';
			$scope.gotBall = '';
			$scope.playersMaxAmount = '';
			$scope.edit = true;
			$scope.error = false;
			$scope.incomplete = false;
			$scope.hideform = true;
			$scope.editGameN = function() {
				$scope.hideform = !$scope.hideform;
					$scope.edit = true;
					$scope.incomplete = true;
					$scope.id = '';
					$scope.courtId = '';
					$scope.sportHallId = '';
					$scope.price = '';
					$scope.date = '';
					$scope.gotBall = '';
					$scope.playersMaxAmount = '';
			};
			$scope.editGame = function(id) {
				$scope.hideform = false;
					$scope.edit = true;
					$scope.id = $scope.games[id].id;
					$scope.courtId = $scope.games[id].courtId;
					$scope.sportHallId = $scope.games[id].sportHallId;
					$scope.price = $scope.games[id].price;
					$scope.date = $scope.games[id].date;
					$scope.gotBall = $scope.games[id].gotBall;
					$scope.playersMaxAmount = $scope.games[id].playersMaxAmount;
			};
			
			$scope.deleteGame = function(id) {				
				$http.delete('http://localhost:8080/v1/game/'+id).then(function onSuccess(data) {
					$http.get('http://localhost:8080/v1/game/?area=court').then(
							function(response) {
								$scope.games = response.data;
							});
				}, function onError(err) {
					// do something on error
				});
			};

			$scope.saveGame = function() {
				var obj = {
					id: $scope.id,
					surname : $scope.surname,
					courtId : $scope.courtId,
					sportHallId : $scope.sportHallId,
					price : $scope.price,
					date : $scope.date,
					gotBall: $scope.gotBall,
					playersMaxAmount : $scope.playersMaxAmount
				};
				$scope.hideform = true;
				
				window.alert('id:'+$scope.id);
				
				if($scope.id==='')
				$http.post('http://localhost:8080/v1/game', obj, {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:8080/v1/game/?area=court').then(
							function(response) {
								$scope.games = response.data;
							});
				}, function onError(err) {
					// do something on error
				});
				else
				$http.put('http://localhost:8080/v1/game', obj, {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:8080/v1/game/?area=court').then(
							function(response) {
								$scope.games = response.data;
							});
				}, function onError(err) {
					// do something on error
				});
				$scope.id=''
			};
			
			
			$scope.$watch('courtId', function() {
				$scope.test();
			});
			$scope.$watch('sportHallId', function() {
				$scope.test();
			});
			$scope.$watch('price', function() {
				$scope.test();
			});
			$scope.$watch('date', function() {
				$scope.test();
			});
			$scope.$watch('gotBall', function() {
				$scope.test();
			});
			$scope.$watch('playersMaxAmount', function() {
				$scope.test();
			});

			$scope.test = function() {
				$scope.incomplete = false;
				if ($scope.edit
						&& (!$scope.playersMaxAmount.length || !$scope.gotBall.length)) {
					$scope.incomplete = true;
				}
			};
		});
