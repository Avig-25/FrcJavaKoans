package engine.script;

import engine.Locale;
import engine.Localizable;

public final class ScriptRunner {
    /**
     * Executes the given script and return the value generated by the last executed.
     */
    public static Object execute(final Localizable<Type> declaredKoanClass, final Locale locale, final Expression[] script) {
        Object lastCallValue = null;
        final var ctx = new ExecutionContext(declaredKoanClass, locale);

        for(var stmt: script) {
            lastCallValue = stmt.execute(ctx);
        }
        
        return lastCallValue;
    }
}
