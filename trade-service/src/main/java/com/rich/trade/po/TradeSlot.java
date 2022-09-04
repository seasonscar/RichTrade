package com.rich.trade.po;

import java.math.BigDecimal;

public class TradeSlot {
    private int slotNo; // 交易槽位序号

    private BigDecimal slotBuyPrice; // 交易槽位购买价格

    private BigDecimal expectSellPrice; // 交易槽位期望销售价格

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public BigDecimal getSlotBuyPrice() {
        return slotBuyPrice;
    }

    public void setSlotBuyPrice(BigDecimal slotBuyPrice) {
        this.slotBuyPrice = slotBuyPrice;
    }

    public BigDecimal getExpectSellPrice() {
        return expectSellPrice;
    }

    public void setExpectSellPrice(BigDecimal expectSellPrice) {
        this.expectSellPrice = expectSellPrice;
    }
}
