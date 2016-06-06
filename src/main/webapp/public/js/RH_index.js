!function(angular, window, b) {
	var app = angular.module('myApp', [ 'ngRoute' ]);

	app.directive("navbar", function() {
		return {
			restrict : "E",
			templateUrl : './public/template/nav.html',
			replace : true
		}
	});
	app.directive("foot", function() {
		return {
			restrict : "E",
			templateUrl : './public/template/footerTpl.html',
			replace : true
		}
	});
	app.service("setPage", function() {
		return {
			init : function(pages, callback) {

				var lastPage = document.getElementById("lastPage");
				var fNode = document.getElementById("ul");
				for (var i = 1; i <= pages; i++) {
					var newNode = document.createElement("li");
					var AElement = document.createElement("a");
					var textnode = document.createTextNode(i);
					AElement.appendChild(textnode);
					newNode.appendChild(AElement);
					newNode.addEventListener("click", function() {

						var index = i;
						return function() {
							callback(index);
						}
					}())
					fNode.insertBefore(newNode, lastPage);

				}

			}
		}
	})

	app.config([ '$routeProvider', function($routeProvider) {
		$routeProvider.when("/index", {
			templateUrl : "./public/template/indexTpl.html",
			controller : "indexController"
		}).when("/SimpleUserIndex", {
			templateUrl : "./public/template/SimpleUserIndex.html",
			controller : "sectionDocListController"
		}).when("/companyDocList", {
			templateUrl : "./public/template/companyDocList.html",
			controller : "companyDocListController"
		}).when("/panel", {
			templateUrl : "./public/template/docContain.html",
			controller : "CheckMessageController"
		}).when("/personalCenter", {
			templateUrl : "./public/template/personalCenter.html",
		// controller: "personalCenterController"
		}).when("/resManage", {
			templateUrl : "./public/template/resManage.html",
		// controller: "UpLoadController"
		}).when("/autManage", {
			templateUrl : "./public/template/autManage.html",
		// controller: "UpLoadController"
		}).when("/myDoc", {
			templateUrl : "./public/template/myDoc.html",
		// controller: "UpLoadController"
		}).when("/docList", {
			templateUrl : "./public/template/docList.html",
		// controller: "UpLoadController"
		}).when("/history", {
			templateUrl : "./public/template/history.html",
		// controller: "UpLoadController"
		}).when("/personalInfo", {
			templateUrl : "./public/template/personalInfo.html",
		// controller: "UpLoadController"
	}).when("/upload", {
			templateUrl : "./public/template/upload.html",
		// controller: "UpLoadController"
		}).otherwise({
			redirectTo : "/index"
		});

	} ]);

	app.controller("indexController", function($scope, $http) {
		location.href = "/login.html";
	})

	app
			.controller(
					'CheckMessageController',
					function($scope) {
						$scope.data = "选课通知：选课将于16周开始，在16周选课之前，请大家先完成评教工作。评教系统将于12月10日（星期二）下午5：30关闭，请大家俺是完成，并确认已扣缴学费或已办理缓交学费，方可选课。";
						$scope.myboolean = true;
						$scope.docData = function() {
							$scope.myboolean = !$scope.myboolean;
						}
					});

	app.controller('UpLoadController', function($scope, $http) {
		$scope.myboolean2 = true;
		$scope.data = {
			"resManage" : true,
			"autManage" : true,
			"graph" : true,
			"doc" : true
		};
		// $http({
		// 	url : "/user/menu",
		// 	method : "GET",
		// 	params : {

		// 	}
		// }).success(function(response) {
			
		// 	alert(response.data);
			
		// 	if (response.data.indexOf("资源管理") >= 0) {
		// 		$scope.data.resManage = false;
		// 	}
		// 	if (response.data.indexOf("权限管理") >= 0) {
		// 		$scope.data.autManage = false;
		// 	}
		// 	if (response.data.indexOf("统计报表") >= 0) {
		// 		$scope.data.graph = false;
		// 	}
		// 	if (response.data.indexOf("查看文档") >= 0) {
		// 		$scope.data.doc = false;
		// 	}
		// }).error(function(response) {
		// 	console.log("cuowu");
		// })
		$scope.docData2 = function() {
			$scope.myboolean2 = !$scope.myboolean2;
		}
	});

	app.controller('sectionDocListController', function($http, $scope) {
		$scope.key = '';
		$scope.data = [ {
			name : "angular实战",
			type : "工作计划",
			uploadTime : "2016-01-17",
			updateTime : "2016-01-17",
			author : "sr"
		}, {
			name : "css实战",
			type : "工作计划",
			uploadTime : "2016-01-17",
			updateTime : "2016-01-17",
			author : "sr"
		}, {
			name : "angular实战",
			type : "工作计划",
			uploadTime : "2016-01-17",
			updateTime : "2016-01-17",
			author : "sr"
		}, {
			name : "HTML实战",
			type : "工作计划",
			uploadTime : "2016-01-17",
			updateTime : "2016-01-17",
			author : "sr"
		}, {
			name : "angular实战",
			type : "工作计划",
			uploadTime : "2016-01-17",
			updateTime : "2016-01-17",
			author : "sr"
		}, ];
		$http({
			url : "./user/login.action",
			method : "GET",
			params : {

			}
		}).success(function(response) {
			$scope.data = response.data;
		}).error(function(response) {
			console.log("妈比");
		})
	});

	app.controller('companyDocListController',
			function($http, $scope, setPage) {
				// setPage.init(5,alert);
				// 每页显示的条数
				$scope.num = 5;
				// 分页数
				var currentPage = 1;
				$scope.totalNum = 0;

				// 显示内容
				$scope.data = [ {
					name : "angular实战",
					type : "工作计划",
					uploadTime : "2016-01-17",
					updateTime : "2016-01-17",
					author : "sr",
					section : "人事部"
				}, {
					name : "css实战",
					type : "工作计划",
					uploadTime : "2016-01-17",
					updateTime : "2016-01-17",
					author : "sr",
					section : "人事部"
				}, {
					name : "angular实战",
					type : "工作计划",
					uploadTime : "2016-01-17",
					updateTime : "2016-01-17",
					author : "sr",
					section : "人事部"
				}, {
					name : "HTML实战",
					type : "工作计划",
					uploadTime : "2016-01-17",
					updateTime : "2016-01-17",
					author : "sr",
					section : "人事部"
				}, {
					name : "angular实战",
					type : "工作计划",
					uploadTime : "2016-01-17",
					updateTime : "2016-01-17",
					author : "sr",
					section : "人事部"
				}, ];
				$http({
					url : "./user/login.action",
					method : "GET",
					params : {
						num : $scope.num
					}
				}).success(function(response) {
					$scope.totalNum = response.data;
					setPage($scope.totalNum, $scope.getData);

				}).error(function(response) {
					console.log("妈比");
				})

				$scope.getData = function(page) {
					currentPage = page;
					$http({
						url : "./user/login.action",
						method : "GET",
						params : {
							pageNum : page
						}
					}).success(function(response) {
						$scope.data = response.data;
					}).error(function(response) {
						console.log("妈比");
					})

				}
				$scope.prePage = function() {
					if (currentPage !== 1) {
						$scope.page($scope.getData(currentPage - 1));
					}
				}
				$scope.lastPage = function() {
					if (currentPage !== $scope.totalNum) {
						$scope.page($scope.getData(currentPage + 1));
					}
				}
				$scope.getData(1);
			});

	// app.controller('personalCenterController', function($http, $scope) {
	// $scope.data = [
	// { btn1: true, btn2: false, btn3: false,},
	// ];
	// $http({
	// url: "/personalCenter",
	// method: "GET",
	// params: {
	// check1:btn1
	// check2:btn2
	// check3:btn3
	// }
	// }).success(function(response) {
	// $scope.data = response.data;
	// }).error(function(response) {
	// console.log("妈比");
	// })
	// });
}(angular, window);
