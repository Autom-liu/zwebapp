package com.scnu.zwebapp.common.service;

import java.util.List;

/**
 * 公共接口的服务
 * @author Autom
 *
 * @param <T> BO 实体类
 * @param <DTO> DTO
 * @param <VO> VO
 */
public interface IService<DTO, VO> {
	
	List<VO> findAll();
	
	VO findOne(Integer id);
	
	List<VO> findByIds(List<Integer> ids);
	
	int insert(DTO dto);
	
	int updateByIdSelective(DTO dto);
	
	int deleteById(Integer id);
	
}
