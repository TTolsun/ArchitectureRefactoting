package Ex4a.inappropriateintimacy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoristTest {
    @Test
    public void motoristNoPointsLowRisk() {
        assertEquals(RiskFactor.LOW_RISK, createMotoristWithPoints(0).license.getRiskFactor());
    }

    @Test
    public void motorist1To3PointsModerateRisk() {
        assertEquals(RiskFactor.MODERATE_RISK, createMotoristWithPoints(1).license.getRiskFactor());
    }

    @Test
    public void motoristMoreThan3PointsHighRisk() {
        assertEquals(RiskFactor.HIGH_RISK, createMotoristWithPoints(4).license.getRiskFactor());
    }

    public Motorist createMotoristWithPoints(int points) {
        License license = new License();
        license.addPoints(points);
        Motorist motorist = new Motorist(license, "", "", "");
        return motorist;
    }
}
