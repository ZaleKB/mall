package com.zale.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zale.mall.product.entity.BrandEntity;
import com.zale.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        // BrandEntity entity = new BrandEntity();
        // entity.setName("唐尧");
        // brandService.save(entity);
        // System.out.println("保存成功");


        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1)).forEach(System.out::println);

    }

}
