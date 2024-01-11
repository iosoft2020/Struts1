package jp.iosoft.plugin;

import java.util.Date;

import javax.servlet.ServletException;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

import jp.iosoft.converter.UtilDateConverter;

public class UtilDateConverterPlugIn implements PlugIn {

	@Override
	public void destroy() {
	}

	public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
		ConvertUtils.register(new UtilDateConverter(), Date.class);
	}
}
