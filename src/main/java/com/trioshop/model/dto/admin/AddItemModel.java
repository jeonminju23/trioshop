package com.trioshop.model.dto.admin;
;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

@Getter @Setter
public class AddItemModel{
    Long itemCode;
    String itemName;
    String categoryCode;
    Integer itemPrice;
    String factoryCode;
    String itemSize;
    String itemColor;

    public AddItemModel() {
    }

    public AddItemModel(String itemName, String categoryCode, Integer itemPrice, String factoryCode, String itemSize, String itemColor) {
        this.itemName = itemName;
        this.categoryCode = categoryCode;
        this.itemPrice = itemPrice;
        this.factoryCode = factoryCode;
        this.itemSize = itemSize;
        this.itemColor = itemColor;
    }

    @Override
    public String toString() {
        return "AddItemModel{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", itemPrice=" + itemPrice +
                ", factoryCode='" + factoryCode + '\'' +
                ", itemSize='" + itemSize + '\'' +
                ", itemColor='" + itemColor + '\'' +
                '}';
    }
}
