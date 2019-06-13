package Example_1_Dagger2_alt;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 15/11/17.
 */
@Module//目的在于，提供不能修改源码的对象，无法在构造添加@Inject注解的替代方案。
public class BraavosModule {

    Cash cash;

    Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers){
        this.cash=cash;
        this.soldiers=soldiers;
    }

    @Provides
    Cash provideCash(){
        return cash;
    }

    @Provides
    Soldiers provideSoldiers(){
        return soldiers;
    }

}
