var utilService = new UtilService();
var app = angular.module("app",[]);
app.controller("loginController",function ($scope) {
	console.log("login run");

	$scope.login = function(){
		var name=loginFrm.username.value;
		var pass=loginFrm.password.value;
		var userData = {
			username:name,
			password:pass
		};
		if(verifyParam(name,pass) === true){
			$.ajax({
				url: "/ldblog/loginAction",
				contentType:"application/json;charset=utf-8",
				data:JSON.stringify(userData),
				dataType: "json",
				type: "post",
				async: false,
				success: function (data) {
					resData = data;
					if(data.state === "success") {
						//设置cookie
						utilService.setCookie("username",data.data[0].username,1000*60*30);
						window.location.href = "./index.html";
					}
					console.log(data);
				},
				error: function (result) {
					console.log(result);
				}
			});

		}


	}
	$scope.register = function () {
        window.location.href = "./register.html"
    }

	function verifyParam(name,pass) {

		if (name != "" && pass != "") {
			return true;
		} else if (name == "") {
			alert("用户名不能为空！");
			return false;
		} else if (pass == "") {
			alert("密码不能为空！")
			return false;
		}
	}

});





