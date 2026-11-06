package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface fo4 extends bm3 {
    eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2);

    default eo4 u(int i, int i2, Map map, Function1 function1) {
        return o0(i, i2, map, null, function1);
    }
}
