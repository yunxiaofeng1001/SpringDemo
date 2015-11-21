package org.yun;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * Created by yunxiaofeng on 15/9/14.
 */
@Component
@ConfigurationProperties(prefix = "tmall")
public class Testabc {

    private List<YmlEntity> number ;

    public List<YmlEntity> getNumber() {
        return number;
    }

    public void setNumber(List<YmlEntity> number) {
        this.number = number;
    }
    public void abc(){
    }

}
