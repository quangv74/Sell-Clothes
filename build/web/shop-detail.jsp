<%-- 
    Document   : shop-detail
    Created on : Nov 2, 2020, 1:35:47 PM
    Author     : my laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Universal - All In 1 Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="robots" content="all,follow">
        <!-- Bootstrap CSS-->
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome CSS-->
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
        <!-- Google fonts - Roboto-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,700">
        <!-- Bootstrap Select-->
        <link rel="stylesheet" href="vendor/bootstrap-select/css/bootstrap-select.min.css">
        <!-- owl carousel-->
        <link rel="stylesheet" href="vendor/owl.carousel/assets/owl.carousel.css">
        <link rel="stylesheet" href="vendor/owl.carousel/assets/owl.theme.default.css">
        <!-- theme stylesheet-->
        <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
        <!-- Custom stylesheet - for your changes-->
        <link rel="stylesheet" href="css/custom.css">
        <!-- Favicon and apple touch icons-->
        <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="img/apple-touch-icon.png">
        <link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57.png">
        <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png">
        <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png">
        <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png">
        <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png">
        <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png">
        <!-- Tweaks for older IEs--><!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    </head>
    <body>
        <div id="all">
            <!-- Top bar-->
            <div class="top-bar">
                <div class="container">
                    <div class="row d-flex align-items-center">
                        <div class="col-md-6 d-md-block d-none">
                            <p>Contact us on 0343348610 or quangvhe140807@fpt.edu.vn</p>
                        </div>
                        <div class="col-md-6">
                            <div class="d-flex justify-content-md-end justify-content-between">
                                <ul class="list-inline contact-info d-block d-md-none">
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                                </ul>
                                <c:if test="${sessionScope.account eq null}">
                                <div class="login"><a href="#" data-toggle="modal" data-target="#login-modal" class="login-btn"><i class="fa fa-sign-in"></i><span class="d-none d-md-inline-block">Sign In</span></a><a href="Register" class="signup-btn"><i class="fa fa-user"></i><span class="d-none d-md-inline-block">Sign Up</span></a></div>
                                </c:if>
                                <c:if test="${sessionScope.account ne null}">
                                    <div><h3>Welcome ${sessionScope.account.username}</h3></div>
                                </c:if>
                                <ul class="social-custom list-inline">
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Top bar end-->
            <!-- Login Modal-->
            <div id="login-modal" tabindex="-1" role="dialog" aria-labelledby="login-modalLabel" aria-hidden="true" class="modal fade">
                <div role="document" class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 id="login-modalLabel" class="modal-title">Customer Login</h4>
                            <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
                        </div>
                        <div class="modal-body">
                            <form action="User" method="POST">
                                <div class="form-group">
                                    <input id="email_modal" type="text" placeholder="email" class="form-control" name="user">
                                </div>
                                <div class="form-group">
                                    <input id="password_modal" type="password" placeholder="password" class="form-control" name="password">
                                </div>
                                <p class="text-center">
                                    <button class="btn btn-template-outlined" type="submit"><i class="fa fa-sign-in"></i> Log in</button>
                                </p>
                            </form>
                            <p class="text-center text-muted">Not registered yet?</p>
                            <p class="text-center text-muted"><a href="Register"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Login modal end-->
            <!-- Navbar Start-->
            <header class="nav-holder make-sticky">
                <div id="navbar" role="navigation" class="navbar navbar-expand-lg">
                    <div class="container"><a href="Home" class="navbar-brand home"><img src="img/Logopage.png" alt="Universal logo" class="d-none d-md-inline-block"><img src="img/logo-small.png" alt="Universal logo" class="d-inline-block d-md-none"><span class="sr-only">Universal - go to homepage</span></a>
                        <button type="button" data-toggle="collapse" data-target="#navigation" class="navbar-toggler btn-template-outlined"><span class="sr-only">Toggle navigation</span><i class="fa fa-align-justify"></i></button>
                        <div id="navigation" class="navbar-collapse collapse">
                            <ul class="nav navbar-nav ml-auto">
                                <li class="nav-item dropdown active"><a href="javascript: void(0)" data-toggle="dropdown" class="dropdown-toggle">Home <b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li class="dropdown-item"><a href="Category" class="nav-link">Shopping</a></li>
                                        <li class="dropdown-item"><a href="DisplayOrder" class="nav-link">Shopping cart</a></li>
                                        <li class="dropdown-item"><a href="MakeOrder" class="nav-link">Order</a></li>
                                    </ul>
                                </li>
                                <!-- ========== FULL WIDTH MEGAMENU END ==================-->
                                <!-- ========== Contact dropdown ==================-->
                                <li class="nav-item dropdown"><a href="javascript: void(0)" data-toggle="dropdown" class="dropdown-toggle">My Account<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li class="dropdown-item"><a href="Register" class="nav-link">Register / login</a></li>
                                        <li class="dropdown-item"><a href="Account" class="nav-link">Customer account / change password</a></li>
                                        <c:if test="${sessionScope.account != null}">
                                        <li class="dropdown-item"><a href="Logout" class="nav-link">Logout</a></li>
                                        </c:if>
                                    </ul>
                                </li>
                                <!-- ========== Contact dropdown end ==================-->
                            </ul>
                        </div>
                        <div id="search" class="collapse clearfix">
                            <form role="search" class="navbar-form">
                                <div class="input-group">
                                    <input type="text" placeholder="Search" class="form-control"><span class="input-group-btn">
                                        <button type="submit" class="btn btn-template-main"><i class="fa fa-search"></i></button></span>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </header>
            <!-- Navbar End-->

            <div id="heading-breadcrumbs">
                <div class="container">
                    <div class="row d-flex align-items-center flex-wrap">
                        <div class="col-md-7">
                            <h1 class="h2">White Blouse Armani</h1>
                        </div>
                        <div class="col-md-5">
                            <ul class="breadcrumb d-flex justify-content-end">
                                <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                                <li class="breadcrumb-item"><a href="shop-category.html">Ladies</a></li>
                                <li class="breadcrumb-item"><a href="shop-category.html">Tops</a></li>
                                <li class="breadcrumb-item active">White Blouse Armani</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content">
                <div class="container">
                    <div class="row bar">
                        <!-- LEFT COLUMN _________________________________________________________-->
                        <div class="col-lg-9">
                            <p class="lead">Built purse maids cease her ham new seven among and. Pulled coming wooded tended it answer remain me be. So landlord by we unlocked sensible it. Fat cannot use denied excuse son law. Wisdom happen suffer common the appear ham beauty her had. Or belonging zealously existence as by resources.</p>
                            <p class="goToDescription"><a href="#details" class="scroll-to text-uppercase">Scroll to product details, material & care and sizing</a></p>
                            <div id="productMain" class="row">
                                <div class="col-sm-6">
                                    <div data-slider-id="1" class="owl-carousel shop-detail-carousel">

                                        <div> <img src="img/${requestScope.anh.image1}" alt="" class="img-fluid"></div>
                                        <div> <img src="img/${requestScope.anh.image2}" alt="" class="img-fluid"></div>
                                        <div> <img src="img/${requestScope.anh.image3}" alt="" class="img-fluid"></div>

                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="box">
                                        <form action="ShoppingCart" method="POST">
                                            <div class="sizes">
                                                <h3>Available sizes</h3>
                                                <select class="bs-select">
                                                    <c:forEach items="${requestScope.listsize}" var="size">
                                                        <option value="small">${size.size}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <p class="price">$${requestScope.anh.proprice}</p>
                                            <p class="text-center">
                                                <button type="submit" class="btn btn-template-outlined"><i class="fa fa-shopping-cart"></i><input type="hidden" name="idpro" value="${requestScope.anh.proid}"> Add to cart</button>
                                                <button type="submit" data-toggle="tooltip" data-placement="top" title="Add to wishlist" class="btn btn-default"><i class="fa fa-heart-o"></i></button>
                                            </p>
                                        </form>
                                    </div>
                                    <div data-slider-id="1" class="owl-thumbs">
                                        <button class="owl-thumb-item"><img src="img/${requestScope.anh.image1}" alt="" class="img-fluid"></button>
                                        <button class="owl-thumb-item"><img src="img/${requestScope.anh.image2}" alt="" class="img-fluid"></button>
                                        <button class="owl-thumb-item"><img src="img/${requestScope.anh.image3}" alt="" class="img-fluid"></button>
                                    </div>
                                </div>
                            </div>
                            <div id="details" class="box mb-4 mt-4">
                                <p></p>
                                <h4>Product details</h4>
                                <p>White lace top, woven, has a round neck, short sleeves, has knitted lining attached</p>
                                <h4>Material & care</h4>
                                <ul>
                                    <li>Polyester</li>
                                    <li>Machine wash</li>
                                </ul>
                                <h4>Size & Fit</h4>
                                <ul>
                                    <li>Regular fit</li>
                                    <li>The model (height 5'8 "and chest 33") is wearing a size S</li>
                                </ul>
                                <blockquote class="blockquote">
                                    <p class="mb-0"><em>Define style this season with Armani's new range of trendy tops, crafted with intricate details. Create a chic statement look by teaming this lace number with skinny jeans and pumps.</em></p>
                                </blockquote>
                            </div>
                            <div id="product-social" class="box social text-center mb-5 mt-5">
                                <h4 class="heading-light">Show it to your friends</h4>
                                <ul class="social list-inline">
                                    <li class="list-inline-item"><a href="#" data-animate-hover="pulse" class="external facebook"><i class="fa fa-facebook"></i></a></li>
                                    <li class="list-inline-item"><a href="#" data-animate-hover="pulse" class="external gplus"><i class="fa fa-google-plus"></i></a></li>
                                    <li class="list-inline-item"><a href="#" data-animate-hover="pulse" class="external twitter"><i class="fa fa-twitter"></i></a></li>
                                    <li class="list-inline-item"><a href="#" data-animate-hover="pulse" class="email"><i class="fa fa-envelope"></i></a></li>
                                </ul>
                            </div>
                            <div class="row">
                                <div class="col-lg-3 col-md-6">
                                    <div class="box text-uppercase mt-0 mb-small">
                                        <h3>You may also like these products</h3>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product2.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product3.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product1.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-3 col-md-6">
                                    <div class="box text-uppercase mt-0 mb-small">
                                        <h3>Products viewed recently</h3>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product3.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product1.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-3 col-md-6">
                                    <div class="product">
                                        <div class="image"><a href="#"><img src="img/product2.jpg" alt="" class="img-fluid image1"></a></div>
                                        <div class="text">
                                            <h3 class="h5"><a href="shop-detail.html">Fur coat</a></h3>
                                            <p class="price">$143</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <!-- MENUS AND FILTERS-->
                            <div class="panel panel-default sidebar-menu">
                                <div class="panel-heading">
                                    <h3 class="h4 panel-title">Categories</h3>
                                </div>
                                <div class="panel-body">
                                    <ul class="nav nav-pills flex-column text-sm category-menu">
                                        <li class="nav-item"><a href="shop-category.html" class="nav-link d-flex align-items-center justify-content-between"><span>Men </span><span class="badge badge-secondary">42</span></a>
                                            <ul class="nav nav-pills flex-column">
                                                <c:forEach items="${requestScope.listcateboy}" var="b">
                                                    <li class="nav-item"><a href="Paging?id=${b.cateid}" class="nav-link">${b.catename}</a></li>

                                                </c:forEach>
                                            </ul>
                                        </li>
                                        <li class="nav-item"><a href="shop-category.html" class="nav-link active d-flex align-items-center justify-content-between"><span>Ladies  </span><span class="badge badge-light">123</span></a>
                                            <ul class="nav nav-pills flex-column">
                                                <c:forEach items="${requestScope.listcategirl}" var="g">
                                                    <li class="nav-item"><a href="Paging?id=${g.cateid}" class="nav-link">${g.catename}</a></li>

                                                </c:forEach>
                                            </ul>
                                        </li
                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <!-- GET IT-->
                <div class="get-it">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-8 text-center p-3">
                                
                            </div>
                           
                        </div>
                    </div>
                </div>
                <!-- FOOTER -->
                <footer class="main-footer">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <h4 class="h6">About Us</h4>
                            <p>A youthful store with top sales experience Lots of new products suitable for today's young people, come to us for a new experience.</p>
                            <hr>

                            <hr class="d-block d-lg-none">
                        </div>

                        <div class="col-lg-3">
                            <h4 class="h6">Contact</h4>
                            <p class="text-uppercase"><strong>Quangvhe140807@fpt.edu.vn</strong><br>FPT University<br>KimGiangStreet<br>Facebook:Quang<br>VietNam<br><strong>HaNoi</strong></p>
                            <hr class="d-block d-lg-none">
                        </div>

                    </div>
                </div>
                <div class="copyrights">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-4 text-center-md">
                                <p>&copy; 2020. Your company / QuangShopPu</p>
                            </div>

                        </div>
                    </div>
                </div>
            </footer>
            </div>
            <!-- Javascript files-->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/popper.js/umd/popper.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
            <script src="vendor/jquery.cookie/jquery.cookie.js"></script>
            <script src="vendor/waypoints/lib/jquery.waypoints.min.js"></script>
            <script src="vendor/jquery.counterup/jquery.counterup.min.js"></script>
            <script src="vendor/owl.carousel/owl.carousel.min.js"></script>
            <script src="vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js"></script>
            <script src="js/jquery.parallax-1.1.3.js"></script>
            <script src="vendor/bootstrap-select/js/bootstrap-select.min.js"></script>
            <script src="vendor/jquery.scrollto/jquery.scrollTo.min.js"></script>
            <script src="js/front.js"></script>
    </body>
</html>
