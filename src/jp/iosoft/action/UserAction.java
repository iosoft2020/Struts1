package jp.iosoft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import jp.iosoft.exception.MyException;
import jp.iosoft.form.LoginForm;
import jp.iosoft.form.UserForm;
import jp.iosoft.service.UserService;

public class UserAction extends MyAction {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {


		UserForm lf = (UserForm) form;
		String username = lf.getUsername();
		String password = lf.getPassword();

		return mapping.findForward("success");

	}
}
