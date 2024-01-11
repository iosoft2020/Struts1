package jp.iosoft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ForwardAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

//		System.err.println("request getRequestDispatcher forward");
//		request.getRequestDispatcher("login.jsp").forward(request, response);
//		System.err.println("response redirect");
//		response.sendRedirect("/login.jsp");
//		return null;

		System.err.println("ActionForward findForward");
		return mapping.findForward("success");

	}
}
