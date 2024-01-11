package jp.iosoft.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.iosoft.pojo.Group;
import jp.iosoft.pojo.User;

public class BeanWriteAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		request.setAttribute("hello", "helloworld");
		request.setAttribute("htmlText", "<font color='red'>text red color</font>");
		request.setAttribute("today", new Date());
		request.setAttribute("n", 12345.1234);

		Group group = new Group();
		group.setName("group1");
		User user = new User();
		user.setUsername("zhang san");
		user.setAge(28);
		user.setGroup(group);

		request.setAttribute("user", user);
		return mapping.findForward("success");
	}
}
