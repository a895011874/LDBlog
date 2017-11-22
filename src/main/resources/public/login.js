var app = angular.module("app",[]);
app.controller("loginController",function ($scope) {
	console.log("login run");

	$scope.login = function(){
		var name=loginFrm.username.value;
		var pass=loginFrm.password.value;
		var userData = {
			name:name,
			pass:pass
		};
		if(verifyParam(name,pass) === true){
			$.ajax({
				url: "/ldblog/loginAction",
				data:userData,
				dataType: "json",
				type: "post",
				async: false,
				success: function (data) {
					resData = data;
					if(data.state === "success") {
						window.location.href = "index.html";
					}
					console.log(data);
				},
				error: function (result) {
					console.log(result);
				}
			});

		}
		

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




