package jp.iosoft.handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;
import org.apache.struts.util.ModuleException;

import jp.iosoft.exception.MyException2;

public class MyExceptionHandler extends ExceptionHandler {

	public ActionForward execute(Exception ex, ExceptionConfig ae, ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response) throws ServletException {

		if (!(ex instanceof MyException2)) {
			return super.execute(ex, ae, mapping, formInstance, request, response);
		}

		ActionForward forward = null;
		ActionMessage error = null;
		String property = null;

		if (ae.getPath() != null) {
			forward = new ActionForward(ae.getPath());
		} else {
			forward = mapping.getInputForward();
		}

		if (ex instanceof ModuleException) {
			error = ((ModuleException) ex).getActionMessage();
			property = ((ModuleException) ex).getProperty();
		} else {
			MyException2 ece = (MyException2) ex;
			error = new ActionMessage(ece.getMessageKey(), ece.getArgs());
			property = error.getKey();
		}

		this.logException(ex);

		request.setAttribute(Globals.EXCEPTION_KEY, ex);
		this.storeException(request, property, error, forward, ae.getScope());

		return forward;
	}
}
