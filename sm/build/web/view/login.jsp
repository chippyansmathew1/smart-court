<%-- 
    Document   : login
    Created on : May 16, 2019, 10:52:35 AM
    Author     : JomyChen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
        <title>Smart Court</title>
        <link href="style/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
	 <center>
            <div class="outer">
                <div id="logo-bg">
                    <div class="name">Smart Court </div>
                    <div class="tag">The One Touch Court</div>
                </div>
                <div id="headimage"></div>
                <div style="clear:left"></div>
                <div id="rc1"></div>
                <div id="bg">
                    <div class="toplinks" style="color:#000;"><a href="index.jsp">Home page</a></div><div class="sap">|</div>
                    <div class="toplinks" ><a href="about.jsp">About us</a></div><div class="sap">|</div>
                    <div class="toplinks"><a href="register.jsp">Register</a></div><div class="sap">|</div>
                    <div class="toplinks"><a href="lawyers.jsp">Lawyers</a></div><div class="sap">|</div>
                    <div class="toplinks"><a href="contact.jsp">Contact us</a></div><div class="sap">|</div>
                    <div class="toplinks"><a href="CalenderServlet">Calender</a></div><div class="sap">|</div>
                    <div class="toplinks"><a href="search_case.jsp">Search</a></div>
                </div>
                <div id="rc2"></div>
                <div style="clear:left"></div>
                <div id="outer2"><div class="inner_copy"><div class="inner_copy"></div></div>
                    <div id="content">
                        <span class="heading">Welcome to our website </span>
                        <div id="main">
                            <p><img src="images/lawbook.jpg" alt="Law book" width="250" height="134"/>The Federal Court is committed to ensuring that the Court system is relevant and responsive to the needs of the our community in the 21st century. Its Court strategy builds on the Court's established reputation for pioneering the application of technology in Courts.

As part of this strategy the Court currently provides the following services online, with more to follow in the future:<br/>

The Lodgment enables any member of the public, whether they be practitioners, law firms, corporate bodies or self represented litigants electronically lodge documents with the  Court . Lodgment may be used to commence an action in either jurisdiction by enabling the lodgment of initiating documents and any supporting documents. Similarly, documents pertaining to existing matters may be lodged via Lodgment as long as the file number is known.
Federal Law Search allows the public to search for information on specific cases.<br/>

Smart Court room allows parties and their legal representatives to participate in a virtual courtroom. The virtual courtroom assists in the management of pre-trial matters by allowing directions and other orders to be made online by the relevant docket Judge.

Case Administration
The Court's case Administration is a service that may be used by practitioners or parties to communicate with chambers' staff, on case related issues, in a secure environment. Only parties to the matter or their legal representatives will have access to this service and access is restricted to those matters where they are a participant in the proceedings. It is in essence an effective case management tool for both chambers and the participants in the matter.


 </p>
                        </div>
                    </div>
                    <div id="left-nav">
                        <span class="heading"></span>
                        <div class="leftlinks">

                        </div>
                        <div id="login_form">
                            <span class="heading"> Login</span>

                            <div class="news-txt">
                                <form id="user_login" name="user_login" action="LoginServlet" method="post">
                                    <table>
                                        <tr>
                                            <td width="30">Username</td>
                                            <td>:</td>
                                            <td><input name="username" type="text" style="width: 120px;" /></td>
                                        </tr>
                                        <tr>
                                            <td>Password</td>
                                            <td>:</td>
                                            <td><input name="password" type="password" style="width: 120px;" /></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td><input name="submit" type="submit" value="submit"/>
                                           

                                            </td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                            <div><div style="float:right"></div></div>
                        </div>
                    </div>
                    <div style="clear:left"></div>
                </div>
                <div id="bottom">
                    <div class="footerlinks" style="color:#000;"><a href="index.jsp">Home page</a></div><div class="sap">|</div>
                    <div class="footerlinks" ><a href="about.jsp">About us</a></div><div class="sap">|</div>
                    <div class="footerlinks"><a href="register.jsp">Register</a></div><div class="sap">|</div>
                    <div class="footerlinks"><a href="lawyers.jsp">Lawyers</a></div><div class="sap">|</div>
                    <div class="footerlinks"><a href="contact.jsp">Contact us</a></div>
                </div>
                <div id="footer"><div class="fleft"></div><div class="fright"></div><div class="fcenter"> </div></div>
            </div>
        </center>
    </body>
   
</html>