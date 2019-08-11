
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="views/front-page.jsp"/>
<jsp:include page="views/chinh-sach.jsp"/>
<jsp:include page="QuangCaoServlet"/>
<%--<jsp:include page="views/quang-cao.jsp"/> ko dùng như này nữa do trang quang cao này là 1 thành phần để lấy được thông tin từ servlet bắt buộc phải trỏ về servlet đê nhận giá trị request --%>
<%-- khi tro tới servlet se bao loi ta vao windown ->pref -> web -> jsp file ->validation -> thay doi 2  bien erorr trong include fragmen thanh warnning --%>
<%-- bo views truoc trang chu nhe --%>
<jsp:include page="views/san-pham-moi.jsp"/>
<jsp:include page="ThuongHieuServlet"/>
<jsp:include page="views/ban-chay-yeu-thich.jsp"/>
<jsp:include page="views/back-page.jsp"/>
