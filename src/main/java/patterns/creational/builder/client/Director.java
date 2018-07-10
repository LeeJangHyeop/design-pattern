package patterns.creational.builder.client;

import patterns.creational.builder.builder.Builder;

import java.util.Date;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class Director {
    public void constructAirFilter(Builder builder) {
        builder.setName("AirFilter 1");
        builder.setCreatedDate(new Date());
        builder.setDescription("This is AirFilter 1");
        builder.setPrice(500L);
        builder.setProductType("AirFilter");
        builder.setUnit("cm");
    }

    public void constructBagFilter(Builder builder) {
        builder.setName("BagFilter 1");
        builder.setCreatedDate(new Date());
        builder.setDescription("This is BagFilter 1");
        builder.setPrice(50000L);
        builder.setProductType("BagFilter");
        builder.setUnit("m");
    }
}
