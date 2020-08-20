package com.it.service.impl;

import com.it.dao.ItemsDao;
import com.it.domain.Items;
import com.it.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Zic
 * @Data: 2020-08-15 19:52
 * Copyright©Zic 2020-2020. All rights reserved.
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
