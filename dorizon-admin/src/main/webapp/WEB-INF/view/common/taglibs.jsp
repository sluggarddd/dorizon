<%@page import="com.zhw.dorizon.common.support.utils.JspUtils"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
  String path = request.getContextPath();
  String basePath = JspUtils.getProjectBaseUrl(request);
  String headerUrl="/index/showHeader";
  String bottomUrl="/index/showBottom";

  //图片域名,在所有的图片地址前一定要加上这个值。
  String imageDomain=JspUtils.getProjectBaseUrl(request);

%>
<c:set var="basePath" value="<%=basePath%>" scope="request"/>

<c:set var="headerUrl" value="<%=headerUrl%>" scope="request"/>

<c:set var="bottomUrl" value="<%=bottomUrl%>" scope="request"/>

<c:set var="imageDomain" value="<%=imageDomain%>" scope="request"/>

