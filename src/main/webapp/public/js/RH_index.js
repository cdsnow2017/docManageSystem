! function(angular, window, b) {
    var app = angular.module('myApp', ['ngRoute']);

    app.directive("navbar", function() {
        return {
            restrict: "E",
            templateUrl: './public/template/nav.html',
            replace: true
        }
    });
    app.directive("foot", function() {
        return {
            restrict: "E",
            templateUrl: './public/template/footerTpl.html',
            replace: true
        }
    });


    app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.when("/index", {
                templateUrl: "./public/template/indexTpl.html",
                controller: "indexController"
            })
            .when("/SimpleUserIndex", {
                templateUrl: "./public/template/SimpleUserIndex.html",
                controller: "sectionDocListController"
            })
            .when("/companyDocList", {
                templateUrl: "./public/template/companyDocList.html",
                controller: "companyDocListController"
            })
            .when("/panel", {
                templateUrl: "./public/template/docContain.html",
                controller: "CheckMessageController"
            })
            .when("/personalCenter", {
                templateUrl: "./public/template/personalCenter.html",
                controller: "UpLoadController"
            })
            .when("/leaderIndex", {
                templateUrl: "./public/template/leaderIndex.html",
                // controller: "CheckMessageController"
            })
            .when("/resIndex", {
                templateUrl: "./public/template/resIndex.html",
                // controller: "CheckMessageController"
            })
            .when("/sysIndex", {
                templateUrl: "./public/template/sysIndex.html",
                // controller: "CheckMessageController"
            })
            .otherwise({ redirectTo: "/index" });

    }]);

    app.controller("indexController", function($scope, $http) {
        location.href = "/login.html";
    })


    app.controller('CheckMessageController', function($scope) {
        $scope.data = "选课通知：选课将于16周开始，在16周选课之前，请大家先完成评教工作。评教系统将于12月10日（星期二）下午5：30关闭，请大家俺是完成，并确认已扣缴学费或已办理缓交学费，方可选课。";
        $scope.myboolean = true;
        $scope.docData = function() {
            $scope.myboolean = !$scope.myboolean;
        }
    });


    app.controller('UpLoadController', function($scope) {
        $scope.myboolean2 = true;
        $scope.docData2 = function() {
            $scope.myboolean2 = !$scope.myboolean2;
        }
    });


    app.controller('sectionDocListController', function($http,$scope) {
        // $scope.bold = "bold";
        $scope.key = '';
        $scope.data = [
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr"},
            { name: "css实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr"},
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr"},
            { name: "HTML实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr"},
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr"},
        ];
        $http({
                url: "./user/login.action",
                method: "GET",
                params:{

                }
            }).success(function(response) {
                $scope.data = response.data;
            }).error(function(response) {
                console.log("妈比");
            })
    });

    app.controller('companyDocListController', function($http,$scope) {
        // $scope.bold = "bold";
        $scope.key = '';
        $scope.data = [
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr",section:"人事部"},
            { name: "css实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr",section:"人事部"},
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr",section:"人事部"},
            { name: "HTML实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr",section:"人事部"},
            { name: "angular实战", type: "工作计划", uploadTime: "2016-01-17", updateTime: "2016-01-17", author: "sr",section:"人事部"},
        ];
        $http({
                url: "./user/login.action",
                method: "GET",
                params:{
                    
                }
            }).success(function(response) {
                $scope.data = response.data;
            }).error(function(response) {
                console.log("妈比");
            })
    });
}(angular, window);
