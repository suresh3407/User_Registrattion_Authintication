<%-- 
    Document   : user-registration-form
    Created on : May 23, 2017, 5:20:53 PM
    Author     : suresh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="ROOT_URL" value="${pageContext.request.contextPath}"></c:set>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
        crossorigin="anonymous"></script>
 </head>
    <body class="container-fluid" style="margin-top:10px">

        <button id="btnreg" class="btn btn-primary"> Register</button>

        <div class="" id="modelWindow" style="display:none" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Registration Form</h4>
                    </div>
                    <div class="modal-body">
                     
                        <form method="post" action="${ROOT_URL}/register">
                             <div class="form-group">
                                <label for="userName">User Name:</label>
                                <input type="text" class="form-control" id="userName" placeholder="User Name" name="user-name">
                            </div>
                             <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" class="form-control" id="password" placeholder="Password" name="password">
                            </div>
                             <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" id="email" placeholder="Email" name="email">
                            </div>

                            <div class="modal-footer">
                                <button type="submit" class="btn btn-primary">Register</button>
                                <button type="reset" class="btn btn-primary">Reset</button>
                            </div>
                        </form>


                    </div>

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

    </body>    
    <script>
        $("#btnreg").click(function () {

            $("#modelWindow").toggle();
        });
    </script>
</html>

