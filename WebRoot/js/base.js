 String.prototype.trim = function() {     
        //return this.replace(/[(^\s+)(\s+$)]/g,"");//會把字符串中間的空白符也去掉     
        //return this.replace(/^\s+|\s+$/g,""); //     
        return this.replace(/^\s+/g,"").replace(/\s+$/g,"");     
}
/**
隐藏或显示DIV
*/
function showOrHidden(div){
	var divTab=document.getElementById(div);
	if(divTab.style.display=='none'){
		divTab.style.display="";
	}else{
	divTab.style.display="none";
	}
}    