package o;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class qf2 extends LiveData {
    public final Function0 a;

    public qf2(Function0 function0) {
        this.a = function0;
        setValue(function0.a());
    }
}
