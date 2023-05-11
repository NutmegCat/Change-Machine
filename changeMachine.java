//Aaron Prince Anu

class changeMachine
{
    public static void main(String[] args) 
    {
        //initialize vars
        int value = 1;
        final int NICKEL = 5;
        final int DIME = 10;
        final int QUARTER = 25;
        int amountOfQuarters;
        int amountOfDimes;
        int amountOfNickels;
        int amountOfPennies = 1;
        String textDime = "";
        String textNickel = "";
        String textPenny = "";
        String textQuarter = "";
        

        //input
        System.out.println("Please enter a cent value under $1");
        value = In.getInt();
        int valueReference = value;

        //invalid
        if (value < 1 || value > 99 ) {
            System.out.println("Invalid");
        } else {
            ;
        }

        //calculate coins
        amountOfQuarters = value / QUARTER;
        value -= amountOfQuarters * QUARTER;
        amountOfDimes = value / DIME;
        value -= amountOfDimes * DIME;
        amountOfNickels = value / NICKEL;
        value -= amountOfNickels * NICKEL;
        amountOfPennies = value;

        
        //string cat
        textQuarter = (amountOfQuarters + " quarters, ");
        textDime = (amountOfDimes + " dimes, ");
        textNickel = (amountOfNickels + " nickels, ");
        textPenny = (amountOfPennies + " cents. ");

        //single value check
        if (amountOfQuarters == 1) {
          textQuarter = (amountOfQuarters + " quarter, ");
        }
        if (amountOfDimes == 1) {
          textDime = (amountOfDimes + " dime, ");
        }
        if (amountOfNickels == 1) {
          textNickel = (amountOfNickels + " nickel, ");
        }
        if (amountOfPennies == 1) {
          textPenny = (amountOfPennies + " cent.");
        }
      
        //bye bye 0
        if (amountOfQuarters == 0) {
          textQuarter = "";
        }
        if (amountOfDimes == 0) {
          textDime = "";
        }
        if (amountOfNickels == 0) {
          textNickel = "";
        }
        if (amountOfPennies == 0) {
          textPenny = "";
        }
      
        //and be gone
        if (amountOfQuarters != 0 && amountOfDimes == 0 && amountOfNickels == 0 && amountOfPennies == 0) {
          textQuarter = (amountOfQuarters + " quarters.");
        }
        if (amountOfDimes != 0 && amountOfNickels == 0 && amountOfPennies == 0) {
          textDime = (amountOfDimes + " dimes.");
        }
        if (amountOfNickels != 0 && amountOfPennies == 0) {
          textNickel = (amountOfNickels + " nickels.");
        }
        if (amountOfPennies == 1) {
          textPenny = (amountOfPennies + " cent.");
        }
      
        //and last
        if (amountOfDimes != 0 && amountOfNickels == 0 && amountOfPennies == 0 && amountOfQuarters != 0) {
          textDime = ("and " + amountOfDimes + " dimes.");
        }
        if (amountOfNickels != 0 && amountOfPennies == 0 && (amountOfDimes != 0 || amountOfQuarters != 0)) {
          textNickel = ("and " + amountOfNickels + " nickels.");
        }
        if (amountOfPennies != 0 && (amountOfNickels != 0 || amountOfDimes != 0 || amountOfQuarters != 0)) {
          textPenny = ("and " + amountOfPennies + " cents.");
        }
      
        //and single
        if (amountOfDimes != 0 && amountOfNickels == 0 && amountOfPennies == 0 && amountOfQuarters != 0 && amountOfDimes == 1) {
          textDime = ("and " + amountOfDimes + " dime.");
        }
        if (amountOfNickels != 0 && amountOfPennies == 0 && (amountOfDimes != 0 || amountOfQuarters != 0) && amountOfNickels == 1) {
          textNickel = ("and " + amountOfNickels + " nickel.");
        }
        if (amountOfPennies != 0 && (amountOfNickels != 0 || amountOfDimes != 0 || amountOfQuarters != 0) && amountOfPennies == 1) {
          textPenny = ("and " + amountOfPennies + " cent.");
        }
      
        //to s, or not to s
        if (amountOfQuarters == 1 && amountOfDimes == 0 && amountOfNickels == 0 && amountOfPennies == 0) {
          textQuarter = (amountOfQuarters + " quarter.");
        }
        if (amountOfDimes == 1 && amountOfNickels == 0 && amountOfPennies == 0 && amountOfQuarters != 0) {
          textDime = ("and " + amountOfDimes + " dime.");
        }
        if (amountOfNickels == 1 && amountOfPennies == 0 && amountOfQuarters != 0 && amountOfDimes != 0) {
          textNickel = ("and " + amountOfNickels + " nickel.");
        }
      
        //first case
        if (amountOfQuarters == 1 && amountOfDimes == 0 && amountOfNickels == 0 && amountOfPennies == 0) {
          textQuarter = (amountOfQuarters + " quarter.");
        }
        if (amountOfDimes == 1 && amountOfNickels == 0 && amountOfPennies == 0 && amountOfQuarters == 0) {
          textDime = (amountOfDimes + " dime.");
        }
        if (amountOfNickels == 1 && amountOfPennies == 0 && amountOfQuarters == 0 && amountOfDimes == 0) {
          textNickel = (amountOfNickels + " nickel.");
        }


        //output (verbose)
        if (valueReference != 1) {
        System.out.println(valueReference + " cents: " + textQuarter + textDime + textNickel + textPenny);
       } else if (valueReference == 1) {
        System.out.println(valueReference + " cent: " + textQuarter + textDime + textNickel + textPenny);
       }

    }
}