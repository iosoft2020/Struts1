package jp.iosoft.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.iosoft.pojo.Group;
import jp.iosoft.pojo.User;

public class LogicIterateAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		Group group = new Group();
		group.setName("group1");

		List<User> users = new ArrayList<>();
		for (int i = 0; i< 10; i++) {

			User user = new User();
			user.setUsername("zhang san_"+i);
			user.setAge(28+i);
			user.setGroup(group);
			users.add(user);
		}

		request.setAttribute("users", users);
		return mapping.findForward("success");
	}
}
