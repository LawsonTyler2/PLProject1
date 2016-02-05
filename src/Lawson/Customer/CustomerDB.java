package Lawson.Customer;
/**
 * Created by Tyler on 2/4/2016.
 */
public class CustomerDB {
    public static Customer getCustomer(int intCustomerNumber) {

        //Create customer object to return
        Customer custReturn = new Customer();
        if (intCustomerNumber == 1001) {


            custReturn.setName( "Barbara White");
            custReturn.setAddress( "3400 Richmond Parkway #3423");
            custReturn.setCity( "Bristol");
            custReturn.setState( "CT");
            custReturn.setPostalCode( "06010");

            return custReturn;

        }
        else if (intCustomerNumber == 1002) {


            custReturn.setName( "Karl Vang");
            custReturn.setAddress( "327 Franklin Street");
            custReturn.setCity( "Edina");
            custReturn.setState( "MN");
            custReturn.setPostalCode( "55435");

            return custReturn;
        }
        else if (intCustomerNumber == 1003) {

            custReturn.setName( "Ronda Chavan");
            custReturn.setAddress( "3400 Richmond Parkway #3423");
            custReturn.setCity( "Bristol");
            custReturn.setState( "CT");
            custReturn.setPostalCode( "06010");

            return custReturn;
        }
        else {
            return custReturn;

        }

    }


}
