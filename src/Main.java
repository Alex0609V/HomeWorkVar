public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1");

        byte potato;
        System.out.println(" potato init ");
        int apples;
        System.out.println("apples init ");
        short carrot;
        System.out.println(" carrot init ");
        long pear;
        System.out.println(" pear init ");
        float tomato;
        System.out.println("tomato init " );
        double cucumber;
        System.out.println("cucumber init " );

        System.out.println(" Задача 2");
        potato = 67;
        System.out.println("potato = " + potato);
        apples = 27897;
        System.out.println("apples = " + apples);
        carrot =569;
        System.out.println("carrot = " +carrot);
        pear = 987678965549L;
        System.out.println("pear = " + pear);
        cucumber = 27.12;
        System.out.println("cucumber = " + cucumber);
        tomato = -159;
        System.out.println("tomato = " + tomato);

        System.out.println(" Задача 3 ");
        byte atLyudmilaStudent = 23;
        short anSergeevnaStudent = 27;
        int ekAndreevnaStudent = 30;
        long sheets = 480L;
        sheets /= atLyudmilaStudent + anSergeevnaStudent + ekAndreevnaStudent;
        System.out.println("На каждого ученика рассчитано … листов бумаги =" + sheets );

        System.out.println(" Задача 4 ");
        int bottleMakingMachinePerformance = 16 / 2;
        int bottleMakingMachinePerformanceTo20Minutes = bottleMakingMachinePerformance * 20;
        int bottleMakingMachinePerformanceOneDay = bottleMakingMachinePerformance * 60 * 24;
        int bottleMakingMachinePerformance3days = bottleMakingMachinePerformanceOneDay * 3;
        int bottleMakingMachinePerformancePerOneMonth = bottleMakingMachinePerformanceOneDay * 31;
        System.out.println("За 20 минут машина произвела  штук бутылок = " + bottleMakingMachinePerformanceTo20Minutes);
        System.out.println("За день машина произвела  штук бутылок = " + bottleMakingMachinePerformanceOneDay);
        System.out.println("За 3 дня  минут машина произвела  штук бутылок = " + bottleMakingMachinePerformance3days);
        System.out.println("За месяц машина произвела  штук бутылок =" + bottleMakingMachinePerformancePerOneMonth);

        System.out.println(" Задача 5");
        int allCanAmount = 120;
        int whiteCanAmountPerClass = 2;
        int brownCanAmountPerClass = 4;
        int amountOfClasses = allCanAmount / (whiteCanAmountPerClass + brownCanAmountPerClass);
        int whiteCanAmount = whiteCanAmountPerClass *  amountOfClasses;
        int brownCanAmout = brownCanAmountPerClass * amountOfClasses;
        System.out.printf(" В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски\r\n",
                amountOfClasses,
                whiteCanAmount,
                brownCanAmout);

        System.out.println(" Задача 6 ");
        int bananaWeight = 5 * 80;
        int milkWeight = 100 * 105;
        int iceMilkWeight = 2 * 100;
        int aggeWeight = 4 * 70;
        int summaryWeight = bananaWeight + milkWeight + iceMilkWeight + aggeWeight;
        double summaryWeightKilogram = summaryWeight / 1000.0;
        System.out.println(" В граммах  вес завтрка  = " + summaryWeight);
        System.out.println("В килограммах вес завтрака = " +summaryWeightKilogram );
        System.out.println(" Задача 7 ");
        int targetWeinghtKilos = 7;
        int targetWeinghtGramm = targetWeinghtKilos * 100;
        double daysDaysAmountWith500 = targetWeinghtGramm / 500.0;
        double dayDaysAmountWith250 = targetWeinghtGramm / 250.0;
        double averageDaysAmout = (daysDaysAmountWith500 + dayDaysAmountWith250) / 2;
        System.out.println("Колличество дней с похудением по 250 грамм =" + dayDaysAmountWith250);
        System.out.println( "Колличество дней с похудением по 500 грамм =" + daysDaysAmountWith500 );
        System.out.println("колличество дней похудением среднее = " +averageDaysAmout);

        System.out.println(" Задача 8 ");
        double silarePercent = 1.1;
        int mashaEmployee = 67760;
        int denisEmployee = 83690;
        int kristinaEmployee = 76230;

        double yerMashaPloyee = mashaEmployee * 12;

        double yerDenisPloyee = denisEmployee * 12;
        double yerKristinaPli = kristinaEmployee * 12;

        double newMashaPloyee = mashaEmployee * silarePercent;
        double newDenisPliyee = denisEmployee * silarePercent;
        double newKristinaPliyee = kristinaEmployee * silarePercent;

        double yerNewMashaPloyee = newMashaPloyee * 12;
        double yerNewDenisPloyee = newDenisPliyee * 12;
        double yerNewKristinaPli = newKristinaPliyee * 12;
        System.out.printf("«Маша теперь получает %s рублей. Годовой доход вырос на %s рублей»%n" ,
                newMashaPloyee ,yerNewMashaPloyee  -  yerMashaPloyee );
        System.out.printf("«Денис теперь получает %s рублей. Годовой доход вырос на %s рублей»%n" , newDenisPliyee,
                yerNewDenisPloyee - yerDenisPloyee );
        System.out.printf("«Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей»%n",yerNewKristinaPli,
                newKristinaPliyee - yerKristinaPli );

    }
}