/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-02-18 10:18:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"/action_page.php\" method=\"get\">\r\n");
      out.write("\t\tThis is Testing for <br> <b>Delivery head</b> <br> <br>\r\n");
      out.write("\t\t<br> <br> <label for=\"Competency\"> Competency :</label> <select\r\n");
      out.write("\t\t\tname=\"cars\" id=\"Competency\">\r\n");
      out.write("\t\t\t<option value=\"AWS\">AWS</option>\r\n");
      out.write("\t\t\t<option value=\"Azure\">Azure</option>\r\n");
      out.write("\t\t\t<option value=\"GCP\">GCP</option>\r\n");
      out.write("\t\t\t<option value=\"Java Full Stack\">Java Full Stack</option>\r\n");
      out.write("\t\t\t<option value=\"Front end\">Front end</option>\r\n");
      out.write("\t\t\t<option value=\".NET Full Stack\">.NET Full Stack</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select> <br><br> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br> <br> <label\r\n");
      out.write("\t\t\t\t\tfor=\"Customer Type\">Customer Type :</label> <select\r\n");
      out.write("\t\t\t\t\tname=\"Customer_Type\" id=\"Customer_Type\">\r\n");
      out.write("\t\t\t<option value=\"ISV\">Customer-1</option>\r\n");
      out.write("\t\t\t<option value=\"Enterprise level\">Enterprise level</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select> <!-- <br> <br> <label for=\"Customer Industry\">Customer\r\n");
      out.write("\t\t\tIndustry :</label> <select name=\"Customer_Industry\" id=\"Customer_Industry\"\r\n");
      out.write("\t\t\t\t\tmultiple>\r\n");
      out.write("\t\t\t<option value=\"Finance\">Finance</option>\r\n");
      out.write("\t\t\t<option value=\"Banking\">Banking</option>\r\n");
      out.write("\t\t\t<option value=\"Finance and Banking\">Finance and Banking</option>\r\n");
      out.write("\t\t\t<option value=\"Insurance\">Insurance</option>\r\n");
      out.write("\t\t\t<option value=\"Oil and Gas\">Oil and Gas</option>\r\n");
      out.write("\t\t\t<option value=\"Pharma\">Pharma</option>\r\n");
      out.write("\t\t\t<option value=\"Health Care\">Health Care</option>\r\n");
      out.write("\t\t\t<option value=\"Telecom\">Telecom</option>\r\n");
      out.write("\t\t\t<option value=\"Mortgage\">Mortgage</option>\r\n");
      out.write("\t\t\t<option value=\"Supply Chain\">Supply Chain</option>\r\n");
      out.write("\t\t\t<option value=\"Lease Management\">Lease Management</option>\r\n");
      out.write("\t\t\t<option value=\"Advisory\">Advisory</option>\r\n");
      out.write("\t\t\t<option value=\"Audit\">Audit</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<label for=\"Customer Industry\">Customer Industry:</label> <input list=\"Customer Industrys\" name=\"Customer Industry\" id=\"Customer Industry\">\r\n");
      out.write("\t\t<datalist id=\"Customer Industrys\">\r\n");
      out.write("\t\t\t<option value=\"Finance\">\r\n");
      out.write("\t\t\t<option value=\"Banking\">\r\n");
      out.write("\t\t\t<option value=\"Finance and Banking\">\r\n");
      out.write("\t\t\t<option value=\"Insurance\">\r\n");
      out.write("\t\t\t<option value=\"Oil and Gas\">\r\n");
      out.write("\t\t\t<option value=\"Pharma\">\r\n");
      out.write("\t\t\t<option value=\"Health Care\">\r\n");
      out.write("\t\t\t<option value=\"Telecom\">\r\n");
      out.write("\t\t\t<option value=\"Mortgage\">\r\n");
      out.write("\t\t\t<option value=\"Supply Chain\">\r\n");
      out.write("\t\t\t<option value=\"Lease Management\">\r\n");
      out.write("\t\t\t<option value=\"Advisory\">\r\n");
      out.write("\t\t\t<option value=\"Audit\">\r\n");
      out.write("\t\t</datalist>\r\n");
      out.write("\t\t<!-- <input type=\"submit\"> -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t <br> <br>\r\n");
      out.write("\t\t <label for=\"Project Mode\">Project Mode :</label>\r\n");
      out.write("\t\t<select name=\"Project-Mode\" id=\"Project-Mode\" multiple>\r\n");
      out.write("\t\t\t<option value=\"Development\">Development</option>\r\n");
      out.write("\t\t\t<option value=\"Testing\">Testing</option>\r\n");
      out.write("\t\t\t<option value=\"Support\">Support</option>\r\n");
      out.write("\t\t\t<option value=\"DevOps\">DevOps</option>\r\n");
      out.write("\t\t\t<option value=\"Consulting\">Consulting</option>\r\n");
      out.write("\t\t\t<option value=\"Management\">Management</option>\r\n");
      out.write("\t\t\t<option value=\"DB Administration\">DB Administration</option>\r\n");
      out.write("\t\t</select> \r\n");
      out.write("\t\t<br> <br> \r\n");
      out.write("\t\t<label for=\"ImplementTier \">ImplementTier\r\n");
      out.write("\t\t\t:</label>\r\n");
      out.write("\t\t\t<input list=\"ImplementTier\" name=\"ImplementTier\" id=\"ImplementTier\">\r\n");
      out.write("\t\t\t<datalist id=\"ImplementTier\">\r\n");
      out.write("\t\t\t<option value=\"ImplementTier-1 \">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-2\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-3\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-4\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-5\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-6\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"ImplementTier-7\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</datalist>\r\n");
      out.write("\t\t\t<input type=\"submit\">\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t <label for=\"browser\">Choose your browser from the list:</label> <input\r\n");
      out.write("\t\t\t\t\tlist=\"browsers\" name=\"browser\" id=\"browser\">\r\n");
      out.write("\t\t<datalist id=\"browsers\">\r\n");
      out.write("\t\t\t<option value=\"Edge\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Firefox\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Chrome\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Opera\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Safari\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t</datalist>\r\n");
      out.write("\t\t<input type=\"submit\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<label for=\"browser\">Choose your browser from the list:</label> <input\r\n");
      out.write("\t\t\t\t\tlist=\"browsers\" name=\"browser\" id=\"browser\">\r\n");
      out.write("\t\t<datalist id=\"browsers\">\r\n");
      out.write("\t\t\t<option value=\"Edge\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Firefox\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Chrome\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Opera\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"Safari\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t</datalist>\r\n");
      out.write("\t\t<input type=\"submit\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
