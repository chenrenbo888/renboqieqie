package win.renboqieqie.core.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * 自定义的日期转换
 * @author Administrator
 *
 */
public class CustomDateEdtor implements WebBindingInitializer {
	
	
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// TODO Auto-generated method stub
		/*  局部的时间格式的转换*/
			//转换日期格式
		DateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormate, true));
	}

}
