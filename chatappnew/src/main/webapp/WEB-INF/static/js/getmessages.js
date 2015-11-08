var getmessagesservice = function($http) {

	var getMessages = function() {
		return $http.get("/chatappnew/getmessages.json").then(function(response) {
			return response.data;
		});
	};

	return {
		getMessages : getMessages
	};

};

var mainModule = angular.module("mainModule");
mainModule.factory("getmessagesservice", getmessagesservice);
