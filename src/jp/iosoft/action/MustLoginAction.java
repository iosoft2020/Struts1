package jp.iosoft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MustLoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		if (request.getSession().getAttribute("username") == null) {
			// return mapping.findForward("login");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return null;
		}

		// hand
		// response.sendRedirect(request.getContextPath() + "/login.jsp");
//		return null;
		return mapping.findForward("success");
	}
}
