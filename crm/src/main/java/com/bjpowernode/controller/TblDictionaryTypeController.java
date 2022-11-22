package com.bjpowernode.controller;

import com.bjpowernode.beans.TblDictionaryType;
import com.bjpowernode.service.TblDictionaryTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 字典类型表(TblDictionaryType)表控制层
 *
 * @author hjw
 * @since 2022-10-06 16:31:44
 */
@RestController
@RequestMapping("tblDictionaryType")
public class TblDictionaryTypeController {
    /**
     * 服务对象
     */
    @Resource
    private TblDictionaryTypeService tblDictionaryTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TblDictionaryType selectOne(String id) {
        return this.tblDictionaryTypeService.queryById(id);
    }

}