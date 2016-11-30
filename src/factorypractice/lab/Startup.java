package factorypractice.lab;

public class Startup {

    public static void main(String[] args) {
        /*
            Here is the old way of initializing a TipService by providing
            one of several tip calculator strategy options.
        */
        TipService mgr = new TipService();
        double tip = mgr.getTip();
        System.out.println("The tip is calculated to be: " + tip);
        
        /*
            Now revise this program by adding a factory class that can
            build TipCalculator objects via a specification. Then hide
            the factory from this "Startup" class and encapsulate all
            funtionality somewhere else. Make any other changes you feel
            are necessary. The objective is to expose only the TipService 
            class in this "Startup" class. If you have trouble figuring out
            how to do this, examine the example code in the "factorypractice"
            package. Remember, you will need to pass "specification" 
            information to a class that encapsulates the factory.
        */
    }

}
