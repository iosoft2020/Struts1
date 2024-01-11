package jp.iosoft.action;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.iosoft.pojo.Group;
import jp.iosoft.pojo.User;

public class LogicAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		request.setAttribute("attr1", null);
		request.setAttribute("attr2", "");
		request.setAttribute("attr3", new ArrayList());

		return mapping.findForward("success");
	}
}
