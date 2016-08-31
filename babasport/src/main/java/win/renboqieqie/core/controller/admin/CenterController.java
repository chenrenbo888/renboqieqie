package win.renboqieqie.core.controller.admin;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * 测试
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/control")
public class CenterController {
	
	//每一个springmvc
	@RequestMapping(value = "/test/spring.do")
	public String test(String name,Date birtday){
		return "";
	}
	/*@InitBinder
	public void initBinder(WebDataBinder binder,WebRequest request){
		//转化日期格式
		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}*/
	
	@RequestMapping(value = "/index.do")
	public String index(){
		System.out.println("aa");
		return "index";
	}
	
	@RequestMapping(value = "/top.do")
	public String top(){
		return "top";
	}
	
	@RequestMapping(value = "/main.do")
	public String main(){
		return "main";
	}
	@RequestMapping(value = "/left.do")
	public String left(){
		return "left";
	}
	@RequestMapping(value = "/right.do")
	public String right(){
		return "right";
	}
}
