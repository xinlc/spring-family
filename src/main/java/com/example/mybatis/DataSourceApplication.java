//package com.example.mybatis;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//@SpringBootApplication
//@Slf4j
//public class DataSourceApplication implements CommandLineRunner {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public static void main(String[] args) {
//        SpringApplication.run(DataSourceApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        log.info("DataSourceApplication: 11111111111111111111111111");
//        showConnection();
//        showData();
//    }
//
//    public void showConnection() throws SQLException {
//        log.info("ds:{}", dataSource.toString());
//        Connection conn = dataSource.getConnection();
//        log.info(conn.toString());
//        conn.close();
//    }
//
//    public void showData() throws SQLException {
//        jdbcTemplate.queryForList("SELECT * FROM FOO")
//                .forEach(row -> log.info(row.toString()));
//    }
//}
