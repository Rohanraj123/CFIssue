package org.example;

import org.checkerframework.common.value.qual.ArrayLen;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    private static final @ArrayLen(0) Configuration[] EMPTY = new Configuration[0];
    private final List<Configuration> children = new ArrayList<>();
    public Configuration[] getChildren() {
        return children.toArray(EMPTY);
    }
}
