/**
给String 类型添加一个trim方法
删除空白符也去掉  
*/
String.prototype.trim = function() {     
        //return this.replace(/[(^\s+)(\s+$)]/g,"");//會把字符串中間的空白符也去掉      
        return this.replace(/^\s+/g,"").replace(/\s+$/g,"");     
}
String.prototype.trimStr = function(mark) {     
        //return this.replace(/[(^\s+)(\s+$)]/g,"");//會把字符串中間的空白符也去掉      
        return this.replace(mark,"");     
}
/**
给Array 类型添加一个indexOf方法
获取Array第一个索引
*/
 Array.protoType.indexOf = function(Object){  
          for(var i = 0;i<this.length;i++){  
             if(this[i] == Object){  
                return i;  
         }  
	}
}
/**
回车事件:动态调用函数
eg:enterkey('check()')
*/
 function enterkey(funName){ 
 	  //消除浏览器差异  
      var event=arguments.callee.caller.arguments[0]||window.event;
     if (event.keyCode == 13){  
       eval(funName);
     }  
 }
/**
隐藏或显示DIV
*/
function showOrHidden(divId){
	var divTab=document.getElementById(div);
	if(divTab.style.display=='none'){
		divTab.style.display="";
	}else{
		divTab.style.display="none";
	}
}
/**
遮照层
*/
  function sAlert(orderId){
   // var eSrc=(document.all)?window.event.srcElement:arguments[1];
    var shield = document.createElement("DIV");
    shield.id = "shield";
    shield.style.position = "absolute";
    shield.style.left = "0px";
    shield.style.top = "0px";
    shield.style.width = "100%";
    shield.style.height = ((document.documentElement.clientHeight>document.documentElement.scrollHeight)?document.documentElement.clientHeight:document.documentElement.scrollHeight)+"px";
    shield.style.background = "#333";
    shield.style.textAlign = "center";
    shield.style.zIndex = "10000";
    shield.style.filter = "alpha(opacity=0)";
    shield.style.opacity = 0;
    var alertFram = document.createElement("DIV");
    alertFram.id="alertFram";
    alertFram.style.position = "absolute";
    alertFram.style.left = "50%";
    alertFram.style.top = "50%";
    alertFram.style.marginLeft = "-225px" ;
    alertFram.style.marginTop = -75+document.documentElement.scrollTop+"px";
    alertFram.style.width = "450px";
    alertFram.style.height = "150px";
    alertFram.style.background = "#ccc";
    alertFram.style.textAlign = "center";
    alertFram.style.lineHeight = "150px";
    alertFram.style.zIndex = "10001";
	var rn=Math.random();
     strHtml  = "<ul style=\"list-style:none;margin:0px;padding:0px;width:100%\">\n";
   strHtml += "    <li style=\"background:#e0f1bd;text-align:left;padding-left:20px;font-size:14px;font-weight:bold;height:25px;line-height:25px;border:1px solid #e0f1bd;\">[系统提示]</li>\n";
   strHtml += "    <li style=\"background:#fff;text-align:center;font-size:12px;height:120px;line-height:120px;border-left:1px solid #e0f1bd;border-right:1px solid #e0f1bd;\">处理方式:<select id='process_method' type=\"text\"   name=\"code\" id=\"code\" maxlength=\"4\"><option value=\"0\">正常处理</option><option value=\"1\"> 退 款</option><option value=\"2\">暂不处理</option></select></li>\n";
     strHtml += "    <li style=\"background:#e0f1bd;text-align:center;font-weight:bold;height:25px;line-height:25px; border:1px solid #e0f1bd;\"><input type=\"button\" value=\"确定\" id=\"do_OK\" onclick=\"doOk($('#process_method').val())\" /><input type=\"button\" value=\"关闭\" id=\"do_Close\" onclick=\"do_Close()\" /></li>\n";
   strHtml += "</ul>\n";

    alertFram.innerHTML = strHtml;
    document.body.appendChild(alertFram);
    document.body.appendChild(shield);
    this.setOpacity = function(obj,opacity){
        if(opacity>=1)opacity=opacity/100;
        try{ obj.style.opacity=opacity; }catch(e){}
        try{ 
            if(obj.filters.length>0&&obj.filters("alpha")){
                obj.filters("alpha").opacity=opacity*100;
            }else{
                obj.style.filter="alpha(opacity=\""+(opacity*100)+"\")";
            }
        }catch(e){}
    }
    var c = 0;
    this.doAlpha = function(){
        if (++c > 20){clearInterval(ad);return 0;}
        setOpacity(shield,c);
    }
    var ad = setInterval("doAlpha()",1);
    this.doOk = function(processstatus){
    	processAcc(orderId,processstatus);
    	//DODOME THIGE
    	if(true){
 				do_Close();
    	}
    }
    this.key_13=function(event){
    	if(event.keyCode==13){
    		//document.getElementById("do_OK").focus();
    		document.getElementById('do_OK').click();
    	}
    }
      this.do_Close=function(){
    	document.body.removeChild(alertFram);
        document.body.removeChild(shield);
        //eSrc.focus();
        document.body.onselectstart = function(){return true;}
        document.body.oncontextmenu = function(){return true;}
    }
   // document.getElementById("code").focus();
    //eSrc.blur();
    document.body.onselectstart = function(){return false;}
    document.body.oncontextmenu = function(){return false;}
  
}