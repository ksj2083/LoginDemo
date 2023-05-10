<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>관리자</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=10"/>
    <meta http-equiv="imagetoolbar" content="no"/>
    <link href="${pageContext.request.contextPath}/css/contents.css" rel="stylesheet" type="text/css"/>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

</head>
<body>
<div id="wrapper">
    <div id="header">
        <div class="topInfoWrap">
            <div class="topInfoArea clfix">
                <div class="loginWrap">
                    <span class="fir">2022.05.17</span>
                    <span>13:30:22</span>
                    <span><em></em> 좋은1하루 되세요</span>
                    <a href="" class="btnLogout"><img src="${pageContext.request.contextPath}/img/common/btn_logout.gif"
                                                      alt="로그아웃"/></a>
                </div>
            </div>
        </div>
        <div class="gnbSubWrap">

        </div>
    </div>
    <div id="container">
        <div id="contentsWrap" class="contentsWrap">
            <div class="contents">
                <h1 class="title">게시판 리스트</h1>
                <div class="btnSet clfix mgb15">
						<span class="fr">

							<span id="search" class="button">
								<a>검색</a>
							</span>



							<span class="button"><a
                                    href="${pageContext.request.contextPath}/upload/edit.jsp">글쓰기</a></span>
						</span>
                </div>

                <table class="bbsWrite mgb35">
                    <caption></caption>
                    <colgroup>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                    </colgroup>
                    <tbody>
                    <tr>
                        <th>검색</th>
                        <td>
                            <select style="width: 100%">
                                <option>선택하세요</option>
                            </select>

                        </td>
                        <td>
                            <input type="text" name="keyword" id="inputText" size="30"/>
                        </td>
                    </tr>
                    </tbody>
                </table>

                <table class="bbsList">
                    <colgroup>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                        <col width="150"/>
                    </colgroup>
                    <thead>
                    <tr>
                        <th scope="col" class="fir">NO</th>
                        <th scope="col">image</th>
                        <th scope="col">title</th>
                        <th scope="col">writer</th>
                        <th scope="col">hit</th>
                        <th scope="col">regdate</th>
                        <th scope="col">id</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach var="i" items="${list}">
                        <tr>
                            <th>${i.no}</th>
                            <td><img src="${pageContext.request.contextPath}/upload/${i.fileName}" width="50"
                                     height="50"/></td>
                            <th>${i.title}</th>
                            <th>${i.writer}</th>
                            <th>${i.hit}</th>
                            <th>${i.regdate}</th>
                            <th>${i.id}</th>

                        </tr>
                    </c:forEach>

                    </tbody>
                </table>

                <div class="paging">
                    <a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_first.gif" alt="처음페이지"/></a>
                    <a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_prev.gif" alt="이전"/></a>

                    <span>
							<a href="#">1</a>
							<a href="#">2</a>
							<a href="#">3</a>
							<strong>4</strong>
							<a href="#">5</a>
							<a href="#">6</a>
							<a href="#">7</a>
							<a href="#">8</a>
							<a href="#">9</a>
						</span>

                    <a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_next.gif" alt="다음"/></a>
                    <a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_last.gif" alt="마지막페이지"/></a>

                </div>
            </div>
        </div>
    </div>
</div>
<script>

	$("#search").click(function () {
		location.href = "${pageContext.request.contextPath}/Search.do?cmd=search&keyword="+$("input#inputText").val();
	});
</script>
</body>
</html>