package cn.chenxx.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule
{
    @Bean
    public IRule myRule()
    {
        return new RandomRule_Hand();// 自定义为每台机器5次
    }

}
