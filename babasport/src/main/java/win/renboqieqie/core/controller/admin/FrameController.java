package win.renboqieqie.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模块身体的加载
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value ="/control/")
public class FrameController {
	//商品主页
	@RequestMapping(value ="frame/product_main.do")
	public String productMain(){ 
		return "frame/product_main";
	}
	//商品左边导航
	@RequestMapping(value ="frame/product_left.do")
	public String productLetf(){
		return "frame/product_left";
	}
	//订单主页
	@RequestMapping(value ="frame/order_main.do")
	public String orderMain(){ 
		return "frame/order_main";
	}
	//订单左边导航
	@RequestMapping(value ="frame/order_left.do")
	public String orderLetf(){
		return "frame/order_left";
	}
	//订单列表
	@RequestMapping(value ="frame/order/list.do")
	public String orderlist(){
		return "order/list";
	}
	//商品列表
	@RequestMapping(value ="frame/product/list.do")
	public String productlist(){
		return "product/list";
	}
	//品牌列表
	@RequestMapping(value ="frame/brand/list.do")
	public String bandlist(){
		return "brand/list";
	}
	//类型列表
	@RequestMapping(value ="frame/type/list.do")
	public String typelist(){
		return "type/list";
	}
	
	
	
}
