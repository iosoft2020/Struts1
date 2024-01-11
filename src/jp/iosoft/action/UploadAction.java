package jp.iosoft.action;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.iosoft.form.UploadForm;

public class UploadAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UploadForm uf = (UploadForm) form;

		System.err.println("title=" + uf.getTitle());
		String fileName = uf.getMyfile().getFileName();
		System.err.println("fileName=" + fileName);
		try (FileOutputStream fos = new FileOutputStream("C:/test_upload/" + fileName)) {
			fos.write(uf.getMyfile().getFileData());
			fos.flush();
		}

		return mapping.findForward("success");
	}
}
