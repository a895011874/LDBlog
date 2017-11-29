var app=angular.module("blogDetailModule",[],function () {
    console.log("blogDetailModule is init");
});
app.controller("blogDetailController",function ($scope) {
    $.ajax({
        url:"../queryBlogById.do/1122",
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
});