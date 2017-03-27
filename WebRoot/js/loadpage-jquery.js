function loadPages(fileName,divId,params,notLoad,rooturl) {
	var url = fileName;
	if(url.indexOf('?') > 0){
		url = url+'&systemType=1';
	} else{
		url = url+'?systemType=1';
	}
	//url=url+'&timesnap='  + Date.parse(new Date());
	if(notLoad==undefined){
		if(rooturl==undefined)
		{
			document.getElementById(divId).innerHTML='<br/><img src="../../images/common/load.gif"><br/><br/>';
		}
		else{
			document.getElementById(divId).innerHTML='<br/><img src="'+rooturl+'/images/common/load.gif"><br/><br/>';
		}
		
	}
	
	try{
		$('#'+divId).load(url+"&t="+new Date().getTime(),params); 	
	}catch (e) {
		alert(e.name + ": " + e.message);
	}
}