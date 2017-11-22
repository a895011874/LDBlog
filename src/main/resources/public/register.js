var app = angular.module("app",[]);
app.controller("registerController",function ($scope) {
    $scope.register = function ($scope) {

        var username = $("#inputUsername").val();
        var password = $("#inputPassword").val();
        var repassword = $("#inputPasswordRe").val();
        var phoneNumber = $("#inputPhoneNumber").val();
        var email = $("#inputEmail").val();

        userData = {
            username:username,
            password:password,
            phone:phoneNumber,
            email:email
        };

        $.ajax({
            url: "/ldblog/user",
            data:userData,
            dataType: "json",
            type: "post",
            async: false,
            success: function (data) {
                resData = data;
                if(data.state === "success") {
                    window.location.href = "login.html";
                }
                console.log(data);
            },
            error: function (result) {
                console.log(result);
            }
        });
    }
});