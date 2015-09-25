var MainController = function($scope, $http,$location,  getmessagesservice) {
	var getMessagesSucceeds = function(data) {
		$scope.messages = data;
	}
	
	var getMessagesFails = function(reason) {
		console.log(reason); //erre (is) mondja, h hibat dob a json parseolasnal 
		console.log("erroooorr");
	};
	
	$scope.getMessages = function() {
		getmessagesservice.getMessages().then(getMessagesSucceeds, getMessagesFails);
	}
};

var app = angular.module("mainmodule", ['ngRoute']);
angular.module("mainmodule").config(function($routeProvider){
	console.log("route resz");
	$routeProvider.

				when(
				"/route", 
					{
		        templateUrl: ""
					}
				)
		});

app.controller("MainController", MainController);
