/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-05-12 09:34:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.job.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompanySelect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>호핑! 직업 탐색</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/header.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<!-- origin color : point - #ff62a5  / bodybackground - #FAFAFA-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #fff; font-family: 'Poppins', sans-serif;\">\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\t<div id=\"site__header\" style=\"font-family: 'Poppins', sans-serif;\" >\r\n");
      out.write("        <nav class=\"navbar\" style=\"text-decoration: none; list-style-type: none; color:black\">\r\n");
      out.write("            <div class=\"navbar__logo\" style=\"text-decoration: none; list-style-type: none;\">               \r\n");
      out.write("                <a href=\"#\" id = \"header__a\"><b>HOPing</b><b style=\"color: #FFBF00\">.</b></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar__menu\" id = \"navbar__menu__a\" >\r\n");
      out.write("                <li><a href=\"#\"><span>MAIN</span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span>MAIN</span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span>MAIN</span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span>MAIN</span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span>MAIN</span></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"login_out\"><a href=\"#\"><span style=\"font-size: small;\">Login/Bye</span></a></li>\t\t\t\t\r\n");
      out.write("            </ul>\t\t\t\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\t<!--search main-->\r\n");
      out.write("\t<section class=\"ftco-section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-center mb-5\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"heading-section\"><b>Exploring YOUR <span style=\"color: #FFBF00;\">Job</span> now!</b><br/>\r\n");
      out.write("\t\t\t\t\t\t<small>지금, &nbsp; <span style=\"color: #FFBF00;\">당신</span>의 꿈을 탐색하세요.</small></small></h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" class=\"booking-form\" style=\"background-color: #FAFAFA;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md d-flex py-md-4 mb-mb-0 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"#\" style=\"font-size: 18px;\">City</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon\"><span class=\"fa fa-arrow-down\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"\" id=\"\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option selected value=\"\">전체</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected>서울특별시</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">경기도</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md d-flex py-md-4 mb-mb-0 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"#\" style=\"font-size: 18px;\">State</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon\"><span class=\"fa fa-arrow-down\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"\" id=\"\" class=\"form-control\">\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">===서울===</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected>강남구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">강서구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">양재구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">===경기===</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">과천시</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">성남시</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">수원시</option>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md d-flex py-md-4 mb-mb-0 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"#\"  style=\"font-size: 18px;\">Field</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon\"><span class=\"fa fa-arrow-down\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"\" id=\"\" class=\"form-control\">\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"IT\" selected>IT</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"교육\">교육</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"영업\">영업</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"서비스\">서비스</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
session.setAttribute("",""); 
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md d-flex py-md-4 mb-mb-0 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"#\"  style=\"font-size: 18px;\">Job</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"icon\"><span class=\"fa fa-arrow-down\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"\" id=\"\" class=\"form-control\">\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"IT\">=======IT=======</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"백엔드\" selected>백엔드</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"프론트엔드\">프론트엔드</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"UX\">UX</option>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"교육\">======교육======</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"유아\">유아</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"초등\">초등</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"중고등\">중고등</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"영업\">======영업======</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"금융\">금융</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"일반영업\">일반영업</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"CS\">CS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"서비스\">=====서비스=====</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"외식\">외식</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"레저\">레저</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"가사\">가사</option>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md d-flex mb-mb-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group d-flex align-self-stretch\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary py-5 py-md-3 px-4 align-self-stretch d-block\"><span style=\"font-size: 18px;\">Hoping!<small>Search\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvailability</small></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
