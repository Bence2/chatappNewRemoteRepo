var getContactsService = function($http) {

	var getContacts = function() {
		return $http.get("/chatappnew/getcontacts.json").then(function(response) {
			return response.data;
		});
	};

	return {
		getContacts : getContacts
	};

};

var mainmodule = angular.module("mainmodule");
mainmodule.factory("getContactsService", getContactsService);
