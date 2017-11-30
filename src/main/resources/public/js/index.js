var utilService = new UtilService();
var resData = {};
var app = angular.module("app", []);
app.controller('blogInfosController', function ($scope) {

    var username = utilService.getcookie("username");


    console.log(username);

    console.log("blogInfosController is run");
    $.ajax({
        url: "/ldblog/blogs/"+username,
        dataType: "json",
        type: "get",
        async: false,
        success: function (data) {
            resData = data;

            console.log(data);
        },
        error: function (result) {
            console.log(result);
        }
    });

    $scope.datas = resData.data;

    setTimeout(function () {
        var blogData = resData.data;
        var num = blogData.length;
        for (var i = 0; i < num; i++) {
            $("#blogAreaDiv").append('<div class="col-lg-4"> <h2><span>' + blogData[i].title + '</span></h2>' +
                '<span class="label label-default" style="margin-bottom: 5px">' + blogData[i].type + '</span> <p><span id="content_"' + blogData[i].id + '>' + blogData[i].content + '</span></p>' +
                '<p><a href="./blogDetail.html?blogId=' + blogData[i].id + '" class="btn btn-primary">View details &raquo;</a></p></div>');
        }
    }, 10)

    //$scope.articles=resData;
    $scope.queryDetailBlog = function (event) {
        var something = event.target;
        window.open('./blog/blogDetail.html');
    }
});





