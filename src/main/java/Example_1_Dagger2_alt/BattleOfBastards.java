package Example_1_Dagger2_alt;


import Example_1_Dagger2_alt.DaggerBattleComponent;
import dagger.Component;

/**
 * Created by Hari on 04/11/17.
 */

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldiers getSoldiers();
}

public class BattleOfBastards {

    public static void main(String[] args){

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent component = DaggerBattleComponent.builder().braavosModule(new BraavosModule(cash,soldiers)).build();//这样构造一次，应用生命周期内其他地方也可以用。
        War war = component.getWar();
        war.prepare();
        war.report();

        component.getCash();
        component.getSoldiers();

    }
}
