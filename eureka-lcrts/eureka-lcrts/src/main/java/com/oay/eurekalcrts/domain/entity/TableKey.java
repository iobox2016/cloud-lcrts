package com.oay.eurekalcrts.domain.entity;

import com.oay.eurekalcrts.domain.vo.TableKeyVO;

public class TableKey extends Entity<String> {

    private TableKeyVO tableKeyVO = new TableKeyVO();

    public TableKey(String id, int skuGroupId, int roomTypeId ) {
        super(id);
        this.tableKeyVO.setSkuGroupId(skuGroupId);
        this.tableKeyVO.setRoomTypeId(roomTypeId);
    }

    @Override
    public String getID() {
        return super.getID();
    }
}
