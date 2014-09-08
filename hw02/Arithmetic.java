//Fernando Bolanos
//hw02-Arithmetic
//09/08/2014
//Arithmetic HW Program
//
//  Compute the cost of the items I buy including tax.
//  Total cost of each kind of item.
//  Sales tax for the total cost
//  Total cost of purchase before taxes.
//  Total cost of the transaction including taxes.
//
//Define class
public class Arithmetic{
    
//Public method
    public static void main(String[] args) {
        
        //Number of pair of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of envelopes
        double envelopeCost$=3.25;
        //Percent of tax
        double taxPercent=0.06;
        //Define variables
        double sockTax$,glassTax$,envelopeTax$,totalSocks$,totalGlasses$;
        double totalEnvelopes$,totalSockTax$,totalGlassTax$,totalEnvelopeTax$;
        double totalSale$,totalSaleTax$,totalSaleWithTax$;
        
        //Do calculations
            sockTax$=sockCost$*taxPercent;
            glassTax$=glassCost$*taxPercent;
            envelopeTax$=envelopeCost$*taxPercent;
            totalSocks$=nSocks*sockCost$;
            totalGlasses$=nGlasses*glassCost$;
            totalEnvelopes$=nEnvelopes*envelopeCost$;
            totalSockTax$=nSocks*sockCost$*taxPercent;
            totalGlassTax$=nGlasses*glassCost$*taxPercent;
            totalEnvelopeTax$=nEnvelopes*envelopeCost$*taxPercent;
            totalSale$=totalSocks$+totalGlasses$+totalEnvelopes$;
            totalSaleTax$=totalSockTax$+totalEnvelopeTax$+totalGlassTax$;
            totalSaleWithTax$=totalSocks$+totalGlasses$+totalEnvelopes$+totalSockTax$+totalEnvelopeTax$+totalGlassTax$;
        
        //Print Information
        System.out.println("# of Socks "+(nSocks));
        System.out.println("Cost per Sock $"+(sockCost$));
        System.out.println("# of Glasses "+(nGlasses));
        System.out.println("Cost per Glasses $"+(glassCost$));
        System.out.println("# of Boxes of Envelopes "+(nEnvelopes));
        System.out.println("Cost per Box of Envelopes $"+(envelopeCost$));
        System.out.println("________________________________________");
        System.out.println("Cost per Sock $"+(sockCost$));
        System.out.printf("Sales tax for a pair of Socks $%5.2f\n", (sockTax$));
        System.out.println("Cost per Glasses $"+(glassCost$));
        System.out.printf("Sales tax for a pair of Glasses $%.2f\n", (glassTax$));
        System.out.println("Cost per Box of Envelopes $"+(envelopeCost$));
        System.out.printf("Sales tax for a box of Envelopes $%.2f\n", (envelopeTax$));
        System.out.println("________________________________________");
        System.out.println("Total cost of purchase before tax $"+(totalSale$));
        System.out.printf("Total sales tax $%.2f\n",(totalSaleTax$));
        System.out.println("________________________________________");
        System.out.printf("Total cost of purchase $%.2f\n",(totalSaleWithTax$));
        System.out.println("________________________________________");
    }
}