
function sAlert(txt) {
  //
   // var eSrc=(document.all)?window.event.srcElement:arguments[1];
	var shield = document.createElement("DIV");
	shield.id = "shield";
	shield.style.position = "absolute";
	shield.style.left = "0px";
	shield.style.top = "0px";
	shield.style.width = "100%";
	shield.style.height = ((document.documentElement.clientHeight > document.documentElement.scrollHeight) ? document.documentElement.clientHeight : document.documentElement.scrollHeight) + "px";
	shield.style.background = "#333";
	shield.style.textAlign = "center";
	shield.style.zIndex = "10000";
	shield.style.filter = "alpha(opacity=0)";
	shield.style.opacity = 0;
	var alertFram = document.createElement("DIV");
	alertFram.id = "alertFram";
	alertFram.style.position = "absolute";
	alertFram.style.left = "50%";
	alertFram.style.top = "50%";
	alertFram.style.marginLeft = "-225px";
	alertFram.style.marginTop = -75 + document.documentElement.scrollTop + "px";
	alertFram.style.width = "450px";
	alertFram.style.height = "150px";
	alertFram.style.background = "#ccc";
	alertFram.style.textAlign = "center";
	alertFram.style.lineHeight = "150px";
	alertFram.style.zIndex = "10001";
	var rn = Math.random();
	strHtml = "<ul style=\"list-style:none;margin:0px;padding:0px;width:100%\">\n";
	strHtml += "    <li style=\"background:#e0f1bd;text-align:left;padding-left:20px;font-size:14px;font-weight:bold;height:25px;line-height:25px;border:1px solid #e0f1bd;\">[\u7cfb\u7edf\u63d0\u793a]</li>\n";
	strHtml += "    <li style=\"background:#fff;text-align:center;font-size:12px;height:120px;line-height:120px;border-left:1px solid #e0f1bd;border-right:1px solid #e0f1bd;\">\u9a8c\u8bc1\u7801\uff1a<input size=\"5\" type=\"text\"  onkeydown='key_13(event)' name=\"code\" id=\"code\" maxlength=\"4\"/><img onclick=\"ResetImage()\" id=\"imgValidCode\" src=\"${contextPath}/rechargeCardBank.do?method=getCode&id=" + rn + "\" style=\"vertical-align:middle\" /></li>\n";
	strHtml += "    <li style=\"background:#e0f1bd;text-align:center;font-weight:bold;height:25px;line-height:25px; border:1px solid #e0f1bd;\"><input type=\"button\" value=\"\u786e\u5b9a\" id=\"do_OK\" onclick=\"doOk()\" /><input type=\"button\" value=\"\u5173\u95ed\" id=\"do_Close\" onclick=\"do_Close()\" /></li>\n";
	strHtml += "</ul>\n";
	alertFram.innerHTML = strHtml;
	document.body.appendChild(alertFram);
	document.body.appendChild(shield);
	this.setOpacity = function (obj, opacity) {
		if (opacity >= 1) {
			opacity = opacity / 100;
		}
		try {
			obj.style.opacity = opacity;
		}
		catch (e) {
		}
		try {
			if (obj.filters.length > 0 && obj.filters("alpha")) {
				obj.filters("alpha").opacity = opacity * 100;
			} else {
				obj.style.filter = "alpha(opacity=\"" + (opacity * 100) + "\")";
			}
		}
		catch (e) {
		}
	};
	var c = 0;
	this.doAlpha = function () {
		if (++c > 20) {
			clearInterval(ad);
			return 0;
		}
		setOpacity(shield, c);
	};
	var ad = setInterval("doAlpha()", 1);
	this.doOk = function () {
    //DO SOMETHING
		do_Close();
	};
	this.key_13 = function (event) {
		if (event.keyCode == 13) {
			document.getElementById("do_OK").click();
		}
	};
	this.do_Close = function () {
		document.body.removeChild(alertFram);
		document.body.removeChild(shield);
		document.body.onselectstart = function () {
			return true;
		};
		document.body.oncontextmenu = function () {
			return true;
		};
	};
	document.body.onselectstart = function () {
		return false;
	};
	document.body.oncontextmenu = function () {
		return false;
	};
}

