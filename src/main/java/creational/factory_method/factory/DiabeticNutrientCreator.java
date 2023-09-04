package creational.factory_method.factory;

import creational.factory_method.product.DiabeticNutrientOverview;
import creational.factory_method.product.Overview;

public class DiabeticNutrientCreator extends BaseNutrientOverviewCreator {
    @Override
    public Overview create() {
        return new DiabeticNutrientOverview();
    }
}
