package com.ds.spending.services;

import org.springframework.http.ResponseEntity;

public interface GoodsService {
    ResponseEntity getAll();
    ResponseEntity create();
    ResponseEntity update();
    ResponseEntity remove();
}
