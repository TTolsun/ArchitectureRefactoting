package Ex4c.featureenvy_switchstatements;

public class ModerateRisk implements CalRisk {
    public double calculateRate(double insuranceValue) {
        return insuranceValue * 0.04;
    }
}