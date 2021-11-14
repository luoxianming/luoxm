package com.example.mysqldemo.response.list;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListResult<T> {

    /**
     * 列表数据集
     */
    @ApiModelProperty(value = "返回参数")
    private List<T> list;
}
