function login(){
	var name=loginFrm.username.value;
	var pass=loginFrm.password.value;

	if(name!=""&&pass!=""){
		//document.loginFrm.submit();
	}else if (name==""){
		alert("用户名不能为空！");
		return false;
	}else if (pass==""){
		alert("密码不能为空！")
		return false;
	}

}
var errMsg = document.getElementById("errorfield");
var errBox = document.getElementById("errorBox");

if(errorMsg != null){
	$(errBox).text($(errMsg).text());
	errBox.style.display = "block";
	setTimeout(function () {
		errBox.style.display = "none";
	},10000);
}

