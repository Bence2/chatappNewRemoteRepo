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

var mainmodule = angular.module("mainmodule");
mainmodule.factory("getmessagesservice", getmessagesservice);
