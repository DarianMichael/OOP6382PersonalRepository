
package ec.edu.espe.taxlibrary;

/* taxes computations according the ecuadorian government regulation as they 
 * stated in the constitution, Iva, Ice, Impuesto a la Renta, etc
 *
 *
 * @author DARIAN
 * @version 0.1.1
 * @since 2020-06-22
 */
 
public class Tax {
    
     /*
     * Computes the IVA tax of a product based oin its net value the 
     * percentage of the taxes are going to be provied by the library user
     * @param base net value of any product that you want to compute the
     * value for
     * @param ivaPercentage the percentage according to government regulations
     * @return the Iva that a product will be charged for sale
     */
    //private final static float ivaPercentage = 12;
    
    public static float computeIva(float base, float ivaPercentage){
        float taxValue = 0.0F;
        taxValue = base * (ivaPercentage / 100);
        return taxValue;
    }
    
     /**
     * 
     @param base net value of any product that you want to compute the
     * value for
     * @param ivaPercentage the percentage according to government regulations
     * @return 
     */
    
    public static float computeTotalIva(float base, float ivaPercentage){
        float totalValue = 0.0F;
        totalValue = base + computeIva(base, ivaPercentage);
        return totalValue;
    }
}
