/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-05 14:20:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Project; Alliance</title>\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\t  rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t          <div class=\"navbar-header\">\n");
      out.write("\t            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t            </button>\n");
      out.write("\t            <a class=\"navbar-brand\" href=\"#\">Project; Alliance</a>\n");
      out.write("\t          </div>\n");
      out.write("\t          <div class=\"navbar-collapse collapse\">\n");
      out.write("\t            <ul class=\"nav navbar-nav\">\n");
      out.write("\t              <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t              <li><a href=\"#about\">About</a></li>\n");
      out.write("\t              <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("\t              <li class=\"dropdown\">\n");
      out.write("\t                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("\t                <ul class=\"dropdown-menu\">\n");
      out.write("\t                  <li><a href=\"#\">Action</a></li>\n");
      out.write("\t                  <li><a href=\"#\">Another action</a></li>\n");
      out.write("\t                  <li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t                  <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t                  <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("\t                  <li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t                  <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t              </li>\n");
      out.write("\t              </ul>\n");
      out.write("\t              <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("\t              <li><a  href=\"#\">Welcome! ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("\t            </ul>\n");
      out.write("\t            \n");
      out.write("\t          </div><!--/.nav-collapse -->\n");
      out.write("\t        </div>\n");
      out.write("\t</nav>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
