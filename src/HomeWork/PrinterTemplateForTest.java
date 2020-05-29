package HomeWork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PrinterTemplateForTest {

    String name = "general";
    int toner = 50;
    int pages = 11;
    String tonerStatement = "None";
    String pageStatement = "None";
    int maxTonerLimit = 100;
    int maxPageLimit = 100;
    String printStatement = "";

    // setup the name for the printer--

    public void setName(String printerName) {
        name = printerName;
        System.out.println("You have successfully set the name of the Printer as: " + name);
    }

    // get printer name for user--

    public String getPrinterName() {
        return "Printer Name is: " + name;
    }

    // adding toner--

    public String addToner(int addToner) {

        if (addToner < 0) {
            System.out.println("System doesn't allow negative addition to toner level.");
        } else if (toner < maxTonerLimit && toner + addToner > maxTonerLimit) {
            System.out.println(tonerStatement = "Toner limit is: " + maxTonerLimit + ", current toner level is: " + toner + ". You can add maximum: " + (100 - toner));
        } else if (toner + addToner <= maxTonerLimit) {
            toner = toner + addToner;
            System.out.println(tonerStatement = "After latest addition of " + addToner + ", current Toner level is: " + toner);
        } else {
            System.out.println(tonerStatement = "Toner is full, can't add more toner.");
        }
        return tonerStatement;

    }
    // Get toner level--

    public String getTonerLevel() {

        String tonerAlarm = "";

        if (toner > 10) {
            tonerAlarm = "Current toner level is: " + toner;
        } else {
            tonerAlarm = "Current toner level is: " + toner + ". Please add toner.";
        }
        return tonerAlarm;
    }

    // adding pages--

    public String addPages(int addPages) {


        if (addPages < 0) {
            System.out.println("System doesn't allow you to put negative input for pages.");
        } else if (pages < maxPageLimit && pages + addPages > maxPageLimit) {
            System.out.println(pageStatement = "Page limit is: " + maxPageLimit + ", current unused page is: " + pages + ". You can add maximum: " + (100 - pages) + " pages.");
        } else if (pages + addPages <= maxPageLimit) {
            pages = pages + addPages;
            System.out.println(pageStatement = "After latest addition of " + addPages + ", current availability is: " + pages + " pages.");
        } else {
            System.out.println(pageStatement = "Page limit is full, can't add more pages.");
        }
        return pageStatement;

    }
    // Page availability-

    public String pageAvailability() {
        String pageAlarm = "";
        if (pages > 10) {
            pageAlarm = "Current availability is: " + pages + " pages.";
        } else {
            pageAlarm = "Current availability is: " + pages + " pages. Please add pages.";
        }
        return pageAlarm;
    }

    // Printer Summary-

    public String printerSummary() {
        String printSum = "";
        if (toner > 10 && pages > 10) {
            printSum = "Printer summary is- " + "\n" + "Toner level: " + toner + "\n" + "& Page count in tray: " + pages + " pages.";
        } else if (toner <= 10 && pages > 10) {
            printSum = "Current toner level is: " + toner + " & page count in tray: " + pages + " pages." +"\n" + "You can print maximum " + toner + " pages." + "\n" + "Please add toner.";
        } else if ( pages <= 10 && toner > 10){
            printSum = "Currently available page is: " + pages + " & toner level is: " + toner  +"\n" +"You can print maximum " + pages + " pages." + "\n" + "Please add pages.";
        }else {
            printSum = "Printer summary is- " + "\n" + "Toner level: " + toner + "\n" + "Page count in tray: " + pages + " pages." + "Please add toner & page";
        }
        return printSum;
    }

    // Print pages-

    public String printPages(boolean printSinglePage, int numberOfPages) {

        if (numberOfPages > 0 && numberOfPages < pages && numberOfPages < toner) {

            if (printSinglePage) {
                    pages -= numberOfPages;
                    toner -= numberOfPages;
                    printStatement = "You have successfully printed " + numberOfPages + " pages. ";
                }
                else if (!printSinglePage) {
                    pages = pages - (numberOfPages/2 +1);
                    toner -= numberOfPages;
                    printStatement = "You have successfully printed " + numberOfPages + " pages.";
                }
            }
        else if (numberOfPages < 0){
            printStatement = "System doesn't allow negative input. You have to print minimum one page.";
        } else {
            printStatement= "Can't print "+ numberOfPages +" pages. " + printerSummary();
        }

        return printStatement;
    }

}

