package main.java;

import java.io.IOException;

public class ExceptionSpecefic extends IOException {
    public ExceptionSpecefic() {
        super("errorMessage");
    }
}
