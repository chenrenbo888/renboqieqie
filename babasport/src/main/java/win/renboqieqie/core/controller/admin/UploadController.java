package win.renboqieqie.core.controller.admin;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import win.renboqieqie.common.web.ResponseUtils;

/**
 * 上传图片类控制器
 * 商品
 * 品牌
 * 商品介绍
 * @author Administrator
 *
 */
@Controller
public class UploadController {

	//品牌上传图片
	@RequestMapping(value ="/upload/uploadPic.do")
	public void brandUploadPic(@RequestParam(required = false) MultipartFile pic,HttpServletResponse response){
		//扩展名，即.后面的字母
		String extension = FilenameUtils.getExtension(pic.getOriginalFilename());
		//图片名称生成策略
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//图片名称是的时间部分
		StringBuilder format = new StringBuilder();
		format.append(df.format(new Date()));
		//随机三位数
		Random r = new Random();
		for(int i=0;i<3;i++){
			r.nextInt(10);
			format.append(r.nextInt(10));
		}
		//实例化一个jersey
		Client client = new Client();
		String path = "upload/"+format.toString()+"."+extension;
		//另一台服务器的路径
		String url = "http://localhost:8088/image-web/"+path;
		//设置请求的路径
		WebResource resource = client.resource(url);

		 //发送请求
		try {
			resource.put(String.class,pic.getBytes());
		} catch (UniformInterfaceException | ClientHandlerException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject json = new JSONObject();
		json.put("path", path);
		json.put("url", url);
		//返回json数据
		ResponseUtils.renderJson(response, json.toString());
	}
}
