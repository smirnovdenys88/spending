package com.ds.spending.services.Impl;

import com.ds.spending.repositories.GoodsRepository;
import com.ds.spending.services.GoodsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository goodsRepository;

    @Override
    public ResponseEntity getAll() {
        return new ResponseEntity(goodsRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity create() {
        return null;
    }

    @Override
    public ResponseEntity update() {
        return null;
    }

    @Override
    public ResponseEntity remove() {
        return null;
    }
}
