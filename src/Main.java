public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int part1 = 15_000;
        int sum1 = 0;
        int i = 0;
        {
            while (sum1 < 2_459_000) {

                sum1 = sum1 + part1 / 100;
                sum1 = sum1 + part1;
                i += 1;
                System.out.println("Месяц " + i + " сумма накоплений равна " + sum1 + " рублей ");
            }
            //Задание 2
            System.out.println("Задание 2");
            int k = 1;
            while (k <= 10) {
                System.out.print(k++);
            }
            System.out.println();
        }
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        int birth = 17;
        int mortality = 8;
        int population = 12_000_000;
        int dif = birth - mortality;
        for (int t = 1; t <= 10; t++) {
            population += population * dif / 1000;
            System.out.println(population);

            //Задание 4
            System.out.println("Задание 4");
            int part2 = 15_000;
            int sum2 = 0;
            int month = 0;

            while (sum2 <= 12_000_000) {
                sum2 = sum2 + part2 / 100 * 7;
                sum2 += part2;
                month++;
                System.out.println("Месяц " + month + " сумма накоплений равна  " + sum2 + " рублей");
            }
            //Задание 5
            System.out.println("Задание 5");
            int part3 = 15_000;
            int sum3 = 0;
            for (int n = 0; n < 24; n += 6) {
                part3 = part3 + part3 / 100 * 7;
                sum3 += part3 * 6;
                System.out.println(sum3);
            }
            //Задание 6
            System.out.println("Задание 6");
            int part4 = 15_000;
            int sum4 = 0;
            int months = 12 * 9;

            for (int j = 0; j < months; j += 6) {
                part4 = part4 + part4 / 100 * 7;
                sum4 += part4 * 6;

                System.out.println("Сумма накоплений " + sum4 + " каждые полгода");
            }
            //Задание 7
            System.out.println("Задание 7");
            int friday = 5;
            for (int j = 1; j <= 31; j++) {
                if (j == friday) {
                    System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчёт");
                    friday += 7;
                }
                //Задание 8
                System.out.println("Задание 8");
                int year = 0;
                int thePassageOfTheComet = 79;
                int now = 2022;
                int last200Years = now - 200;
                int next100Years = now + 100;
                while(year<next100Years){
                    if(year>last200Years){
                        System.out.println(year);
                    }
                    year += thePassageOfTheComet;
                }
                    }
            //Задание 9
            System.out.println("Задание 9");

            int number = 2;
            int multiplication=0;
            for (int j = 1; j <=10 ; j++) {
                multiplication = number * j;
                System.out.println(number+ "*"+j+"="+multiplication);
            }
                }
            }
        }






