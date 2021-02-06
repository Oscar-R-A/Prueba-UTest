package co.com.choucair.test.prueba.stepdefinitions;

import co.com.choucair.test.prueba.model.UTestData;
import co.com.choucair.test.prueba.tasks.AboutYourself;
import co.com.choucair.test.prueba.tasks.OpenUp;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage (){
            OnStage.setTheStage(new OnlineCast());
        }

    @Dado("^que Oscar ingresa a la pagina de utest$")
    public void queOscaringresaalapaginadeutest(){
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^Oscar complete el formulario de registro$")
    public void Oscarcompleteelformularioderegistro(List<UTestData> utest)throws Exception{
        AboutYourself.register(utest.get(0).getStrName(),utest.get(0).getStrLastName(),utest.get(0).getStrMail(),
                utest.get(0).getStrMonth(), utest.get(0).getStrDay(), utest.get(0).getStrYear());
    }

    @Entonces("^Oscar puede comprobar la creacion del usuario$")
    public void Oscarpuedecomprobarlacreaciondelusuario (){

    }

}
