package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"/>\n");
      out.write("        <title>Smart Court</title>\n");
      out.write("        <link href=\"style/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t <center>\n");
      out.write("            <div class=\"outer\">\n");
      out.write("                <div id=\"logo-bg\">\n");
      out.write("                    <div class=\"name\">Smart Court </div>\n");
      out.write("                    <div class=\"tag\">The One Touch Court</div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"headimage\"></div>\n");
      out.write("                <div style=\"clear:left\"></div>\n");
      out.write("                <div id=\"rc1\"></div>\n");
      out.write("                <div id=\"bg\">\n");
      out.write("                    <div class=\"toplinks\" style=\"color:#000;\"><a href=\"index.jsp\">Home page</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\" ><a href=\"about.jsp\">About us</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\"><a href=\"register.jsp\">Register</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\"><a href=\"lawyers.jsp\">Lawyers</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\"><a href=\"contact.jsp\">Contact us</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\"><a href=\"CalenderServlet\">Calender</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"toplinks\"><a href=\"search_case.jsp\">Search</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"rc2\"></div>\n");
      out.write("                <div style=\"clear:left\"></div>\n");
      out.write("                <div id=\"outer2\"><div class=\"inner_copy\"><div class=\"inner_copy\"></div></div>\n");
      out.write("                    <div id=\"content\">\n");
      out.write("                        <span class=\"heading\">Welcome to our website </span>\n");
      out.write("                        <div id=\"main\">\n");
      out.write("                            <p><img src=\"images/lawbook.jpg\" alt=\"Law book\" width=\"250\" height=\"134\"/>The Federal Court is committed to ensuring that the Court system is relevant and responsive to the needs of the our community in the 21st century. Its Court strategy builds on the Court's established reputation for pioneering the application of technology in Courts.\n");
      out.write("\n");
      out.write("As part of this strategy the Court currently provides the following services online, with more to follow in the future:<br/>\n");
      out.write("\n");
      out.write("The Lodgment enables any member of the public, whether they be practitioners, law firms, corporate bodies or self represented litigants electronically lodge documents with the  Court . Lodgment may be used to commence an action in either jurisdiction by enabling the lodgment of initiating documents and any supporting documents. Similarly, documents pertaining to existing matters may be lodged via Lodgment as long as the file number is known.\n");
      out.write("Federal Law Search allows the public to search for information on specific cases.<br/>\n");
      out.write("\n");
      out.write("Smart Court room allows parties and their legal representatives to participate in a virtual courtroom. The virtual courtroom assists in the management of pre-trial matters by allowing directions and other orders to be made online by the relevant docket Judge.\n");
      out.write("\n");
      out.write("Case Administration\n");
      out.write("The Court's case Administration is a service that may be used by practitioners or parties to communicate with chambers' staff, on case related issues, in a secure environment. Only parties to the matter or their legal representatives will have access to this service and access is restricted to those matters where they are a participant in the proceedings. It is in essence an effective case management tool for both chambers and the participants in the matter.\n");
      out.write("\n");
      out.write("\n");
      out.write(" </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"left-nav\">\n");
      out.write("                        <span class=\"heading\"></span>\n");
      out.write("                        <div class=\"leftlinks\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"login_form\">\n");
      out.write("                            <span class=\"heading\"> Login</span>\n");
      out.write("\n");
      out.write("                            <div class=\"news-txt\">\n");
      out.write("                                <form id=\"user_login\" name=\"user_login\" action=\"LoginServlet\" method=\"post\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"30\">Username</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td><input name=\"username\" type=\"text\" style=\"width: 120px;\" /></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Password</td>\n");
      out.write("                                            <td>:</td>\n");
      out.write("                                            <td><input name=\"password\" type=\"password\" style=\"width: 120px;\" /></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td><input name=\"submit\" type=\"submit\" value=\"submit\"/>\n");
      out.write("                                           \n");
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div><div style=\"float:right\"></div></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"clear:left\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"bottom\">\n");
      out.write("                    <div class=\"footerlinks\" style=\"color:#000;\"><a href=\"index.jsp\">Home page</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"footerlinks\" ><a href=\"about.jsp\">About us</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"footerlinks\"><a href=\"register.jsp\">Register</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"footerlinks\"><a href=\"lawyers.jsp\">Lawyers</a></div><div class=\"sap\">|</div>\n");
      out.write("                    <div class=\"footerlinks\"><a href=\"contact.jsp\">Contact us</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"footer\"><div class=\"fleft\"></div><div class=\"fright\"></div><div class=\"fcenter\"> </div></div>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>");
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
