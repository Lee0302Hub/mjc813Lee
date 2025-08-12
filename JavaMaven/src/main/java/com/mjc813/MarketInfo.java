package com.mjc813;

import com.mjc813.mjc_library.IMarketInfo;

public class MarketInfo implements IMarketInfo {
    @Override
   public String getMessageOfMarketInfo() {
        return "";
    }

    @Override
    public String getMessageOfNotValidData() {
       return "포인트가 정상범주에 없다.";
    }
}
