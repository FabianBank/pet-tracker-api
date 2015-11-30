<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>

        <form method="post" action="register">
            <table>
                <tr>

                    <td>
                        <input type="text" class="rounded" name="username" value="$username" placeholder="username">
                    </td>
                    <td>
                        <input type="text" class="rounded" name="password" value="$password" placeholder="password">
                    </td>
                </tr>

            </table>
            <BR>
            <td><a>*: Minimaal 6 tekens</a></td>



            <div style="margin-top:15px;">
                <table>
                    <tr>
                        <td>
                            <input type="submit" value="Registreer" name="commit" style="">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a>Registreer!</a>
                        </td>
                    </tr>
                </table>
            </div>
        </form>

    </body>
</html>
