function UtilService() {
    var util = new Object;

    /**
     * 设置cookie
     * @param name
     * @param value
     * @param time
     */
    util.setCookie = function (name, value, time) {
        var exp = new Date();
        exp.setTime(exp.getTime() + time);
        document.cookie = name + "=" + encodeURI(value) + ";expires=" + exp.toGMTString();
    };

    util.getcookie = function (name) {
        var arr, reg = new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if (arr = document.cookie.match(reg)) {
            return decodeURI(arr[2]);
        }
        else {
            return null;
        }
    }



    return util;
}