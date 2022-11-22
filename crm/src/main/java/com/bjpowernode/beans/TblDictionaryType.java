package com.bjpowernode.beans;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
/**
 * 字典类型表(TblDictionaryType)实体类
 *
 * @author hjw
 * @since 2022-10-06 16:31:43
 */
public class TblDictionaryType implements Serializable {
    private static final long serialVersionUID = -14297284288058097L;
    /**
    * 例如：sex、orgType
    */
    private String code;
    /**
    * 例如：性别、机构类型
    */
    private String name;
    /**
    * 对该字典类型的一个描述
    */
    private String description;


}