package jp.iosoft.servlet;

import java.util.Date;

import javax.servlet.http.HttpServlet;

import org.apache.commons.beanutils.ConvertUtils;

import jp.iosoft.converter.UtilDateConverter;

public class UtilDateConverterServlet extends HttpServlet {

	@Override
	public void init() {
		ConvertUtils.register(new UtilDateConverter(), Date.class);
	}

}
