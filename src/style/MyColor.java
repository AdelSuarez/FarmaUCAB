
package style;
import java.awt.Color;

public class MyColor {
    private final Color WHITE = new Color(225,225,225);
    private final Color REDPRIMARIO = new Color(225,0,0);
    private final Color REDSECUNDARIO = new Color(245,183,177);
    private final Color AZUL = new Color(3, 155, 216);

    public Color getREDSECUNDARIO() {
        return REDSECUNDARIO;
    }

    public Color getRED() {
        return REDPRIMARIO;
    }

    public Color getWHITE() {
        return WHITE;
    }

    public Color getAZUL() {
        return AZUL;
    }

}
