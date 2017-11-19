
var resData = {};
var app = angular.module("app", []);
app.controller('blogInfosController', function ($scope) {
    console.log("blogInfosController is run");
    $.ajax({
        url:"/blogs",
        dataType:"json",
        type:"get",
        async:false,
        success:function(data){
            resData = data;

            console.log(data);
        },
        error:function (result) {
            console.log(result);
        }
    });

    $scope.datas = resData.data;
    //$scope.articles=resData;
    $scope.queryDetailBlog = function (event) {
        var something = event.target;
        window.open('./blog/blogDetail.html');
    }
});


