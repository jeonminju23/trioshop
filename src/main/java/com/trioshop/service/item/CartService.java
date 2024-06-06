package com.trioshop.service.item;

import com.trioshop.model.dto.item.CartEntity;
import com.trioshop.model.dto.item.ItemDetailSearch;
import com.trioshop.model.dto.item.ItemInfoByCart;
import com.trioshop.repository.dao.item.CartDao;
import com.trioshop.repository.dao.item.ItemDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartDao cartDao;
    private final ItemDao itemInfoDao;

    public List<ItemInfoByCart> cartItemList(long userCode) {
        return cartDao.cartItemList(userCode);
    }

    //카트 단일,다중 항목 추가
    @Transactional
    public void addCartItem (long userCode, List<Long> itemCodes, List<Long> quantities) {
        for (int i = 0; i < itemCodes.size(); i++) {
            CartEntity cartEntity = new CartEntity(userCode,itemCodes.get(i),quantities.get(i));
            if( cartDao.selectCartItem(cartEntity) != 0) { // 검색된 항목이 있다면
                cartDao.updateCartItem(cartEntity); // 수량을 업데이트
            } else {
                cartDao.insertCartItem(cartEntity); // cart에 insert
            }
        }
    }
    // 카트 항목 delete
    public void deleteCartItem (CartEntity cartEntity) {
        cartDao.deleteCartItem(cartEntity);
    }
    public List<ItemDetailSearch> itemDetailNameSearch(String itemName) {
        return  itemInfoDao.itemDetailNameSearch(itemName);
    }

}
