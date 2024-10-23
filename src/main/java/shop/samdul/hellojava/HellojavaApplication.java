package shop.samdul.hellojava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("shop.samdul.hellojava.mapper") // 매퍼 패키지 경로
public class HellojavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellojavaApplication.class, args);
	}                      

}
