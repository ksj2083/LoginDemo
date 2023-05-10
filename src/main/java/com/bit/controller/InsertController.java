package com.bit.controller;

import com.bit.service.ListService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;
import com.bit.vo.BoardAppVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class InsertController implements Controller {

	ListService listService = new ListService();

	@Override
	public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//upload,insert
	  int size=10*1024*1024;
	  
	  String uploadPath="c:\\thezone-bit\\java\\eclipse-workspace-tmp\\LoginDemo\\src\\main\\webapp\\upload\\";
		try {
			MultipartRequest multi=new MultipartRequest(
					request,//원래 요청객체 
					uploadPath,//upload경로
					size,//MaxSize
					"UTF-8",//한글문제 해결
					new DefaultFileRenamePolicy());//똑같은 파일 업로드시 자동으로 변환
			
			Enumeration e=multi.getFileNames();
			String file=(String)e.nextElement();			
			BoardAppVO vo=new BoardAppVO(multi.getParameter("title"),
					       multi.getParameter("writer"),
					       multi.getParameter("password"),
					       multi.getParameter("contents"),
					       multi.getParameter("id"),
					       multi.getOriginalFileName(file));
			System.out.println(vo);

			listService.insertBoard(vo);

			/*
			 * String title=multi.getParameter("title");
			 * System.out.println("title: "+title);
			 * String file=(String)e.nextElement(); System.out.println("file:"+file); String
			 * fileFileName=multi.getFilesystemName(file); String 서버에 실제 업로드 된 이름
			 * originFileName=multi.getOriginalFileName(file); 클라이언트가 업로드한 이름
			 * 
			 * System.out.println("fileFileName:"+fileFileName);
			 * System.out.println("originFileName:"+originFileName);
			 * System.out.println(multi.getContentType(file));파일의 타입을 알려줌
			 */

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return new PageMovement("listSelect.do?cmd=List", PageMovementType.REDIRECT);
	}
}








