package adexrepo.springbasic.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {

    private Foo foo;
    private Bar bar;

    void Foobar(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

}
