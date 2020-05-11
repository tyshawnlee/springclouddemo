package com.tyshawn.feign;

import com.tyshawn.entity.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "SPRINGCLOUDDEMO-PROVIDER-BOOK", fallbackFactory = BookFeignFallbackFactoty.class)
public interface BookFeign {

    @GetMapping("/book/getAllBook")
    List<Book> list();
}
