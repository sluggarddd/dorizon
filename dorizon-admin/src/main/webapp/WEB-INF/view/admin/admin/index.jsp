<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1 class="page-header">管理员列表</h1>

    <div class="btn-group" role="group" aria-label="...">
        <button type="button" class="btn btn-default">新增</button>
    </div>


    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>账号</th>
                <th>昵称</th>
                <th>手机</th>
                <th>邮箱</th>
                <th>注册时间</th>
                <th>最后登录时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td><input class="check-box"/></td>
                    <td>${item.username}</td>
                    <td>${item.nickname}</td>
                    <td>${item.mobile}</td>
                    <td>${item.email}</td>
                    <td>${item.registerTime}</td>
                    <td>${item.lastLoginTime}</td>
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
