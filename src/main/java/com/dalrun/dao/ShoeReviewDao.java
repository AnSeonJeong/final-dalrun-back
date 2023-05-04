package com.dalrun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dalrun.dto.ShoeDto;

@Mapper
@Repository
public interface ShoeReviewDao {


    List<ShoeDto> getAllShoeReviewList ();
    
    ShoeDto getSingleShoeReview (int shoereviewdetailSeq);
    
}