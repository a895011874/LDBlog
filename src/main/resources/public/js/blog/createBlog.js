var data={};
var utilService = new UtilService();
var user = utilService.getcookie("username");
var app=angular.module("createBlogModule",[],function () {
    console.log("createBlogModule is init");
});
app.controller("createBlogCtrl",function ($scope) {
    $scope.types=["type1","type2","type3"];
    $scope.data={};

    //新建分类
    $scope.createType = function () {

    }
    $scope.confirm=function (data) {
        $scope.data=angular.copy(data);
        var content =  tinyMCE.activeEditor.getContent();


        data.content=content;
        data.type = $("#typeId").val();
        data.username = user;
        if(data.title == ""){
            return;
        }
        console.log(data);

        $.ajax({
            url:"/ldblog/blog",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(data),
            dataType:"json",
            type:"post",
            success:function(result){
                console.log(result);
                location.href = "./index.html";
            },
            error:function (errMsg) {
                console.log(errMsg);
            }
        });

    };
    $scope.cancle = function () {
        window.close();
    }                           
});
