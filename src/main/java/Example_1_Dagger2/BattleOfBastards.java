package Example_1_Dagger2;


import dagger.Component;

/**
 * Created by Hari on 04/11/17.
 */


/**
 * 这个接口会被Dagger去实现。
 * 你加了@Component注解。
 */
@Component
interface BattleComponent {
    War getWar();
}

public class BattleOfBastards {

    public static void main(String[] args){

//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();

    }
}
