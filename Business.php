
<?php 
  session_start(); 

  if (!isset($_SESSION['username'])) {
  	$_SESSION['msg'] = "You must log in first";
  	header('location: login.php');
  }
  if (isset($_GET['logout'])) {
  	session_destroy();
  	unset($_SESSION['username']);
  	header("location: login.php");
  }
?>

<!DOCTYPE html>

<html lang="en">
    
  <head>
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <link href="css/sb-admin.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css?family=Catamaran' rel='stylesheet'>
	<script>
window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer2", {
	exportEnabled: true,
	animationEnabled: true,
	title:{
		text: "Keyword Contribution"
	},
	legend:{
		cursor: "pointer",
		itemclick: explodePie
	},
	data: [{
		type: "pie",
		showInLegend: true,
		toolTipContent: "{name}: <strong>{y}%</strong>",
		indexLabel: "{name} - {y}%",
		dataPoints: [
			{ y: 26, name: "School Aid", exploded: true },
			{ y: 20, name: "Medical Aid" },
			{ y: 5, name: "Debt/Capital" },
			{ y: 3, name: "Elected Officials" },
			{ y: 7, name: "University" },
			{ y: 17, name: "Executive" },
			{ y: 22, name: "Other Local Assistance"}
		]
	}]
});
chart.render();
}


</script>

<script>
window.onload = function () {

/*var barchart = new CanvasJS.Chart("chartContainer1", {
	animationEnabled: true,
	theme: "light2", // "light1", "light2", "dark1", "dark2"
	title:{
		text: "Count for past six months"
	},
	axisY: {
		title: "Count"
	},
	data: [{        
		type: "column",  
		showInLegend: true, 
		legendMarkerColor: "grey",
		legendText: "MMbbl = one million barrels",
		dataPoints: [      
			{ y: 300878, label: "GST" },
			{ y: 266455,  label: "Aviation" },
			{ y: 169709,  label: "HDFC" },
			{ y: 158400,  label: "Tesla" },
			
		]
	}]
});
barchart.render();*/

var chart = new CanvasJS.Chart("chartContainer2", {
	exportEnabled: true,
	animationEnabled: true,
	title:{
		text: "Keyword Contribution"
	},
	legend:{
		cursor: "pointer",
		itemclick: explodePie
	},
	data: [{
		type: "pie",
		showInLegend: true,
		toolTipContent: "{name}: <strong>{y}%</strong>",
		indexLabel: "{name} - {y}%",
		dataPoints: [
			{ y: 26, name: "HDFC", exploded: true },
			{ y: 20, name: "Tesla" },
			{ y: 5, name: "Aviation" },
			{ y: 3, name: "GST" },
			/*{ y: 7, name: "University" },
			{ y: 17, name: "Executive" },
			{ y: 22, name: "Other Local Assistance"}*/
		]
	}]
});
chart.render();


var lineChart1 = new CanvasJS.Chart("chartContainer3", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "HDFC - variation"
	},
	axisY:{
		includeZero: false
	},
	data: [{        
		type: "line",
		lineColor:"black",
      	lineThickness: 1,
		markerType: "circle",
		markerColor: "black",
		markerSize: 5,
			
		dataPoints: [
			{ y: 450 , indexLabel: "first used",markerSize: 10,markerColor: "black", markerType: "square"},
			{ y: 414},
			{ y: 520, indexLabel: "highest",markerSize: 10,markerColor: "green", markerType: "triangle" },
			{ y: 460 },
			{ y: 450 },
			{ y: 500 },
			{ y: 480 },
			{ y: 480 },
			{ y: 410 , indexLabel: "lowest",markerSize: 10,markerColor: "red", markerType: "cross" },
			{ y: 500 },
			{ y: 480 },
			{ y: 510 }
		]
	}]
});
lineChart1.render();


var lineChart2 = new CanvasJS.Chart("chartContainer4", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "Tesla - variation"
	},
	axisY:{
		includeZero: false
	},
	data: [{        
		type: "line",
		lineColor:"black",
      	lineThickness: 1,
		markerType: "circle",
		markerColor: "black",
		markerSize: 5,
		dataPoints: [
			{ y: 450 , indexLabel: "first used",markerSize: 10,markerColor: "green", markerType: "square"},
			{ y: 414},
			{ y: 520, indexLabel: "highest",markerSize: 10,markerColor: "red", markerType: "triangle" },
			{ y: 460 },
			{ y: 450 },
			{ y: 500 },
			{ y: 480 },
			{ y: 480 },
			{ y: 410 , indexLabel: "lowest",markerSize: 10,markerColor: "DarkSlateGrey", markerType: "cross" },
			{ y: 500 },
			{ y: 480 },
			{ y: 510 }
		]
	}]
});
lineChart2.render();

var lineChart3 = new CanvasJS.Chart("chartContainer5", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "Aviation - variation"
	},
	axisY:{
		includeZero: false
	},
	data: [{        
		type: "line",
		lineColor:"black",
      	lineThickness: 1,
		markerType: "circle",
		markerColor: "black",
		markerSize: 5,
		dataPoints: [
			{ y: 450 , indexLabel: "first used",markerSize: 10,markerColor: "black", markerType: "square"},
			{ y: 414},
			{ y: 520, indexLabel: "highest",markerSize: 10,markerColor: "green", markerType: "triangle" },
			{ y: 460 },
			{ y: 450 },
			{ y: 500 },
			{ y: 480 },
			{ y: 480 },
			{ y: 410 , indexLabel: "lowest",markerSize: 10,markerColor: "red", markerType: "cross" },
			{ y: 500 },
			{ y: 480 },
			{ y: 510 }
		]
	}]
});
lineChart3.render();

var lineChart4 = new CanvasJS.Chart("chartContainer6", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "GST - variation"
	},
	axisY:{
		includeZero: false
	},
	data: [{        
		type: "line",
		lineColor:"black",
      	lineThickness: 1,
		markerType: "circle",
		markerColor: "black",
		markerSize: 5,
		dataPoints: [
			{ y: 450 , indexLabel: "first used",markerSize: 10,markerColor: "black", markerType: "square"},
			{ y: 414},
			{ y: 520, indexLabel: "highest",markerSize: 10,markerColor: "green", markerType: "triangle" },
			{ y: 460 },
			{ y: 450 },
			{ y: 500 },
			{ y: 480 },
			{ y: 480 },
			{ y: 410 , indexLabel: "lowest",markerSize: 10,markerColor: "red", markerType: "cross" },
			{ y: 500 },
			{ y: 480 },
			{ y: 510 }
		]
	}]
});
lineChart4.render();

}

function explodePie (e) {
	if(typeof (e.dataSeries.dataPoints[e.dataPointIndex].exploded) === "undefined" || !e.dataSeries.dataPoints[e.dataPointIndex].exploded) {
		e.dataSeries.dataPoints[e.dataPointIndex].exploded = true;
	} else {
		e.dataSeries.dataPoints[e.dataPointIndex].exploded = false;
	}
	e.chart.render();

}
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}

</script>
      
    <meta charset="utf-8">
      
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd" crossorigin="anonymous">
      
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
      
      <style>
			#chartContainer1{<!--barchart-->
				margin-top:100px;
				align:right;
				height:350px;
				width:40%;
			}
			#chartContainer2{
				margin-top:100px;
				align:right;
				height:450px;
				width:450px;
			}
			#chartContainer3{
				margin-top:10px;
				margin-left:40px;
				
			}
			#chartContainer4{
				margin-top:10px;
				margin-left:40px;
				
			}
			#chartContainer5{
				margin-top:10px;
				margin-left:40px;
				
			}
			#chartContainer6{
				margin-top:10px;
				margin-left:40px;
				
			}
			.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: black;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
	margin-top:55px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 15px;
    color: white;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
				
			
      .nav.navbar-nav.navbar-right a {
    color: white;
}
          .jumbotron {
              
              background-image: url('calculator-scientific.jpeg');
              text-align: center;
              margin-top: 50px;
          }
          
          #email {
              
              width: 300px;
              
          }
          
          #appSummary {
              
              text-align: center;
              margin-top:50px;
              margin-bottom: 50px;
              
          }
          
          .card-img-top {
              
              width: 100%;
              
          }
          
          #appStoreIcon {
		  
		  
              height: 1px
              width: 1px;
              
          }
          
          #footer {
              
              background-color: black;
              padding-top: 150px;
              margin-top: 50px;
              text-align: center;
              padding-bottom: 150px;
			  font-size:10px;
			  color:white;
          }
          
          body {
              font-family: 'Catamaran';
              position: relative;
              
          }
      
      </style>
      
  </head>
    
  <body data-spy="scroll" data-target="#navbar" data-offset="150">
      
        <nav class="navbar navbar-dark bg-dark navbar-fixed-top" style="background-color:black;color:white" id="navbar">
		
          <a class="navbar-brand" href="#">MyApp</a>
          <ul class="nav navbar-nav">
			<li class="nav-item">
				<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">Business</a>
  <a href="#">Banking</a>
  <a href="#">Finance</a>
  <a href="#">Technology</a>
  <a href="#">Editorials/Opinions</a>
</div>
<!--<h2>Animated Sidenav Example</h2>
<p></p>-->


<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span>
              
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#HDFC">HDFC<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#Tesla">Tesla</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#Aviation">Aviation</a>
            </li>
			<li class="nav-item">
              <a class="nav-link" href="#gst">GST</a>
            </li>
          </ul>
          <form class="form-inline pull-xs-right">
            <button class="btn btn-secondary" type="submit"><a href="index1.php" style="color:black ;text-decoration:none">Back</a></button>
          </form>
        </nav>
		

		<!--	<div id="mySidenav" class="sidenav">
			  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
			  <a href="#">About</a>
			  <a href="#">Services</a>
			  <a href="#">Clients</a>
			  <a href="#">Contact</a>
			</div>

<h2>Animated Sidenav Example</h2>
<p>Click on the element below to open the side navigation menu.</p>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span>-->

    <!--    <div class="jumbotron" id="jumbotron">
          <h1 class="display-3">XYZ Classes</h1>
          <p class="lead">A pioneer in competitive exams since its inception!</p>
          <hr class="m-y-2">
          <p>Want to know more? Sign Up NOW!</p>

        <form class="form-inline">
          <div class="form-group">
            <label class="sr-only" for="email">Email address</label>
            <div class="input-group">
              <div class="input-group-addon">@</div>
              <input type="email" class="form-control" id="email" placeholder="Your email">
            </div>
          </div>
          <button type="submit" class="btn btn-primary">Sign up</button>
        </form>
        </div>-->
		
		
	<div class="container" align="center">
		<div class="row">
			<div class="col-sm-12">
				<div id="chartContainer2" ></div>
				<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
				pie
			</div>
			<!--<div class="col-sm-6">
				<div id="chartContainer1" style="height: 370px; width: 40%;"></div>
				<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
				bar
			</div>-->
		</div>
	</div>
	
	
	<br id="HDFC">
	<br>
	<br>
	<div class="container">
		<div class="card text-white bg-dark mb-3" >
  <div class="card-header "style="background-color:black;color:white">
    HDFC
  </div>
  <div class="card-body">
	<div class="row" >
	<div id="chartContainer3" style="height: 370px; width: 95%;"></div></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>

</div>
</div>
</div>

	<br>
	<br>
	<br>
	<div class="container"id="Tesla">
		<div class="card text-white bg-dark mb-3" >
		<div class="card-header "style="background-color:black;color:white">
    Tesla
  </div>
  <div class="card-body">
	<div class="row" >	 
	<div id="chartContainer4" style="height: 370px; width: 95%;"></div></div>
	
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</div>
</div>
</div>
	<br>
	<br>
	<br>
	<div class="container"id="Aviation">
		<div class="card text-white bg-dark mb-3" >
		<div class="card-header "style="background-color:black;color:white">
    Aviation
  </div>
  <div class="card-body">
	<div class="row" >
	<div id="chartContainer5" style="height: 370px; width: 95%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</div>
</div>
</div>
</div>
	<br>
	<br>
	<br>
	<div class="container"id="gst">
		<div class="card text-white bg-dark mb-3" >
		<div class="card-header "style="background-color:black;color:white">
    GST
  </div>
	<div class="card-body">
	<div class="row" >
	<div id="chartContainer6" style="height: 370px; width: 95%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</div>
</div>
</div>
</div>
	
      
   <!--   <div class="container">
      
        <div class="row" id="appSummary">
          
            <h1>XYZ </h1>
            <p class="lead">A champion creator since 15000 years</p>
          
          </div>
          
      </div>
      
     <!-- <div class="container" id="about">
      <div class="card-deck-wrapper">
  <div class="card-deck">
    <div class="card">
      <img class="card-img-top" src="physics.jpg" alt="Card image cap">
      <div class="card-block">
        <h4 class="card-title">Physics</h4>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additiona</p>
        
      </div>
    </div>
    <div class="card">
      <img class="card-img-top" src="chemistry.jpeg" alt="Card image cap">
      <div class="card-block">
        <h4 class="card-title">Chemistry</h4>
        <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
        
      </div>
    </div>
    <div class="card">
      <img class="card-img-top" src="math.jpg" alt="Card image cap">
      <div class="card-block">
        <h4 class="card-title">Mathematics</h4>
        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additio</p>
       
      </div>
    </div>
  </div>
</div>
          </div>-->
      
      <div id="footer">
      
        <div class="row">
          
                <h2 color="white">Find us on social media!</h2>
            
            <p >And get know more about us</p>
            
            <p ><a href=""><img style="width:50px;height:50px;" src="fbbnw.png"></a>
			   |      <a href=""><img style="width:50px;height:50px;" src="twitterbnw.png"></a>
			   |      <a href=""><img style="width:50px;height:50px;" src="instabnw.png"></a>
			
			</p>
            
            
          
          </div>
      
      </div>
      
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/js/bootstrap.min.js" integrity="sha384-vZ2WRJMwsjRMW/8U7i6PWi6AlO1L79snBrmgiDpgIWJ82z8eA5lenwvxbMV1PAh7" crossorigin="anonymous"></script>