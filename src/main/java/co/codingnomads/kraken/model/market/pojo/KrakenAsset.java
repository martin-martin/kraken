package co.codingnomads.kraken.model.market.pojo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/*
created by PopoPenguin on 12/12/17
*/


/**
 * KrakenAsset POJO for api call <url>https://api.kraken.com/0/public/Assets</url>
 *
 * Kraken API Documentation for this call <url>https://www.kraken.com/help/api#get-asset-info</url>
 *
 * resource : <url>https://github.com/timmolter/XChange/tree/5174f9e931955dc201fa57e228564d8b884c9f84/xchange-kraken/src/main/java/org/knowm/xchange/kraken</url>
 */

public class KrakenAsset {

    String altname;
    String aclass;
    BigDecimal decimals;
    BigDecimal display_decimals;

    /**
     * Class Constructor
     *
     * @param altname   alternate name
     * @param aclass    asset class
     * @param decimals  scaling decimal places for record keeping
     * @param display_decimals  scaling decimal places for output display
     */

    public KrakenAsset(@JsonProperty("altname")String altname,@JsonProperty("aclass") String aclass,
                       @JsonProperty("decimals") BigDecimal decimals,@JsonProperty("display_decimals") BigDecimal display_decimals) {
        this.altname = altname;
        this.aclass = aclass;
        this.decimals = decimals;
        this.display_decimals = display_decimals;
    }

    public String getAltname() {
        return altname;
    }

    public String getAclass() {
        return aclass;
    }

    public BigDecimal getDecimals() {
        return decimals;
    }

    public BigDecimal getDisplay_decimals() {
        return display_decimals;
    }


    @Override
    public String toString() {
        return "KrakenAsset{" +
                "altname='" + altname + '\'' +
                ", aclass='" + aclass + '\'' +
                ", decimals=" + decimals +
                ", display_decimals=" + display_decimals +
                '}';
    }
}
