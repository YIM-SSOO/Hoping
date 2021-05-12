<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
  <meta name="generator" content="Hugo 0.83.1">
  <title>호핑! 기업소개</title>

  <!--Header CSS-->
  <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="../css/header.css">

  <!-- Bootstrap core CSS -->
  <link href="../css/bootstrap.min.css" rel="stylesheet">
  
  <link href="../css/album.css" rel="stylesheet">
	
  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }

    a:link {
      color: black;
    }

    a:visited {
      color: black;
    }

    a:active {
      color: gray;
    }
  </style>


</head>

<body>
  <!--header-->
  <div id="site__header" style="font-family: 'Poppins', sans-serif;">
    <nav class="navbar" style="text-decoration: none; list-style-type: none; color:black">
      <div class="navbar__logo" style="text-decoration: none; list-style-type: none;">
        <a href="#" id="header__a"><b>HOPing</b><b style="color: #FFBF00">.</b></a>
      </div>

      <ul class="navbar__menu" id="navbar__menu__a">
        <li><a href="#"><span>MAIN</span></a></li>
        <li><a href="#"><span>MAIN</span></a></li>
        <li><a href="#"><span>MAIN</span></a></li>
        <li><a href="#"><span>MAIN</span></a></li>
        <li><a href="#"><span>MAIN</span></a></li>
        <li class="login_out"><a href="#"><span style="font-size: small;">Login/Bye</span></a></li>
      </ul>
    </nav>
  </div>


  <main>

    <div class="field">
      <ul class="choice">분야</ul>
      <ul id="list">
        <li><a href="#">#IT</a></li>
        <li><a href="#">#교육</a></li>
        <li><a href="#">#영업</a></li>
        <li><a href="#">#서비스</a></li>
      </ul>
    </div>

    <div class="job">
      <ul class="choice">직무</ul>
      <ul id="list">
        <li><a href="#">#서울</a></li>
        <li><a href="#">#강남구</a></li>
        <li><a href="#">#서비스</a></li>
        <li><a href="#">#IT</a></li>
      </ul>
    </div>

    <div class="album py-5 bg-light">
      <div class="container">
		
         <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

          <div class="col1">
         
            <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          	
          </div>

          <div class="col2">
            <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          </div>

          <div class="col3">
            <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          </div>

          <div class="col4">
             <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          </div>

          <div class="col5">
            <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          </div>

          <div class="col6">
             <div class="card shadow-sm"> 
             <a href="#">
              <img src="../images/samsung.jpg" style="width:350px; height:225px;" alt="" />
              </a>
              <div class="card-body">
              <h2><a href="#">뽑는 분야 </a></h2>
                <ul>
                <li class="com-text"><a href="#">기업 이름</a></li>
                <li><a href="#">연봉</a></li>
                </ul>
               
             </div>
            </div>
          </div>




        </div>
      </div>
    </div>

  </main>

  <!--
<footer class="text-muted py-5">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#">Back to top</a>
    </p>
    <p class="mb-1">Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
    <p class="mb-0">New to Bootstrap? <a href="/">Visit the homepage</a> or read our <a href="../getting-started/introduction/">getting started guide</a>.</p>
  </div>
</footer>
-->




</body>

</html>