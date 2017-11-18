var data={};
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
        var content =  CKEDITOR.instances.textarea_1.getData();
        data.content=content;
        console.log(data);

        $.ajax({
            url:"../createBlog.do",
            data:{blogData:JSON.stringify(data)},
            dataType:"json",
            type:"post",
            success:function(result){
                console.log(result);
            },
            error:function (errMsg) {
                console.log(errMsg);
            }
        });
        location.href = "../index.html";
    };
    $scope.cancle = function () {
        window.close();
    }                           
});
