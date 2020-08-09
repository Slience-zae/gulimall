package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    /**
     * 保存测试
     */
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity
                .setName("苹果")
                .setShowStatus(1)
                .setSort(2);
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

    /**
     * 更新测试
     */
    @Test
    void updateTest(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(4L).setDescript("we have an American Dream");
        brandService.updateById(brandEntity);
    }

    /**
     * 查询测试
     */
    @Test
    void findTest(){
        BrandEntity brandEntity = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 3L));
        System.out.println("getOne的测试结果："+brandEntity+"\n---------");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().between("sort", 0, 4));
        System.out.println("list的测试结果：");
        list.forEach(
                brand -> {
                    System.out.println(brand);
                }
        );
    }


}
