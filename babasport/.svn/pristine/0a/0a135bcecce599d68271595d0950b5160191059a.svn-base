package win.renboqieqie.core.controller.admin;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;
import win.renboqieqie.core.bean.product.Brand;
import win.renboqieqie.core.service.product.BrandService;

@Controller
public class BrandController {
	@Autowired
	@Qualifier("brandService")
	private BrandService brandService;
	//品牌页面
	@RequestMapping(value = "/brand/list.do")
	public String orderLeft(String name,Integer isDisplay,Integer pageNo,ModelMap model){
		//封装参数
		StringBuilder params = new StringBuilder();
		Brand brand = new Brand();
		//blank “” “   ”也是空，empty“   ”不是空
		if(StringUtils.isNotBlank(name)){
			brand.setName(name);
			params.append("name=").append(name);
		}
		//是  不是
		if(null == isDisplay){
			isDisplay = 1;
		}
		brand.setIsDisplay(isDisplay);
		params.append("&").append("isDisplay=").append(isDisplay);
		//params.append("&").append("pageNo=").append(pageNo);
		//页号如果为空，则设置为1
		brand.setPageNo(Pagination.cpn(pageNo));
		//设置页面的数量
		brand.setPageSize(5);
		//分页对象  
		Pagination pagination = brandService.getBrandListWithPage(brand);
		//分页的展示  /brand/list.do？name=name&isDisplay=x&pageNo=x
		String url= "/brand/list.do";
		pagination.pageView(url, params.toString());
		model.addAttribute("pagination", pagination);//request.setAttribute
		model.addAttribute("name", name);
		model.addAttribute("isDisplay", isDisplay);
		return "brand/list";
	}
	//跳转到品牌添加的页面
	@RequestMapping(value ="/brand/toAdd.do")
	public String toAdd(){
		
		return "/brand/add";
	}
}
