package org.example.primefactors;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Optional;

@RunWith(JUnitQuickcheck.class)
public class PrimeFactorsProperties {
    @Property()
    public void primeFactors(@InRange(minInt = 0) Integer n) throws Exception {

        List<Integer> factors = PrimeFactors.generate(n);

        Optional<Integer> total = factors.stream().reduce((a, b) -> a * b);

        Assert.assertEquals(total.orElse(0), n);

    }
}
