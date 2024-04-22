package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InquiryServlet
 */
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータを取得する
	    var username=request.getParameter("username");
	    var usermail=request.getParameter("usermail");
	    var content=request.getParameter("content");
	    
	    //入力項目チェック（バリデーション）
	    List<String> errors=new ArrayList<>(); 
	    
	    if (username==null || username.equals("")) {
	        errors.add("氏名を入力してください");
	    }
	    if (usermail==null || usermail.equals("")) {
	        errors.add("メールアドレスを入力してください");
	    }
	    if (content==null || content.equals("")) {
	        errors.add("お問い合わせ内容を入力してください");
	    }
	    
	    //入力内容にエラーがあったかどうか
	    if (errors.size()>0) {
	        //JSPにエラー内容を送る
	        request.setAttribute("errors", errors);
	    } else {
	        //JSPに入力データを送る
	        request.setAttribute("username",username);
	        request.setAttribute("usermail",usermail);
	        request.setAttribute("content",content);
	    }
	    
	    //JSPに値を送る
	    request.setAttribute("username", username);
	    request.setAttribute("usermail",usermail);
	    request.setAttribute("content",content);
	    
	    //ビューとなるJSPを指定して表示する
	    var rd=request.getRequestDispatcher("/WEB-INF/inquiry_result.jsp");
	    rd.forward(request, response);
	    
	}

}