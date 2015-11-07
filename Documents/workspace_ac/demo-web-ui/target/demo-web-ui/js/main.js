
$(document).ready(function() {
	
	submit_onclick();
});

function submit_onclick() {
	
	$('#submit').click(function(){
		
//		alert("调用一下！");
//		var value = {"name":"DC", "city":"x"};
//		
//		$.post('/demo-web-ui/api/jobs',
//				value,
//				function(data,status){
//			alert("Data: " + data + "nStatus: " + status);
//		});
		$.post("/demo-web-ui/api/jobs",
				  {
				   
				  },
				  function(data,status){
				   //alert("Data: " + data + "nStatus: " + status);
				   // $('#value').text("Here is the value!");
					$('#value').text(JSON.stringify(data) + status);
				    
				  });
		
	});
};