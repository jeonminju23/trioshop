package com.trioshop.repository.dao.item;

import com.trioshop.model.dto.item.*;
import com.trioshop.repository.mybatis.ItemMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemInfoDao {
    private final ItemMapper itemMapper;

    public List<ItemInfoByUser> findAllItem() {
        return itemMapper.findAllItem();
    }
    public List<CategoryEntity> categoryList() {
        return itemMapper.categoryList();
    }
    public List<ItemInfoByUser> searchItems(ItemCondition itemCondition) {
        return  itemMapper.searchItems(itemCondition);
    }
    public  ItemInfoByUser itemInfoByCode(long itemCode) {
        return  itemMapper.itemInfoByCode(itemCode);
    }
    public List<ItemInfoByCart> cartItemList(long userCode) {
        return  itemMapper.cartItemList(userCode);
    }
    public List<ItemInfoByOrderList> orderList(long userCode) {
        return  itemMapper.orderList(userCode);
    }
    public void insertOrders(OrdersEntity ordersEntity) {
        itemMapper.insertOrders(ordersEntity);
    }
    public void insertOrderItems(OrderItemEntity orderItemEntity) {
        itemMapper.insertOrderItems(orderItemEntity);
    }
}
