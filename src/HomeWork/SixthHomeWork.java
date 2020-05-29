package HomeWork;

public class SixthHomeWork {

        public static void main(String[] args) {

            PrinterTemplateForTest p1 = new PrinterTemplateForTest();

            p1.setName("Printer One");
            System.out.println(p1.getPrinterName());

            p1.addToner(1);
            //p1.addToner(-100);
            //p1.addToner(110);
            //p1.addToner(10);
            //System.out.println(p1.getTonerLevel());
            System.out.println(p1.printerSummary());
            p1.addPages(75);
            p1.addPages(-100);
            p1.addPages(76);
            //System.out.println(p1.pageAvailability());
            System.out.println(p1.printerSummary());
            System.out.println(p1.printPages(true, 10));
            System.out.println(p1.printerSummary());
            System.out.println(p1.printPages(false, 11));
            System.out.println(p1.printerSummary());
            System.out.println(p1.printPages(false, -10));

        }





}






        /**
         * Create a printer
         *
         * max toner level = 100
         * max pages in tray = 100
         * with 1 page printing, 1 toner is being used
         *
         * 1. addToner
         * 2. addPages
         * 3. Print (single and double)
         * 4. PrinterSummary
         *      Toner level:
         *      Pages count in tray:
         * 5. checkToner
         *      if toner is less than 10; it should warn to "Add toner"
         */
        /**
         * maxPages = 100
         * maxToner = 100
         *
         * print 10 - singled sided
         * pages=90
         * toner=90
         *
         * print 9 - double sided
         * pages=85
         * toner=81
         *
         * printSummary()
         * Toner level: 81
         * Pages in tray: 85
         *
         * print 2 - double sided
         * pages=84
         * toner=79
         *
         * printSummary()
         * Toner level: 79
         * Pages in tray: 84
         *
         *
         */




