package futest.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 羊 on 2019/4/28.
 */
public interface Factory<T> {
    T create();
}
//过滤器
class Filter extends Part {}
//具体的过滤器 继承自过滤器
class FuelFilter extends Filter {
    public static class Factory implements futest.factory.Factory<FuelFilter> {
        public FuelFilter create() {
            System.out.println("FuelFilter= = = = = =");
            return new FuelFilter();
        }
    }
}
class AirFilter extends Filter {
    public static class Factory implements futest.factory.Factory<AirFilter> {
        public AirFilter create() {
            System.out.println("AirFilter= = = = = =");
            return new AirFilter();
        }
    }
}
//响铃 下面的类为具体的响铃
class Belt extends Part {}
class FanBelt extends Belt {
    public static class Factory implements futest.factory.Factory<FanBelt> {
        public FanBelt create() {
            System.out.println("FanBelt= = = = = =");
            return new FanBelt();
        }
    }
}
class GeneratorBelt extends Belt {
    public static class Factory implements futest.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            System.out.println("GeneratorBelt= = = = = =");
            return new GeneratorBelt();
        }
    }
}
class Part {
    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new FanBelt.Factory());
//        partFactories.add(new PowerSteeringBelt.Factory());
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
    public String toString() {
        return getClass().getSimpleName();
    }
}