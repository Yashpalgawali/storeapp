/**
 * 
 */
 	function removeitem(id)
  	{
  		if (window.confirm("Do you really want to Delete?")) 
  		{ 
	  		$.ajax({
	  			
	 			url	: '/removeitem/'+id,
	 			type : 'GET',
	 			success: function()
	 			{
	 				location.reload();
	 			}
	  		});
  		}
  		else{
  			location.reload();
  		}
  	}