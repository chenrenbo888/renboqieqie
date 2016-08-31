package win.renboqieqie.core.bean.product;

import java.io.Serializable;

public class Brand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 538522866471171266L;
	private Integer id;
	private String name;
	private String description;
	private String webSite;
	private String imgUrl;
	private Integer sort;
	private Integer isDisplay;
	
	
	//页号
	private Integer pageNo=1;
	//每页数
	private  Integer pageSize = 10;
	//总记录数
	private Integer startRow;
	
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		//每一次改变pageNo和pageSize的时候都要付一次值
		this.startRow = (pageNo-1)*pageSize;
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		this.startRow = (pageNo-1)*pageSize;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	public Brand(Integer id, String name, String description, String webSite,
			String imgUrl, Integer sort, Integer isDisplay) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.webSite = webSite;
		this.imgUrl = imgUrl;
		this.sort = sort;
		this.isDisplay = isDisplay;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", description="
				+ description + ", webSite=" + webSite + ", imgUrl=" + imgUrl
				+ ", sort=" + sort + ", isDisplay=" + isDisplay + "]";
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
