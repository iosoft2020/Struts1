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
import jp.iosoft.service.UserService;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		LoginForm lf = (LoginForm) form;
		String username = lf.getUsername();
		String password = lf.getPassword();

//		try {
//
			int i=1/0;
//		} catch(Exception e) {
//			throw new MyException("异常");
//		}
		UserService userService = new UserService();

		ActionMessages messages = new ActionMessages();

		userService.login(username, password);

		ActionMessage message = new ActionMessage("login.success", username);
		messages.add("login.success", message);
		this.saveMessages(request, messages);

		return mapping.findForward("success");

	}
}
