package com.ds.spending.controllers;

import com.ds.spending.services.GoodsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods/")
@RequiredArgsConstructor
@Slf4j
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping
    public ResponseEntity getAll() {
        return goodsService.getAll();
    }
}
