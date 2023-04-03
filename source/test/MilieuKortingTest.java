
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MilieuKortingTest {
    @Test
    public void constructionTest(){
        MilieuKorting milieu = new MilieuKorting(10);
        assertEquals(10, milieu.getKortingsPercentage());
        MilieuKorting milieu2 = new MilieuKorting(12,"Korting");
        assertEquals(12,milieu2.getKortingsPercentage());
        assertEquals("Korting", milieu2.getBeschrijving());
    }

    @Test
    public void setAndGetTest(){
        MilieuKorting milieu = new MilieuKorting(12,"Korting");
        assertEquals(12,milieu.getKortingsPercentage());
        assertEquals("Korting", milieu.getBeschrijving());
        milieu.setBeschrijving("Nieuwe Korting");
        milieu.setKortingsPercentage(200);
        assertEquals(200, milieu.getKortingsPercentage());
        assertEquals("Nieuwe Korting", milieu.getBeschrijving());

    }
}
