package test.IDao;

import test.domain.TProduct;

public interface TProductMapper {
    int deleteByPrimaryKey(String tProductId);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    TProduct selectByPrimaryKey(String tProductId);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);
}