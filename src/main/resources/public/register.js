var app = angular.module("app", []);
app.controller("registerController", function ($scope) {
    function register($scope) {
        console.log(1212)
        var username = $("#username").val();
        var password = $("#password").val();
        var repassword = $("#passwordre").val();
        var phoneNumber = $("#phoneNumber").val();
        var email = $("#email").val();

        userData = {
            username: username,
            password: password,
            phone: phoneNumber,
            email: email
        };
        $.ajax({
            url: "/ldblog/user",
            contentType:"application/json;charset=utf-8",
            data: JSON.stringify(userData),
            dataType: "json",
            type: "post",
            async: false,
            success: function (data) {
                resData = data;
                if (data.state === "success") {
                    window.location.href = "login.html";
                }
                console.log(data);
            },
            error: function (result) {
                console.log(result);
            }
        });
    };

    /**
     * 表单校验
     */
    setTimeout(function () {
        $('form').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            submitHandler: function () {
                console.log("submit")
            },
            fields: {
                username: {
                    message: '用户名验证失败',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            max: 20,
                            message: '用户名不能长于20个字符'
                        }
                    }
                },
                email: {
                    validators: {
                        notEmpty: {
                            message: '邮箱地址不能为空'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        identical: {
                            field: 'passwordre',
                            message: '两次输入的密码不相符'
                        }
                    }
                },
                passwordre: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        identical: {
                            field: 'password',
                            message: '两次输入的密码不相符'
                        }
                    }
                }
            }
        }).on('success.form.bv', function () {
            register();
        });
    });
    20
})

