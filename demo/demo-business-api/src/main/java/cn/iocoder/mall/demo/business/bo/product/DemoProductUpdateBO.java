package cn.iocoder.mall.demo.business.bo.product;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Demo 商品更新 BO
 */
@Data
@Accessors(chain = true)
public class DemoProductUpdateBO {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 价格
     */
    private Integer price;
    /**
     * 库存数量
     */
    private Integer quantity;

}
