package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _403_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Universal - All In 1 Template</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"robots\" content=\"all,follow\">\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Google fonts - Roboto-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,700\">\n");
      out.write("    <!-- Bootstrap Select-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap-select/css/bootstrap-select.min.css\">\n");
      out.write("    <!-- owl carousel-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.theme.default.css\">\n");
      out.write("    <!-- theme stylesheet-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.default.css\" id=\"theme-stylesheet\">\n");
      out.write("    <!-- Custom stylesheet - for your changes-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("    <!-- Favicon and apple touch icons-->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"img/apple-touch-icon.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"img/apple-touch-icon-57x57.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"img/apple-touch-icon-72x72.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"img/apple-touch-icon-76x76.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"img/apple-touch-icon-114x114.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"img/apple-touch-icon-120x120.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"img/apple-touch-icon-144x144.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"img/apple-touch-icon-152x152.png\">\n");
      out.write("    <!-- Tweaks for older IEs--><!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"all\">\n");
      out.write("      <!-- Top bar-->\n");
      out.write("      <div class=\"top-bar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row d-flex align-items-center\">\n");
      out.write("            <div class=\"col-md-6 d-md-block d-none\">\n");
      out.write("              <p>Contact us on +420 777 555 333 or hello@universal.com.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              <div class=\"d-flex justify-content-md-end justify-content-between\">\n");
      out.write("                <ul class=\"list-inline contact-info d-block d-md-none\">\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"login\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#login-modal\" class=\"login-btn\"><i class=\"fa fa-sign-in\"></i><span class=\"d-none d-md-inline-block\">Sign In</span></a><a href=\"customer-register.html\" class=\"signup-btn\"><i class=\"fa fa-user\"></i><span class=\"d-none d-md-inline-block\">Sign Up</span></a></div>\n");
      out.write("                <ul class=\"social-custom list-inline\">\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                  <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Top bar end-->\n");
      out.write("      <!-- Login Modal-->\n");
      out.write("      <div id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login-modalLabel\" aria-hidden=\"true\" class=\"modal fade\">\n");
      out.write("        <div role=\"document\" class=\"modal-dialog\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <h4 id=\"login-modalLabel\" class=\"modal-title\">Customer Login</h4>\n");
      out.write("              <button type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\" class=\"close\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("              <form action=\"customer-orders.html\" method=\"get\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input id=\"email_modal\" type=\"text\" placeholder=\"email\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input id=\"password_modal\" type=\"password\" placeholder=\"password\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <p class=\"text-center\">\n");
      out.write("                  <button class=\"btn btn-template-outlined\"><i class=\"fa fa-sign-in\"></i> Log in</button>\n");
      out.write("                </p>\n");
      out.write("              </form>\n");
      out.write("              <p class=\"text-center text-muted\">Not registered yet?</p>\n");
      out.write("              <p class=\"text-center text-muted\"><a href=\"customer-register.html\"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Login modal end-->\n");
      out.write("      <!-- Navbar Start-->\n");
      out.write("      <header class=\"nav-holder make-sticky\">\n");
      out.write("        <div id=\"navbar\" role=\"navigation\" class=\"navbar navbar-expand-lg\">\n");
      out.write("          <div class=\"container\"><a href=\"index.html\" class=\"navbar-brand home\"><img src=\"img/logo.png\" alt=\"Universal logo\" class=\"d-none d-md-inline-block\"><img src=\"img/logo-small.png\" alt=\"Universal logo\" class=\"d-inline-block d-md-none\"><span class=\"sr-only\">Universal - go to homepage</span></a>\n");
      out.write("            <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" class=\"navbar-toggler btn-template-outlined\"><span class=\"sr-only\">Toggle navigation</span><i class=\"fa fa-align-justify\"></i></button>\n");
      out.write("            <div id=\"navigation\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item dropdown active\"><a href=\"javascript: void(0)\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Home <b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"index.html\" class=\"nav-link\">Option 1: Default Page</a></li>\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"index2.html\" class=\"nav-link\">Option 2: Application</a></li>\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"index3.html\" class=\"nav-link\">Option 3: Startup</a></li>\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"index4.html\" class=\"nav-link\">Option 4: Agency</a></li>\n");
      out.write("                    <li class=\"dropdown-item dropdown-submenu\"><a id=\"navbarDropdownMenuLink2\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" class=\"nav-link dropdown-toggle\">Dropdown link</a>\n");
      out.write("                      <ul aria-labelledby=\"navbarDropdownMenuLink2\" class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"dropdown-item\"><a href=\"#\" class=\"nav-link\">Action</a></li>\n");
      out.write("                        <li class=\"dropdown-item\"><a href=\"#\" class=\"nav-link\">Another action</a></li>\n");
      out.write("                        <li class=\"dropdown-item\"><a href=\"#\" class=\"nav-link\">Something else here</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown menu-large\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Features<b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu megamenu\">\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\"><img src=\"img/template-easy-customize.png\" alt=\"\" class=\"img-fluid d-none d-lg-block\"></div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                          <h5>Shortcodes</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-accordions.html\" class=\"nav-link\">Accordions</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-alerts.html\" class=\"nav-link\">Alerts</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-buttons.html\" class=\"nav-link\">Buttons</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-content-boxes.html\" class=\"nav-link\">Content boxes</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-blocks.html\" class=\"nav-link\">Horizontal blocks</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-pagination.html\" class=\"nav-link\">Pagination</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-tabs.html\" class=\"nav-link\">Tabs</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-typography.html\" class=\"nav-link\">Typography</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                          <h5>Header variations</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-header-default.html\" class=\"nav-link\">Default sticky header</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-header-nosticky.html\" class=\"nav-link\">No sticky header</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"template-header-light.html\" class=\"nav-link\">Light header</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown menu-large\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Portfolio <b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu megamenu\">\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\"><img src=\"img/template-homepage.png\" alt=\"\" class=\"img-fluid d-none d-lg-block\"></div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                          <h5>Portfolio</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-2.html\" class=\"nav-link\">2 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-2.html\" class=\"nav-link\">2 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-3.html\" class=\"nav-link\">3 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-3.html\" class=\"nav-link\">3 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-4.html\" class=\"nav-link\">4 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-4.html\" class=\"nav-link\">4 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-detail.html\" class=\"nav-link\">Portfolio - detail</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-detail-2.html\" class=\"nav-link\">Portfolio - detail 2</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                          <h5>About</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About us</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"team.html\" class=\"nav-link\">Our team</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"team-member.html\" class=\"nav-link\">Team member</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"services.html\" class=\"nav-link\">Services</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>Marketing</h5>\n");
      out.write("                          <ul class=\"list-unstyled\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"packages.html\" class=\"nav-link\">Packages</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- ========== FULL WIDTH MEGAMENU ==================-->\n");
      out.write("                <li class=\"nav-item dropdown menu-large\"><a href=\"#\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-delay=\"200\" class=\"dropdown-toggle\">All Pages <b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu megamenu\">\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                          <h5>Home</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link\">Option 1: Default Page</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index2.html\" class=\"nav-link\">Option 2: Application</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index3.html\" class=\"nav-link\">Option 3: Startup</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index4.html\" class=\"nav-link\">Option 4: Agency</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index5.html\" class=\"nav-link\">Option 5: Portfolio</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>About</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About us</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"team.html\" class=\"nav-link\">Our team</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"team-member.html\" class=\"nav-link\">Team member</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"services.html\" class=\"nav-link\">Services</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>Marketing</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"packages.html\" class=\"nav-link\">Packages</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                          <h5>Portfolio</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-2.html\" class=\"nav-link\">2 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-2.html\" class=\"nav-link\">2 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-3.html\" class=\"nav-link\">3 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-3.html\" class=\"nav-link\">3 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-4.html\" class=\"nav-link\">4 columns</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-no-space-4.html\" class=\"nav-link\">4 columns with negative space</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-detail.html\" class=\"nav-link\">Portfolio - detail</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"portfolio-detail-2.html\" class=\"nav-link\">Portfolio - detail 2</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>User pages</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"customer-register.html\" class=\"nav-link\">Register / login</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"customer-orders.html\" class=\"nav-link\">Orders history</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"customer-order.html\" class=\"nav-link\">Order history detail</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"customer-wishlist.html\" class=\"nav-link\">Wishlist</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"customer-account.html\" class=\"nav-link\">Customer account / change password</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                          <h5>Shop</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-category.html\" class=\"nav-link\">Category - sidebar right</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-category-left.html\" class=\"nav-link\">Category - sidebar left</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-category-full.html\" class=\"nav-link\">Category - full width</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-detail.html\" class=\"nav-link\">Product detail</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>Shop - order process</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-basket.html\" class=\"nav-link\">Shopping cart</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-checkout1.html\" class=\"nav-link\">Checkout - step 1</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-checkout2.html\" class=\"nav-link\">Checkout - step 2</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-checkout3.html\" class=\"nav-link\">Checkout - step 3</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"shop-checkout4.html\" class=\"nav-link\">Checkout - step 4</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                          <h5>Contact</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"contact2.html\" class=\"nav-link\">Contact - version 2</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"contact3.html\" class=\"nav-link\">Contact - version 3</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>Pages</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"text.html\" class=\"nav-link\">Text page</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"text-left.html\" class=\"nav-link\">Text page - left sidebar</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"text-full.html\" class=\"nav-link\">Text page - full width</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"faq.html\" class=\"nav-link\">FAQ</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"404.html\" class=\"nav-link\">404 page</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <h5>Blog</h5>\n");
      out.write("                          <ul class=\"list-unstyled mb-3\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog listing big</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"blog-medium.html\" class=\"nav-link\">Blog listing medium</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"blog-small.html\" class=\"nav-link\">Blog listing small</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"blog-post.html\" class=\"nav-link\">Blog Post</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- ========== FULL WIDTH MEGAMENU END ==================-->\n");
      out.write("                <!-- ========== Contact dropdown ==================-->\n");
      out.write("                <li class=\"nav-item dropdown\"><a href=\"javascript: void(0)\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Contact <b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"contact.html\" class=\"nav-link\">Contact option 1</a></li>\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"contact2.html\" class=\"nav-link\">Contact option 2</a></li>\n");
      out.write("                    <li class=\"dropdown-item\"><a href=\"contact3.html\" class=\"nav-link\">Contact option 3</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- ========== Contact dropdown end ==================-->\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"search\" class=\"collapse clearfix\">\n");
      out.write("              <form role=\"search\" class=\"navbar-form\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <input type=\"text\" placeholder=\"Search\" class=\"form-control\"><span class=\"input-group-btn\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-template-main\"><i class=\"fa fa-search\"></i></button></span>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </header>\n");
      out.write("      <!-- Navbar End-->\n");
      out.write("      \n");
      out.write("      <div id=\"content\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div id=\"error-page\" class=\"col-md-8 mx-auto text-center\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("              <p class=\"text-center\"><a href=\"index.html\"><img src=\"img/logo.png\" alt=\"Obaju template\"></a></p>\n");
      out.write("              <h3>We are sorry - this page is not here anymore</h3>\n");
      out.write("              <h4 class=\"text-muted\">Error 404 - Page not found</h4>\n");
      out.write("              <p class=\"buttons\"><a href=\"index.html\" class=\"btn btn-template-outlined\"><i class=\"fa fa-home\"></i> Go to Homepage</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- GET IT-->\n");
      out.write("      <div class=\"get-it\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 text-center p-3\">\n");
      out.write("              <h3>Do you want cool website like this one?</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center p-3\">   <a href=\"#\" class=\"btn btn-template-outlined-white\">Buy this template now</a></div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- FOOTER -->\n");
      out.write("      <footer class=\"main-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("              <h4 class=\"h6\">About Us</h4>\n");
      out.write("              <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("              <hr>\n");
      out.write("              <h4 class=\"h6\">Join Our Monthly Newsletter</h4>\n");
      out.write("              <form>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\">\n");
      out.write("                  <div class=\"input-group-append\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\"><i class=\"fa fa-send\"></i></button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("              <hr class=\"d-block d-lg-none\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("              <h4 class=\"h6\">Blog</h4>\n");
      out.write("              <ul class=\"list-unstyled footer-blog-list\">\n");
      out.write("                <li class=\"d-flex align-items-center\">\n");
      out.write("                  <div class=\"image\"><img src=\"img/detailsquare.jpg\" alt=\"...\" class=\"img-fluid\"></div>\n");
      out.write("                  <div class=\"text\">\n");
      out.write("                    <h5 class=\"mb-0\"> <a href=\"post.html\">Blog post name</a></h5>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"d-flex align-items-center\">\n");
      out.write("                  <div class=\"image\"><img src=\"img/detailsquare.jpg\" alt=\"...\" class=\"img-fluid\"></div>\n");
      out.write("                  <div class=\"text\">\n");
      out.write("                    <h5 class=\"mb-0\"> <a href=\"post.html\">Blog post name</a></h5>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"d-flex align-items-center\">\n");
      out.write("                  <div class=\"image\"><img src=\"img/detailsquare.jpg\" alt=\"...\" class=\"img-fluid\"></div>\n");
      out.write("                  <div class=\"text\">\n");
      out.write("                    <h5 class=\"mb-0\"> <a href=\"post.html\">Very very long blog post name</a></h5>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <hr class=\"d-block d-lg-none\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("              <h4 class=\"h6\">Contact</h4>\n");
      out.write("              <p class=\"text-uppercase\"><strong>Universal Ltd.</strong><br>13/25 New Avenue <br>Newtown upon River <br>45Y 73J <br>England <br><strong>Great Britain</strong></p><a href=\"contact.html\" class=\"btn btn-template-main\">Go to contact page</a>\n");
      out.write("              <hr class=\"d-block d-lg-none\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("              <ul class=\"list-inline photo-stream\">\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare2.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare3.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare3.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare2.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\"><img src=\"img/detailsquare.jpg\" alt=\"...\" class=\"img-fluid\"></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copyrights\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-4 text-center-md\">\n");
      out.write("                <p>&copy; 2020. Your company / name goes here</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-8 text-right text-center-md\">\n");
      out.write("                <p>Template design by <a href=\"https://bootstrapious.com/snippets\">Bootstrapious </a>&  <a href=\"https://fity.cz/\">Fity</a></p>\n");
      out.write("                <!-- Please do not remove the backlink to us unless you purchase the Attribution-free License at https://bootstrapious.com/donate. Thank you. -->\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("    <!-- Javascript files-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/popper.js/umd/popper.min.js\"> </script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery.cookie/jquery.cookie.js\"> </script>\n");
      out.write("    <script src=\"vendor/waypoints/lib/jquery.waypoints.min.js\"> </script>\n");
      out.write("    <script src=\"vendor/jquery.counterup/jquery.counterup.min.js\"> </script>\n");
      out.write("    <script src=\"vendor/owl.carousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.parallax-1.1.3.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-select/js/bootstrap-select.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery.scrollto/jquery.scrollTo.min.js\"></script>\n");
      out.write("    <script src=\"js/front.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
