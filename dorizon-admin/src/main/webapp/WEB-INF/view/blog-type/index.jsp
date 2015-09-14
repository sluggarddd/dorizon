<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="false" %>
<!DOCTYPE html>
<html lang="en">

<%-- head --%>
<%@ include file="../common/head.jsp" %>


<body>


<%-- top--%>
<jsp:include page="../common/top.jsp"/>
<%-- left --%>
<jsp:include page="../common/left.jsp"/>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">博客分类列表</h1>


    <div class="btn-group" role="group" aria-label="...">
        <button type="button" class="btn btn-default">新增</button>
    </div>


    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>ID</th>
                <th>分类名</th>
                <th>创建者</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td><input class="check-box"/></td>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.createUser}</td>
                    <td>${item.createTime}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


</div>

<%-- foot --%>

<jsp:include page="../common/foot.jsp"/>


</body>
</html>
