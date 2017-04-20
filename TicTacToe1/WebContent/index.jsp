<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#game {
width:200px;
height:190px;
background:#eee;
border: 1px solid #ddd;
margin: 1px auto;
padding:1px;
overflow: auto;
}
#game div {
margin:0 auto;
clear:both;
width:180px;
}
#game input {
display:block;
float:left;
width: 60px;
height:60px;
margin:0px;
}
#gameActionDisplay { 
position:relative;
top:10px;
text-align:center;
padding :5px 5px;
}
</style>
	<script>
		function button(pos){
			if(pos != "69"){
				document.form1.move.value = pos;	
			}else{
				document.form1.move.value = "end";	
			}						
			document.form1.submit();
		}
	</script>
</head>
<body>
<form name="form1" action="play" method="get">
				<center><h1>Tic Tac Toe</h1></center>
				</br>
				<input type="hidden" name="move"/>
				</br>
				<input type="hidden" name="" value="${result}"/>
				</br>
<div id="game">
<div>
<input  name="btn1" type="button" value="${player1} " onclick="button(1)"></button>
<input  name="btn2 "type="button" value="${player2} "onclick="button(2)"></button>
<input  name="btn3" type="button" value="${player3} "onclick="button(3)"></button>
</div>
<div>
<input  name="btn4" type="button" value="${player4} "onclick="button(4)"></button>
<input  name="btn5" type="button" value="${player5} "onclick="button(5)"></button>
<input  name="btn6" type="button" value="${player6} "onclick="button(6)"></button>
</div>
<div>
<input  name="btn7" type="button" value="${player7} "onclick="button(7)"></button>
<input  name="btn8" type="button" value="${player8} "onclick="button(8)"></button>
<input  name="btn9" type="button" value="${player9} "onclick="button(9)"></button>
</div>
</div>
					</br>
					<center>
					<input type="button"  onclick="button(69)" value="Restart" />
					</center>
					</br>
					</br>
					
							<center><h2> ${result} </h2>		</center>			    
					
			</form>
			
</body>
</html>