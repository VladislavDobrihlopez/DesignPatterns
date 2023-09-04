package creational.factory_method;

import creational.factory_method.factory.BaseNutrientOverviewCreator;
import creational.factory_method.factory.DiabeticNutrientCreator;
import creational.factory_method.factory.NutrientOverviewCreator;
import creational.factory_method.product.Overview;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int mode = random.nextInt(2);
            BaseNutrientOverviewCreator creator = null;

            switch (mode) {
                case 0:
                    creator = new DiabeticNutrientCreator();
                    break;
                case 1:
                    creator = new NutrientOverviewCreator();
                    break;
            }

            composableScreen(creator);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void composableScreen(BaseNutrientOverviewCreator creator) {
        Overview overview = creator.create();
        overview.invoke();
    }
}
