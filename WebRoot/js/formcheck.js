
//注意顺序 
var tipMsg="";
var objList=new Array();
//最小值为O是可以为NULL ,最大长度,是否为数字,属性名,提示信息
function initFiledRules(minLength,maxLength,isNumber,filedName,label){
	var obj=new Object();
	obj.name=filedName;
	obj.min=minLength;
	obj.max=maxLength;
	obj.label=label;
	//是否为数字
	obj.isNumber=isNumber;
	objList.push(obj);
}
/*--------检查---------*/
function check(){
	tipMsg="";
	var isSubmit=true;
	for(i=0;i<objList.length;i++){
		var flag=checkFiled(objList[i]);
		if(!flag){
			isSubmit=false;
		}
	}
	return isSubmit;
}


/***/
function checkFiled(obj){
	
	var filedObj=document.getElementsByName(obj.name);
	var flag=true;

	for(j=0;j<filedObj.length;j++){
		
		if(typeof(filedObj[j])=="undefined"){
			contine;
		}
		//提示信息
		var tipName=obj.name+"Tip";
		var tipTab=document.getElementById(tipName);
		tipTab.style.color='red';
		filedObj[j].value=filedObj[j].value.trim();
		filed=filedObj[j].value.trim();
		//判断是否为空
		if(filed.length>0){
			//others 检查
			if(obj.label=='电子邮箱'){
				var regemail= /^\w+\@\w+\.\w+$/;
				var regemail= /(\S)+[@]{1}(\S)+[.]{1}(\w)+/;
				//alert(regemail.test(filed)+"  =="+filed);
				if(!regemail.test(filed)){
					if(tipTab!=null){
						tipTab.innerHTML='电子邮箱格式错误.';
					}else{
						tipMsg+=" 电子邮箱格式错误!<br/>";
					}
					return false;
				}
			}else if(obj.label=='邮政编码'){
				if(filed.length!=obj.max){
					tipTab.innerHTML=obj.label+" 长度必须为"+obj.max+" 位";
					//tipMsg+=obj.label+" 长度必须为"+obj.max+" 位";
					return false;
				}else{
					tipMsg="";
				}
			}else if(obj.label=='固定电话'){
			var pattern = /^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/;   
				if(pattern.test(filed)){ 
					//return true; 
				}else { 
						if(tipTab!=null){
						tipTab.innerHTML='固定电话格式错误.';
					}else{
						tipMsg+=" 固定电话格式错误!<br/>";
					}
						return false; 
				} 
			}
			
			
		
			//检查字符长度
			if(obj.max==0||obj.max<0){
				if(obj.min>filed.length){
					//tipMsg+=" "+obj.label+" 不合法");
					if(tipTab!=null){
						tipTab.innerHTML=obj.label+" 输入长度不能少于"+obj.min+"位";
					}else{
						tipMsg+=obj.label+" 输入长度不能少于"+obj.min+"位";
					}
					//flag= false;
					return false;
				}
			}else{
				if(obj.min>filed.length||filed.length>obj.max){
					//tipMsg+=" "+obj.label+" 不合法");
					
					if(tipTab!=null){
						if(obj.min==obj.max){
							tipTab.innerHTML=obj.label+" 长度必须为"+obj.min+" 位";
						}else{
							tipTab.innerHTML=obj.label+" 请输入长度在"+" "+obj.min+" - "+obj.max+" 位"+"之间";
						}
					}else{
						tipMsg+=obj.label+" 请输入长度在"+" "+obj.min+" - "+obj.max+"位 "+"之间<br/>";
						//tipTab.innerHTML=obj.label+" 请输入长度在"+" "+obj.min+" - "+obj.max+"位 "+"之间<br/>";
					}
					//flag= false;
					return false;
				}
			}
			if(obj.isNumber){
				//检查是否为数字 
				if(isNaN(filed)){
					if(tipTab!=null){
						tipTab.innerHTML=obj.label+':请输入正确的数字';
					}else{
						tipMsg+=" "+obj.label+":请输入正确的数字!<br/>";
					}
					return false;
					//flag= false;
				}else if(filed<0){
						tipMsg+=" "+obj.label+":不能小于0!<br/>";
						return false;
					}
			}
			
			
			//清空提示信息
			if(tipTab!=null){
					tipTab.innerHTML=tipMsg;
			}
			
		}else if(obj.min>0){
			//判断是否允许为空  大于O不为空
			if(tipTab!=null){
				tipTab.innerHTML=obj.label+":不能为空!";
			}else{
				tipMsg+=" "+obj.label+"不能为空!<br/>";
			}
			return false;
			//flag= false;
		}
		
		
		
	}
	return flag;
}
/**
checkbox 得到选中BOX的值
*/
function checkInvoiceContents(boxGroup){
	var boxs=document.getElementsByName(boxGroup);
	document.getElementById('invice.invoiceAddressTip').innerHTML="";
	for (var i=0;i<boxs.length;i++){
		if(boxs[i].checked){
			//return boxs[i];
			if(boxs[i].value=="企业"){
			initFiledRules(4,30,false,'invice.invoiceAddress','企业发票抬头');
			}
		}
	}
	//return false;
}

//检查是否为正整数
function checkIsInt(materialAmount,isOverZore,tipMessage){

	var actStandardWorkDays=document.getElementsByName(materialAmount);
		
	for(i=0;i<actStandardWorkDays.length;i++){
		
		var actStandardWorkDay=actStandardWorkDays[i].value;
		if(parseInt(actStandardWorkDay)==actStandardWorkDay){
			if(isOverZore){
				if(actStandardWorkDay<0){
					alert('错误!'+tipMessage+'必须为正整数:'+actStandardWorkDay);
					actStandardWorkDays[i].focus();
					return false;
				}
			}
		}else{
			alert('错误!'+tipMessage+'必须为整数:'+actStandardWorkDay);
			actStandardWorkDays[i].select();
			return false;
		}
	}
	return true;
}