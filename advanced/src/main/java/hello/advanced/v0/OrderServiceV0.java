/*
 * OrderService
 * advanced
 *
 * Version 0.1
 *
 * Created by 강래민 on 2021-11-21.
 *
 * Copyright © 2021 raemerrr. All rights reserved.
 */
package hello.advanced.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {
    private final OrderRepositoryV0 orderRepositoryV0;

    public void orderItem(String itemId) {
        orderRepositoryV0.save(itemId);
    }
}
