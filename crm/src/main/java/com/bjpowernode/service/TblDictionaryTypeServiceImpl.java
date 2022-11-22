package com.bjpowernode.service;

import com.bjpowernode.beans.TblDictionaryType;
import com.bjpowernode.mapper.TblDictionaryTypeMapper;
import com.bjpowernode.service.TblDictionaryTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典类型表(TblDictionaryType)表服务实现类
 *
 * @author hjw
 * @since 2022-10-06 16:31:44
 */
@Service("tblDictionaryTypeService")
public class TblDictionaryTypeServiceImpl implements TblDictionaryTypeService {
    @Resource
    private TblDictionaryTypeMapper tblDictionaryTypeMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    @Override
    public TblDictionaryType queryById(String code) {
        return this.tblDictionaryTypeMapper.queryById(code);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TblDictionaryType> queryAllByLimit(int offset, int limit) {
        return this.tblDictionaryTypeMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tblDictionaryType 实例对象
     * @return 实例对象
     */
    @Override
    public TblDictionaryType insert(TblDictionaryType tblDictionaryType) {
        this.tblDictionaryTypeMapper.insert(tblDictionaryType);
        return tblDictionaryType;
    }

    /**
     * 修改数据
     *
     * @param tblDictionaryType 实例对象
     * @return 实例对象
     */
    @Override
    public TblDictionaryType update(TblDictionaryType tblDictionaryType) {
        this.tblDictionaryTypeMapper.update(tblDictionaryType);
        return this.queryById(tblDictionaryType.getCode());
    }

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String code) {
        return this.tblDictionaryTypeMapper.deleteById(code) > 0;
    }
}