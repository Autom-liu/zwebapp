package com.scnu.zwebapp.facade.interfaces;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.facade.dto.OtherDTO;
import com.scnu.zwebapp.facade.query.OtherQuery;
import com.scnu.zwebapp.facade.vo.OtherVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface OtherService extends IService<OtherDTO, OtherVO> {
	
	PageVO<OtherVO> queryPage(OtherQuery query);
	
	List<OtherVO> queryList(OtherQuery query);
	
	/**
	 * 增加使用次数
	 * @param id
	 * @return
	 */
	int increaseUseTime(Integer id);
	
}
