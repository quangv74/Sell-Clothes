package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Universal - All In 1 Template</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"robots\" content=\"all,follow\">\n");
      out.write("        <!-- Bootstrap CSS-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome CSS-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Google fonts - Roboto-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,700\">\n");
      out.write("        <!-- Bootstrap Select-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap-select/css/bootstrap-select.min.css\">\n");
      out.write("        <!-- owl carousel-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.theme.default.css\">\n");
      out.write("        <!-- theme stylesheet-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.default.css\" id=\"theme-stylesheet\">\n");
      out.write("        <!-- Custom stylesheet - for your changes-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("        <!-- Favicon and apple touch icons-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"img/apple-touch-icon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"img/apple-touch-icon-57x57.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"img/apple-touch-icon-72x72.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"img/apple-touch-icon-76x76.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"img/apple-touch-icon-114x114.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"img/apple-touch-icon-120x120.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"img/apple-touch-icon-144x144.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"img/apple-touch-icon-152x152.png\">\n");
      out.write("        <!-- Tweaks for older IEs--><!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"all\">\n");
      out.write("            <!-- Top bar-->\n");
      out.write("            <div class=\"top-bar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row d-flex align-items-center\">\n");
      out.write("                        <div class=\"col-md-6 d-md-block d-none\">\n");
      out.write("                            <p>Contact us on 0343348610 or quangvhe140807@fpt.edu.vn</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"d-flex justify-content-md-end justify-content-between\">\n");
      out.write("                                <ul class=\"list-inline contact-info d-block d-md-none\">\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <ul class=\"social-custom list-inline\">\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Top bar end-->\n");
      out.write("            <!-- Login Modal-->\n");
      out.write("            <div id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login-modalLabel\" aria-hidden=\"true\" class=\"modal fade\">\n");
      out.write("                <div role=\"document\" class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h4 id=\"login-modalLabel\" class=\"modal-title\">Customer Login</h4>\n");
      out.write("                            <button type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\" class=\"close\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form action=\"User\" method=\"POST\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input id=\"email_modal\" type=\"text\" placeholder=\"email\" class=\"form-control\" name=\"user\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input id=\"password_modal\" type=\"password\" placeholder=\"password\" class=\"form-control\" name=\"password\">\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"text-center\">\n");
      out.write("                                    <button class=\"btn btn-template-outlined\" type=\"submit\"><i class=\"fa fa-sign-in\"></i> Log in</button>\n");
      out.write("                                </p>\n");
      out.write("                            </form>\n");
      out.write("                            <p class=\"text-center text-muted\">Not registered yet?</p>\n");
      out.write("                            <p class=\"text-center text-muted\"><a href=\"Register\"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Login modal end-->\n");
      out.write("            <!-- Navbar Start-->\n");
      out.write("            <header class=\"nav-holder make-sticky\">\n");
      out.write("                <div id=\"navbar\" role=\"navigation\" class=\"navbar navbar-expand-lg\">\n");
      out.write("                    <div class=\"container\"><a href=\"Home\" class=\"navbar-brand home\"><img src=\"img/Logopage.png\" alt=\"Universal logo\" class=\"d-none d-md-inline-block\"><img src=\"img/logo-small.png\" alt=\"Universal logo\" class=\"d-inline-block d-md-none\"><span class=\"sr-only\">Universal - go to homepage</span></a>\n");
      out.write("                        <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" class=\"navbar-toggler btn-template-outlined\"><span class=\"sr-only\">Toggle navigation</span><i class=\"fa fa-align-justify\"></i></button>\n");
      out.write("                        <div id=\"navigation\" class=\"navbar-collapse collapse\">\n");
      out.write("                            <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                                <li class=\"nav-item dropdown active\"><a href=\"javascript: void(0)\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Home <b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"Category\" class=\"nav-link\">Shopping</a></li>\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"DisplayOrder\" class=\"nav-link\">Shopping cart</a></li>\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"MakeOrder\" class=\"nav-link\">Order</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- ========== FULL WIDTH MEGAMENU END ==================-->\n");
      out.write("                                <!-- ========== Contact dropdown ==================-->\n");
      out.write("                                <li class=\"nav-item dropdown\"><a href=\"javascript: void(0)\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">My Account<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"Register\" class=\"nav-link\">Register / login</a></li>\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"Account\" class=\"nav-link\">Customer account / change password</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- ========== Contact dropdown end ==================-->\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"search\" class=\"collapse clearfix\">\n");
      out.write("                            <form role=\"search\" class=\"navbar-form\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Search\" class=\"form-control\"><span class=\"input-group-btn\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-template-main\"><i class=\"fa fa-search\"></i></button></span>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- Navbar End-->\n");
      out.write("\n");
      out.write("            <section style=\"background: url('img/photogrid.jpg') center center repeat; background-size: cover;\" class=\"relative-positioned\">\n");
      out.write("                <!-- Carousel Start-->\n");
      out.write("                <div class=\"home-carousel\">\n");
      out.write("                    <div class=\"dark-mask mask-primary\"></div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"homepage owl-carousel\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-5 text-right\">\n");
      out.write("                                        <p><img src=\"img/Logopage.png\" alt=\"\" class=\"ml-auto\"></p>\n");
      out.write("                                        <h1>Lots of suitable choices</h1>\n");
      out.write("                                        <p>Business. Internal Market. Quality.<br>Let's see</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-7\"><img src=\"img/a2.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-7 text-center\"><img src=\"img/a1.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <h2>Specially</h2>\n");
      out.write("                                        <ul class=\"list-unstyled\">\n");
      out.write("                                            <li>Pretty</li>\n");
      out.write("                                            <li>Cheap</li>\n");
      out.write("                                            <li>Reliable</li>\n");
      out.write("                                            <li>Quality</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-5 text-right\">\n");
      out.write("                                        <h1>Transport</h1>\n");
      out.write("                                        <ul class=\"list-unstyled\">\n");
      out.write("                                            <li>Fast</li>\n");
      out.write("                                            <li>Low cost</li>\n");
      out.write("                                            <li>2 hours to get it now</li>\n");
      out.write("                                            <li>Express</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-7\"><img src=\"img/a4.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-7\"><img src=\"img/a3.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <h1>Group</h1>\n");
      out.write("                                        <ul class=\"list-unstyled\">\n");
      out.write("                                            <li>Friendly</li>\n");
      out.write("                                            <li>Many events</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Carousel End-->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"bar background-pentagon no-mb\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row showcase text-center\">\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"icon-outlined icon-sm icon-thin\"><i class=\"fa fa-align-justify\"></i></div>\n");
      out.write("                                <h4><span class=\"h1 counter\">1000</span><br>Suits</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"icon-outlined icon-sm icon-thin\"><i class=\"fa fa-users\"></i></div>\n");
      out.write("                                <h4><span class=\"h1 counter\">1000</span><br>Members</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"icon-outlined icon-sm icon-thin\"><i class=\"fa fa-copy\"></i></div>\n");
      out.write("                                <h4><span class=\"h1 counter\">1000</span><br>The Design</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"icon-outlined icon-sm icon-thin\"><i class=\"fa fa-font\"></i></div>\n");
      out.write("                                <h4><span class=\"h1 counter\">1000</span><br>Reviews</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"bar bg-gray\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul class=\"list-unstyled owl-carousel customers no-mb\">\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-1.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-2.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-3.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-4.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-5.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                        <li class=\"item\"><img src=\"img/customer-6.png\" alt=\"\" class=\"img-fluid\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- GET IT-->\n");
      out.write("\n");
      out.write("            <!-- FOOTER -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3\">\n");
      out.write("                            <h4 class=\"h6\">About Us</h4>\n");
      out.write("                            <p>A youthful store with top sales experience Lots of new products suitable for today's young people, come to us for a new experience.</p>\n");
      out.write("                            <hr>\n");
      out.write("\n");
      out.write("                            <hr class=\"d-block d-lg-none\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-3\">\n");
      out.write("                            <h4 class=\"h6\">Contact</h4>\n");
      out.write("                            <p class=\"text-uppercase\"><strong>Quangvhe140807@fpt.edu.vn</strong><br>FPT University<br>KimGiangStreet<br>Facebook:Quang<br>VietNam<br><strong>HaNoi</strong></p>\n");
      out.write("                            <hr class=\"d-block d-lg-none\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copyrights\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 text-center-md\">\n");
      out.write("                                <p>&copy; 2020. Your company / QuangShopPu</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <!-- Javascript files-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/popper.js/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"vendor/jquery.cookie/jquery.cookie.js\"></script>\n");
      out.write("        <script src=\"vendor/waypoints/lib/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"vendor/jquery.counterup/jquery.counterup.min.js\"></script>\n");
      out.write("        <script src=\"vendor/owl.carousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.parallax-1.1.3.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap-select/js/bootstrap-select.min.js\"></script>\n");
      out.write("        <script src=\"vendor/jquery.scrollto/jquery.scrollTo.min.js\"></script>\n");
      out.write("        <script src=\"js/front.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"login\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#login-modal\" class=\"login-btn\"><i class=\"fa fa-sign-in\"></i><span class=\"d-none d-md-inline-block\">Sign In</span></a><a href=\"Register\" class=\"signup-btn\"><i class=\"fa fa-user\"></i><span class=\"d-none d-md-inline-block\">Sign Up</span></a></div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div><h3>Welcome ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3></div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li class=\"dropdown-item\"><a href=\"Logout\" class=\"nav-link\">Logout</a></li>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
