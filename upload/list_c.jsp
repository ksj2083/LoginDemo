
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=10" />
<meta http-equiv="imagetoolbar" content="no" />
<link href="${pageContext.request.contextPath}/css/contents.css" rel="stylesheet" type="text/css" />

</head>
<body >

	<div id="wrapper">
		<div id="header">
				<div class="topInfoWrap">
					<div class="topInfoArea clfix">
						<div class="loginWrap">
							<span class="fir">2022.05.17</span>
							<span>13:30:22</span>
							<span><em></em> 좋은 하루 되세요</span>
							<a href="" class="btnLogout"><img src="${pageContext.request.contextPath}/img/common/btn_logout.gif" alt="로그아웃" /></a>
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
							<span class="button"><a href="#">검색</a></span>
							<span class="button"><a href="${pageContext.request.contextPath}/upload/edit.jsp">글쓰기</a></span>
						</span>
					</div>

					<table class="bbsWrite mgb35">
						<caption></caption>
						<colgroup>
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
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
								<input type="text" name="" class="inputText" size="30" />
							</td>
						</tr>
						</tbody>
					</table>

					<table class="bbsList">
						<colgroup>							
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
							<col width="150" />
						</colgroup>
						<thead>						
						<tr>
							<th scope="col" class="fir">EMPNO</th>
							<th scope="col">ENAME</th>
							<th scope="col">SAL</th>
							<th scope="col">MGR</th>
							<th scope="col">COMM</th>
							<th scope="col">HIREDATE</th>
							<th scope="col">DEPTNO</th>
						</tr>
						</thead>

						<tbody>
					
						<tr>
						
							
						</tr>
						

						</tbody>
					</table>

					<div class="paging">
						<a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_first.gif" alt="처음페이지" /></a>
						<a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_prev.gif" alt="이전" /></a>
						
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

						<a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_next.gif" alt="다음" /></a>
						<a href="#"><img src="${pageContext.request.contextPath}/img/button/btn_last.gif" alt="마지막페이지" /></a>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>