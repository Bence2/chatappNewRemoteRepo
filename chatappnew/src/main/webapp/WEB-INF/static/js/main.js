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

var app = angular.module("mainModule", ['ngRoute']);
angular.module("mainModule").config(function($routeProvider){
	console.log("route resz");
	$routeProvider.

				when(
				"/route", 
					{ templateUrl: ""} ).
				when(
				"/messages", 
					{templateUrl: "static/html/messaging.html",
					controller: 'MessagingController'})
		});

app.controller("MainController", MainController);
