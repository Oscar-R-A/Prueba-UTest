package co.com.choucair.test.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")

public class UTestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("botón que nos muestra el formulario del registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
