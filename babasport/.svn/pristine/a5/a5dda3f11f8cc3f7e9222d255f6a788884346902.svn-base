package win.renboqieqie.core.service.product;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import win.renboqieqie.core.bean.product.Brand;
import win.renboqieqie.core.dao.product.BrandDao;

/**
 * 品牌事务层
 * @author Administrator
 *
 */
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService{

	@Resource
	private BrandDao brandDao;
	
	@Transactional(readOnly = true)
	public Pagination getBrandListWithPage(Brand brand){
		//1.页号
		//2.每页数
		//3.记录总数
		Pagination pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandDao.getBrandCount(brand));
		//brand的数据集合
		pagination.setList(brandDao.getBrandListWithPage(brand));
		return pagination;
	}
}
