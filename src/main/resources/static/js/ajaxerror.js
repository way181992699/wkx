$.ajax({
    	url: "/My/queryAll",
    	type: "POST",
    	async: false,
    	success: function(data) {
    		debugger;
            if(data.status == 200 && data.msg == "OK") {
            	alert(JSON.stringify(data));
            	alert(data.data.count);
            } else {
            	alert("发生异常：" + data.msg);
            }
    	},
        error: function (response, ajaxOptions, thrownError) {
        	debugger;
        	alert("error");       
        }
    });