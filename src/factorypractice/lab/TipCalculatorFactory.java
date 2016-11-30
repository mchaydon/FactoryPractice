
package factorypractice.lab;


public class TipCalculatorFactory {
    public static TipCalculator createTipCalculator(TipSpecification tipSpec, ServiceQuality serviceQuality, double value) {
        TipCalculator tipCalculator = null;
        
        switch(tipSpec) {
            case BAGGAGE_SERVICE:
                tipCalculator = new BaggageServiceTipCalculator(serviceQuality, (int)value);
                break;
            case FOOD_SERVICE:
                tipCalculator = new FoodServiceTipCalculator(serviceQuality, value);
                break;
        }
  
        return tipCalculator;
    }
}
