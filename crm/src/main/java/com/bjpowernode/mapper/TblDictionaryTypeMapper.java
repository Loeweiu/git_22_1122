package com.bjpowernode.mapper;

import com.bjpowernode.beans.TblDictionaryType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 字典类型表(TblDictionaryType)表数据库访问层
 *
 * @author hjw
 * @since 2022-10-06 16:31:44
 */
public interface TblDictionaryTypeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    TblDictionaryType queryById(String code);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TblDictionaryType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tblDictionaryType 实例对象
     * @return 对象列表
     */
    List<TblDictionaryType> queryAll(TblDictionaryType tblDictionaryType);

    /**
     * 新增数据
     *
     * @param tblDictionaryType 实例对象
     * @return 影响行数
     */
    int insert(TblDictionaryType tblDictionaryType);

    /**
     * 修改数据
     *
     * @param tblDictionaryType 实例对象
     * @return 影响行数
     */
    int update(TblDictionaryType tblDictionaryType);

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 影响行数
     */
    int deleteById(String code);

}