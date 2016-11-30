package factorypractice.lab;

/**
 *
 * @author jlombardo
 */
public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService() {
        this.tipCalculator = TipCalculatorFactory.createTipCalculator(TipSpecification.FOOD_SERVICE, ServiceQuality.GOOD, 5 );
    }
    
    public double getTip() {
        return tipCalculator.getTip();
    }
}
