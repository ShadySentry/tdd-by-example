package guru.springframework;

import java.util.HashMap;

/**
 * Created by jt on 2018-10-07.
 */
public class Bank {
    private HashMap<Pair,Integer> currencyRates= new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this,toCurrency);
    }

    public void addRate(String from, String to, int rate) {
        currencyRates.put(new Pair(from,to), rate);
    }

    public int rate(String from, String to) {
        if(from.equals(to))
            return 1;

        return currencyRates.get(new Pair(from,to));
    }
}
