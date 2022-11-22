package com.bjpowernode.service;

import com.bjpowernode.beans.TblDictionaryType;
import java.util.List;

/**
 * 字典类型表(TblDictionaryType)表服务接口
 *
 * @author hjw
 * @since 2022-10-06 16:31:44
 */
public interface TblDictionaryTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    TblDictionaryType queryById(String code);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TblDictionaryType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tblDictionaryType 实例对象
     * @return 实例对象
     */
    TblDictionaryType insert(TblDictionaryType tblDictionaryType);

    /**
     * 修改数据
     *
     * @param tblDictionaryType 实例对象
     * @return 实例对象
     */
    TblDictionaryType update(TblDictionaryType tblDictionaryType);

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 是否成功
     */
    boolean deleteById(String code);

}