package com.tyshawn.feign;

import com.tyshawn.entity.Book;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookFeignFallbackFactoty implements FallbackFactory<BookFeign> {
    @Override
    public BookFeign create(Throwable throwable) {
        return new BookFeign() {
            /**
             * 降级逻辑
             * @return
             */
            @Override
            public List<Book> list() {
                return new ArrayList<>();
            }
        };
    }
}
