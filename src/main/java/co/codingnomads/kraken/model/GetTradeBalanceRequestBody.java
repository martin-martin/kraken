package co.codingnomads.kraken.model;

public class GetTradeBalanceRequestBody extends RequestBodyGeneric {

    // asset class (optional)
    String assetClass;

    // base asset used to determine balance (default = ZUSD) (optional)
    String asset;

    public GetTradeBalanceRequestBody(String assetClass, String asset) {
        super();
        this.assetClass = assetClass;
        this.asset = asset;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return "assetClass='" + assetClass + '\'' +
                ", asset='" + asset + '\'' +
                ", nonce='" + nonce + '\'';
    }
}