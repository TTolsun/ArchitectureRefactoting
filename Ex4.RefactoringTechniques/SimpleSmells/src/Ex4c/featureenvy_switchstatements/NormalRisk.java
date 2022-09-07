package Ex4c.featureenvy_switchstatements;

public class NormalRisk implements CalRisk {
    public double calculateRate(double insuranceValue) {
        return insuranceValue * 0.06;
    }
}