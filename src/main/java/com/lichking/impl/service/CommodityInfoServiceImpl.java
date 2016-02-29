package com.lichking.impl.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lichking.itf.dao.ICommodityInfoDAO;
import com.lichking.itf.service.ICommodityInfoService;
import com.lichking.pojo.CommodityInfoPOJO;

@Service("CommodityInfoService")
public class CommodityInfoServiceImpl implements ICommodityInfoService {

	@Resource
	private ICommodityInfoDAO iCommodityInfoDAO;
	
	@Override
	public int insertComWithNull(CommodityInfoPOJO com) {
		return this.iCommodityInfoDAO.insertSelective(com);
	}

}
