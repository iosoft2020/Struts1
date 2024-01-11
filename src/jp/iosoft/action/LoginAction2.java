package jp.iosoft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import jp.iosoft.exception.PasswordErrorException;
import jp.iosoft.exception.UserNotFoundException;
import jp.iosoft.form.LoginForm;
import jp.iosoft.service.UserService;

public class LoginAction2 extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		LoginForm lf = (LoginForm) form;
		String username = lf.getUsername();
		String password = lf.getPassword();

		UserService userService = new UserService();

		ActionMessages messages = new ActionMessages();

		try {

			userService.login(username, password);

			ActionMessage message = new ActionMessage("login.success", username);
			messages.add("login.success", message);
			this.saveMessages(request, messages);

			return mapping.findForward("success");
		} catch (UserNotFoundException e) {

			ActionMessage error = new ActionMessage("login.user.not.found",username);
			messages.add("login.user.not.found", error);
		} catch (PasswordErrorException e) {
			ActionMessage error = new ActionMessage("login.password.error");
			messages.add("login.password.error", error);
		}

		this.saveErrors(request, messages);
		return mapping.getInputForward();
	}
}
