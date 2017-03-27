<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/jsp/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base target="_self" />
		<link rel="stylesheet"
			href="${contextPath}/js/jquery/redmond/jquery-ui-1.9.2.custom.css" />
		<link rel="stylesheet"
			href="${contextPath}/js/jquery/jqGrid/ui.jqgrid.css" />
		<link rel="stylesheet"
			href="${contextPath}/js/jquery/jqGrid/ui.multiselect.css" />
		<script type="text/javascript"
			src="${contextPath}/js/jquery/jquery-1.8.0.js"></script>
		<script type="text/javascript"
			src="${contextPath}/js/jquery/jquery-ui-1.8.23.custom.js"></script>
		<script type="text/javascript"
			src="${contextPath}/js/jquery/jqGrid/jquery.jqGrid.min.js"></script>
		<script type="text/javascript"
			src="${contextPath}/js/jquery/jqGrid/grid.locale-cn.js"></script>
		<script type="text/javascript"
			src="${contextPath}/scripts/AjaxFileUploaderV2.1/ajaxfileupload.js"></script>
		<style>
body {
	margin: 0;
	padding: 0;
	font-size: 16;
}
</style>

		<script type="text/javascript">
   String.prototype.trim = function() {     
        //return this.replace(/[(^\s+)(\s+$)]/g,"");//會把字符串中間的空白符也去掉     
        //return this.replace(/^\s+|\s+$/g,""); //     
        return this.replace(/^\s+/g,"").replace(/\s+$/g,"");     
    }
    $(document).ready(function(){
	    	  $("#orders_jqGrid").jqGrid({ 
				url: "${contextPath}/monthBalAcc.do?method=queryCompanyBalAccInfo", 
				datatype:"xml", //为local时初始化不加载，支持json，xml等 
				postData:{'isProvince':'${param.isProvince}'},
				mtype: "POST", 
				colNames:['公司简称','公司代码','公司全称','结算方名称','结算方代码'], //表头 
				colModel:[ //这里会根据index去解析jsonReader中root对象的属性，填充cell 
					{name:'gsjc', index:'gsjc', width:100, align:"center",editable:true, sortable:false},
					{name:'gscode', index:'gscode', width:80, editable:true, align:"center",sortable:false},
					{name:'gsqc', index:'gsqc', width:160, align:"center",editable:true, sortable:false},
					{name:'jsfmc', index:'jsfmc', width:160, editable:true, align:"center",sortable:false},
					{name:'jsfcode', index:'jsfcode', width:80, align:"center",sortable:false}
				],
				width: '1120', //数字 & 'auto','100%' 
				height: 190, 
				rowNum: 20, //每页记录数 
				rowList:[5,10,20,30], //每页记录数可选列表 
				//toolbar:[true,"top"],//工具栏
				pager: '#pager', //分页标签divID 
				viewrecords: true, //显示记录数信息，如果这里设置为false,下面的不会显示 recordtext: "第{0}到{1}条, 共{2}条记录", //默认显示为{0}-{1} 共{2}条 scroll: false, //滚动翻页，设置为true时翻页栏将不显示
				/**这里是排序的默认设置，这些值会根据列表header点击排序时覆盖*/ 
				sortable: true, 
				sortname: "orderId",
				editurl:'${contextPath}/monthBalAcc.do?method=queryCompanyBalAccInfo',
				sortorder: "desc", 
				caption:"分月预览", //显示查询结果表格标题 
				rownumbers: true, //设置列表显示序号,需要注意在colModel中不能使用rn作为index 
				rownumWidth: 20, //设置显示序号的宽度，默认为25 
				shrinkToFit:false, 
				//autoScroll: true,//滚动条
				 multiselect: false, //多选框 
				multiboxonly: true, //在点击表格row时只支持单选，只有当点击checkbox时才多选，需要multiselect=true是有效 
				prmNames : { 
					page: "pageNo",
					rows: "pageSize",
					search: "search" 
				},
				xmlReader:{ //server返回xml解析设定 
					root: "rows", //对于xml中数据列表 
					page: "page",
					total: "total", 
					records: "records",
					repeatitems: true
				},
				gridComplete: function() {
				 
	                var rowIds = $("#orders_jqGrid").jqGrid('getDataIDs');
	                 var curRowData=null;
	                 var curChk=null;
	                for(var k=0; k<rowIds.length; k++) {
	                   curRowData = $("#orders_jqGrid").jqGrid('getRowData', rowIds[k]);
	                   curChk = $("#"+rowIds[k]).find(":checkbox");
	                   curChk.attr("name", "ckbName");   //给每一个checkbox赋名字
	                   var fileCreate=$("#"+rowIds[k]).find("input[name='fileCreate']");
	                   if(fileCreate.value=='true'){
	                   	   curChk.remove();
	                   }else{
		                   curChk.val($("#"+rowIds[k]).attr("id"));
	                   }
	                }
	                //无记录时
	                 var tdArr = $("#tipTab").find("td");
					 if(tdArr!=null&&tdArr.length>0){
					 	$(tdArr[0]).attr("colspan","11");
					 	$(tdArr[0]).css("color","red");
					 	$(tdArr[0]).text($(tdArr[tdArr.length-1]).text());
						$(tdArr[0]).css("text-align","center");
					 }
            	} 
			}); 
			$("#orders_jqGrid").jqGrid('navGrid','#pager',{edit:false,add:false,del:false,search:false});//这里设定分页bar显示的信息
	    	 // $("#orders_jqGrid").closest(".ui-jqgrid-bdiv").css({ 'overflow-x' : 'scroll' }); //水平滚动条
	    	 
	    	   $("#consoleDlg").dialog( {  
				       autoOpen : false,  
				       modal : true, // 设置对话框为模态（modal）对话框  
				       resizable : true,  
				       width : 480,  
				       buttons : { // 为对话框添加按钮  
				           "取消" : function() {  
				               $("#consoleDlg").dialog("close")  
				           },  
				           "新增" : addBal,
				            "删除" : deleteBal
				     }  
				});
				
				   $("#consoleDlgTip").dialog({  
				       autoOpen : false,  
				       modal : true, // 设置对话框为模态（modal）对话框  
				       resizable : true,  
				       width : 480,  
				       buttons : { // 为对话框添加按钮  
				          // "确定" : function(){
				           //			$("#consoleDlgTip").dialog("close")
				          // 	}
				     }  
				});
	    	
	    });
	    
	    var def_title="电渠${param.isProvince=='true'?'省内':'全国'}分账";
	    var openDialog4Adding = function() {  
		    var consoleDlg = $("#consoleDlg");  
		    var dialogButtonPanel = consoleDlg.siblings(".ui-dialog-buttonpane");  
		    consoleDlg.find("input").removeAttr("disabled").val("");  
		    dialogButtonPanel.find("button:not(:contains('取消'))").hide();  
		    dialogButtonPanel.find("button:contains('新增')").show();  
		    consoleDlg.dialog("option", "title", "新增").dialog("open"); 
		     consoleDlg.find("#title").val(def_title); 
		     consoleDlg.find("#tjDate").focus();
}; 
var openDialog4Deleting = function() {

    var consoleDlg = $("#consoleDlg");  
    var dialogButtonPanel = consoleDlg.siblings(".ui-dialog-buttonpane");  
    consoleDlg.find("input").attr("disabled", true);  
    dialogButtonPanel.find("button:not(:contains('取消'))").hide();
    dialogButtonPanel.find("button:contains('删除')").show(); 
    var rowData=getContact();
    var selectedId = $("#orders_jqGrid").jqGrid("getGridParam", "selrow");
    if(selectedId){
     consoleDlg.find("#selectId").val(selectedId);  
     consoleDlg.find("#jsfcode").val(rowData.jsfcode);  
     consoleDlg.find("#jsfmc").val(rowData.jsfmc); 
     consoleDlg.find("#gsqc").val(rowData.gsqc); 
     consoleDlg.find("#gsjc").val(rowData.gsjc); 
     consoleDlg.find("#gscode").val(rowData.gscode); 
     consoleDlg.dialog("option", "title", "删除").dialog("open");  
    }else{
    	alert('请选择要删除的行!');
    }
}
var getContact = function() {
	var selectedId = $("#orders_jqGrid").jqGrid("getGridParam", "selrow");
	//alert('selectedId='+selectedId); 
   //var rowData =
   return  $("#orders_jqGrid").jqGrid("getRowData", selectedId); 
}
var addBal = function() { 
var consoleDlg = $("#consoleDlg");  
  var jsfcode = $.trim(consoleDlg.find("#jsfcode").val());  
  var jsfmc = $.trim(consoleDlg.find("#jsfmc").val());  
  var gsqc = $.trim(consoleDlg.find("#gsqc").val());  
  var gsjc = $.trim(consoleDlg.find("#gsjc").val());  
  var gscode = $.trim(consoleDlg.find("#gscode").val());  
  var params = {
      "jsfcode" : jsfcode,  
      "jsfmc" : jsfmc,  
      "gsqc" : gsqc,  
      "gsjc" : gsjc,  
      "gscode" : gscode
  };  
  if(params.gsjc.trim()==''||params.gsqc.trim()==''||params.jsfmc.trim()==''){
  	alert('公司及结算方不能为空');
  	return ;
  }
  $.ajax( {url : "${contextPath}/monthBalAcc.do?method=addCompany",
  			type: "POST",
              data : params,  
              dataType : "json",  
              cache : false,  
              error : function(textStatus, errorThrown) {  
                  alert("系统ajax交互错误: " + textStatus+","+errorThrown);  
              },  
              success : function(data, textStatus) {  
             	 if(data){
             	 	alert("添加成功!");
             	 	 reloadTable();
             	 }else{
             	 	alert('帐期重复!或系统繁忙!');
             	 }
             	 consoleDlg.dialog("close");
              }   
          });  
};
var deleteBal = function() {
  
   var fileId=$('#selectId').val()+'_create_status';
    var rowData=getContact();
	var params = {  
		"tjDate":rowData.TJ_MNOTH,
		"isProvince":$('#isProvince').val(),
      "selectId" :$('#selectId').val()  
  };  
	  $.ajax( {url : "${contextPath}/monthBalAcc.do?method=delCompany",
  			type: "POST",
              data : params,  
              dataType : "json",  
              cache : false,  
              error : function(textStatus, errorThrown) {  
                  alert("系统ajax交互错误: " + textStatus);  
              },  
              success : function(data, textStatus) {
            
              	if(data){
              		alert("删除成功!");
             	 	 	 $("#consoleDlg").dialog("close");
             	 	 reloadTable();
             	 }else{
             	 	alert('系统繁忙!');
             	 	reloadTable();
             	 }
              
              }   
          });  
 };

	 
 	
	 function reloadTable(){
	    $("#orders_jqGrid").setGridParam({ datatype: 'xml'}); 
	    	var sdata = {   // (3)构建查询需要的参数  
				   "gsjc": $("input[name='gsjc']").val(),
				   "gsqc": $("input[name='gsqc']").val()
			};  
			// (4)获得当前postData选项的值  
			var postData = $("#orders_jqGrid").jqGrid("getGridParam", "postData");  
			// (5)将查询参数融入postData选项对象  
			$.extend(postData, sdata); 
			$("#orders_jqGrid").trigger("reloadGrid", [{page:1}]);// (7)重新载入Grid表格，以使上述设置生效  
	 }
	 
	</script>
	</head>
	<body>
		<span style='font-size: 12px; text-align: left'> >>电渠分账公司管理<< </span>
		<br />
		<br />
		<button class="right-button02" onclick="reloadTable()">
			查询
		</button>
		<button class="right-button02" onclick="openDialog4Adding()">
			添加
		</button>
		<button class="right-button02" onclick="openDialog4Deleting()">
			删除
		</button>
	<font size="2px"> 
		公司简称：<input name="gsjc" id="gsjc"/>
		公司全称：<input type="text" id="gsqc" name="gsqc" maxlength='20' />
		结算方名称：<input type="text" id="jsfmc" name="jsfmc" maxlength='20' />
	</font>
		<div
			style="height: 30px; font-size: 12px; text-align: right; margin-right: 50px;">
			<table id="orders_jqGrid"></table>
			<div id="pager"></div>
		</div>

		<div id="consoleDlg" style="display: none;">
			<form id="consoleForm" method="post" action="">
				<input type="hidden" id="selectId" />
				<input type="hidden" id="province" name="province" />
				<table>
					<tr>
						<th>
							公司简称：
						</th>
						<td>
							<input name="gsjc" id="gsjc"/>
						</td>
					</tr>
					<tr>
						<th>
							公司全称：
						</th>
						<td><input type="text" id="gsqc" name="gsqc" maxlength='20' />
						</td>
					</tr>
					<tr>
						<th>
							公司代码：
						</th>
						<td><input type="text" id="gscode" name="gscode" maxlength='20' />
						</td>
					</tr>
					<tr>
						<th>
							结算方名称：
						</th>
						<td><input type="text" id="jsfmc" name="jsfmc" maxlength='20' />
						</td>
					</tr>
					<tr>
						<th>
							结算方代码：
						</th>
						<td><input type="text" id="jsfcode" name="jsfcode" maxlength='20' />
						</td>
					</tr>
				</table>
			</form>
		</div>
		<div id="consoleDlgTip" style="display: none;">
		</div>
		<iframe style="display: none;" id="exportFram" />
	</body>
</html>
