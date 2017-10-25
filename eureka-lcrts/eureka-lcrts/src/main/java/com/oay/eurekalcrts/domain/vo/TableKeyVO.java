package com.oay.eurekalcrts.domain.vo;

public class TableKeyVO {

    private int skuGroupId;

    private int roomTypeId;

    public void TableKeyVO(){};

    public void TableKeyVO(int skuGroupId, int roomTypeId) {
        this.skuGroupId = skuGroupId;
        this.roomTypeId = roomTypeId;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public int getSkuGroupId() {
        return skuGroupId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public void setSkuGroupId(int skuGroupId) {
        this.skuGroupId = skuGroupId;
    }
}
