/*
 *@Project ：lvtt-mall
 *@Author  ：Levi_Bee
 *@Date    ：2023/2/24 3:38 下午
 */


package com.lvtt.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.lvtt.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.lvtt.mall.tiny.mbg.model.PmsBrand;
import com.lvtt.mall.tiny.mbg.model.PmsBrandExample;
import com.lvtt.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PmsBrandService实现类
 * @author levi_bee
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
