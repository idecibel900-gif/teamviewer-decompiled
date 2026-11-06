package o;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes2.dex */
public final class g86 extends i86 {
    public final Field a;

    public g86(Field field) {
        this.a = field;
    }

    @Override // o.i86
    public final Member b() {
        return this.a;
    }
}
