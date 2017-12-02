package co.codingnomads.kraken.model;

/**
 * Created by ryandesmond on 11/30/17.
 */
import java.math.BigDecimal;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Benedikt
 */
public class KrakenBalanceResult extends KrakenResult<Map<String, BigDecimal>> {

    /**
     * Constructor
     *
     * @param error List of errors
     * @param result Recent trades
     */
    public KrakenBalanceResult(@JsonProperty("error") String[] error, @JsonProperty("result") Map<String, BigDecimal> result) {

        super(result, error);
    }

}