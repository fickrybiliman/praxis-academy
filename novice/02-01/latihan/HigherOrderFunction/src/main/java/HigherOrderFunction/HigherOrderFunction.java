package HigherOrderFunction;

import HigherOrderFunction.IConfigurator;
import HigherOrderFunction.IProducer;

public class HigherOrderFunction {

   public<T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
      return () -> {
         T instance = producer.produce();
         configurator.configure(instance);
         return instance;
      };
   }
}