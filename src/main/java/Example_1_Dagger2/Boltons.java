package Example_1_Dagger2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

/**
 * Created by Hari on 04/11/17.
 */
public class Boltons implements House {

   @Inject    //we need to tell Dagger 2 that these are the dependencies that need to be injected
   public Boltons(){

    }

    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
