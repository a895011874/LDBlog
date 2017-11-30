var app=angular.module("blogDetailModule",[],function () {
    console.log("blogDetailModule is init");
});
app.controller("blogDetailController",function ($scope) {

    var id = getQueryString("blogId");


    $.ajax({
        url:"/ldblog/blog/"+id,
        dataType:"json",
        type:"get",
        async:false,
        success:function(data){
            resData = data;
            init(resData.data[0]);
        },
        error:function (result) {
            console.log(result);
        }
    });
});

function init(data) {
    $("#blogTitleDiv").html("<h2>"+data.title+"</h2>")
    $("#blogContentDiv").html(data.content);
}

function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}