var dataModel = [
    {
        title: "t1", content: "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui."
    }, {title: "t2", content: "As of v9.1.2, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui."}, {title: "t3", content: "11111"}, {title: "t4", content: "11111"}, {
        title: "t5",
        content: "ndimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui"
    }];


var app = angular.module("app", []);
app.controller('blogInfosController', function ($scope) {
    console.log("blogInfosController is run");
    // $.ajax({
    //     url:"./queryAllBlog.do",
    //     dataType:"json",
    //     type:"get",
    //     async:false,
    //     success:function(data){
    //         resData = data;
    //
    //         console.log(data);
    //     },
    //     error:function (result) {
    //         console.log(result);
    //     }
    // });

    $scope.datas = dataModel;
    //$scope.articles=resData;
    $scope.queryDetailBlog = function (event) {
        var something = event.target;
        window.open('./blog/blogDetail.html');
    }
});


