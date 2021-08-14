package com.ds.spending.repositories;

import com.ds.spending.enums.TypeGoods;
import com.ds.spending.models.GoodsEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.LongStream;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@Rollback
@AutoConfigureTestEntityManager
@AutoConfigureDataJpa
@Transactional
@RunWith(MockitoJUnitRunner.class)
public class GoodsRepositoryTest {
    @Autowired
    private GoodsRepository goodsRepository;
    private final int count = 20;

    @BeforeEach
    void setUp() {
        LongStream.rangeClosed(1, count)
                .forEach(g -> goodsRepository.save(
                        new GoodsEntity(g,
                                UUID.randomUUID().toString(),
                                new BigDecimal("1000.0"),
                                TypeGoods.CAR,
                                new Date(System.currentTimeMillis()))
                ));
    }

    @Test
    public void shouldBeTotalCount(){
        List<GoodsEntity> list = goodsRepository.findAll();
        assertEquals(count, list.size());
    }

}