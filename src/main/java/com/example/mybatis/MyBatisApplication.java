package com.example.mybatis;

import com.example.mybatis.mapper.CoffeeMapper;
import com.example.mybatis.model.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
@Slf4j
@MapperScan("com.example.mybatis.mapper")
public class MyBatisApplication implements ApplicationRunner {

    @Autowired
    private CoffeeMapper coffeeMapper;

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("MyBatisApplication: 11111111111111111111111111");
        showCoffee();
    }


    public void showCoffee() throws SQLException {

        Coffee c = Coffee.builder().name("espresso")
                .price(Money.of(CurrencyUnit.of("CNY"), 20.0)).build();
        Long id = coffeeMapper.save(c);
        log.info("Coffee {} => {}", id, c);

        c = coffeeMapper.findById(id);
        log.info("Coffee {}", c);
    }

}
