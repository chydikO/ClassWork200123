package org.classwork;

/**
 * Зробити класи, що представлені на діаграмі
 * В конструктори класів Magazine та Newspaper передати назву журналу або газети
 * В методах printXXX() необхідно надрукувати в консоль повідомлення "Reading {назва журналу або газети}"
 * В методі main() створити масив публікацій (4-5 елементів)
 * Cтворити статичний метод readAllMagazines(), що приймає масив публікацій і викликає метод readMagazine() виключно для журналів
 * Cтворити статичний метод readAllNewspapers(), що приймає масив публікацій і викликає метод readNewspaper() виключно для газет
 */
public class App {

    public static void main( String[] args ) {
        Publication[] publications = new Publication[4];

        publications[0] = new Magazine("Radio");
        publications[1] = new Magazine("Maxim");
        publications[2] = new NewsPaper("USA Today NewsPaper");
        publications[3] = new NewsPaper("CNN NewsPaper");


        readAllMagazines(publications);
        System.out.println("-".repeat(20));
        readAllNewspapers(publications);
        
    }

    private static void readAllNewspapers(Publication[] publications) {
        for (Publication publication: publications) {
            if (publication instanceof NewsPaper) {
                ((NewsPaper) publication).readNewsPaper();
            }
        }
    }

    private static void readAllMagazines(Publication[] publications) {
        for (Publication publication: publications) {
            if (publication instanceof Magazine) {
                ((Magazine) publication).readMagazine();
            }
        }
    }
}
