package lk.self.book_store;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableSwagger2
public class BookStoreApplication {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();

    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

}
