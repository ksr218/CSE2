//Define the class.
public class Arithmetic{
    
        //Define main method.
    public static void main(String[] args){

/////////////////////////////////////////////////////////////
        
        //Alright, let's declare the variables first.
        
        //Number of pairs of socks
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
        
        //Tax percent
        double taxPercent=0.06;
        
/////////////////////////////////////////////////////////////

        //Now for the calculation.
        
        //Total cost of socks
        double totalsockcost$=nSocks*sockCost$;
        //Sales tax on total cost of socks
        double taxtotalsockcost$=totalsockcost$*taxPercent;
        
        taxtotalsockcost$=taxtotalsockcost$*100;
        taxtotalsockcost$=(double)((int)(taxtotalsockcost$));
        taxtotalsockcost$=taxtotalsockcost$/100;
        
         //Total cost of drinking glasses
        double totalglasscost$=nGlasses*glassCost$;
        //Sales tax on total cost of glasses
        double taxtotalglasscost$=totalglasscost$*taxPercent;
        
        taxtotalglasscost$=taxtotalglasscost$*100;
        taxtotalglasscost$=(double)((int)(taxtotalglasscost$));
        taxtotalglasscost$=taxtotalglasscost$/100;
        
         //Total cost of box of envelopes
        double totalenvelopecost$=nEnvelopes*envelopeCost$;
        //Sales tax on total cost of envelops
        double taxtotalenvelopecost$=totalenvelopecost$*taxPercent;
        
        taxtotalenvelopecost$=taxtotalenvelopecost$*100;
        taxtotalenvelopecost$=(double)((int)(taxtotalenvelopecost$));
        taxtotalenvelopecost$=taxtotalenvelopecost$/100;
        
       
       
        //Total cost of purchases (before tax)
        double totalpretaxcost$=totalsockcost$+totalglasscost$+totalenvelopecost$;
        
        //Total sales tax
        double totalsalestax$=taxtotalsockcost$+taxtotalglasscost$+taxtotalenvelopecost$;
        
        //Total cost of purchases (after tax)
        double totalposttaxcost$=totalpretaxcost$-totalsalestax$;
        
        

/////////////////////////////////////////////////////////////

        //Now let's print out the information
        
        System.out.println("Purchased item: Pair of socks");
        System.out.println("Quantity purchased: " +nSocks);
        System.out.println("Cost per Item: " +sockCost$);
        System.out.println("Total cost: " +totalsockcost$);
        System.out.println("Sales tax on item: " +taxtotalsockcost$);
        System.out.println("----------------------------------------------------");
        System.out.println("Purchased item: Drinking glasses");
        System.out.println("Quantity purchased: " +nGlasses);
        System.out.println("Cost per item: " +glassCost$);
        System.out.println("Total cost: " +totalglasscost$);
        System.out.println("Sales tax on item: " +taxtotalglasscost$);
        System.out.println("----------------------------------------------------");
        System.out.println("Purchased item: Box of envelopes");
        System.out.println("Quantity purchased: " +nEnvelopes);
        System.out.println("Cost per item: " +envelopeCost$);
        System.out.println("Total cost: " +totalenvelopecost$);
        System.out.println("Sales tax on item: " +taxtotalenvelopecost$);
        System.out.println("----------------------------------------------------");
        System.out.println("Total cost of purchases (before tax): " +totalpretaxcost$);
        System.out.println("Total sales tax: " +totalsalestax$);
        System.out.println("Total cost of purchases (including sales tax): " +totalposttaxcost$);
        
       
    }
}

    
