package java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorTest {

    public static void main(String[] args) {
        RandomGenerator generator = RandomGeneratorFactory.all()
                .filter(RandomGeneratorFactory::isJumpable)
                .filter(factory -> factory.stateBits() > 128)
                .findAny()
                .map(RandomGeneratorFactory::create)
//  if you need a `JumpableGenerator`:
//  .map(JumpableGenerator.class::cast)
                .orElseThrow();

        System.out.println(generator.nextInt());
    }
}
