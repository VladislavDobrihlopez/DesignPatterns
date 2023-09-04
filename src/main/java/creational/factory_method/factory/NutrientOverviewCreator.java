package creational.factory_method.factory;

import creational.factory_method.product.NutrientOverview;
import creational.factory_method.product.Overview;

public class NutrientOverviewCreator extends BaseNutrientOverviewCreator {
    @Override
    public Overview create() {
        return new NutrientOverview();
    }
}
