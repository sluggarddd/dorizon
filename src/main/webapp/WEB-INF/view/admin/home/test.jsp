<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="false" %>
<!DOCTYPE html>
<html lang="en">

<%-- head --%>
<jsp:include page="../common/head.jsp"/>

<body>


<%-- top--%>
<jsp:include page="../common/top.jsp"/>
<%-- left --%>
<jsp:include page="../common/left.jsp"/>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Dashboard</h1>

    <h1>${hello}</h1>

</div>

<%-- foot --%>

<jsp:include page="../common/foot.jsp"/>


</body>
</html>
