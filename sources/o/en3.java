package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class en3 {
    public final la a;
    public final la b;
    public final la c;
    public final ua d;

    public en3(la laVar, la laVar2, la laVar3, ua uaVar) {
        this.a = laVar;
        this.b = laVar2;
        this.c = laVar3;
        this.d = uaVar;
    }

    public final void a(Function0 function0) {
        if (!((Boolean) this.a.a()).booleanValue()) {
            function0.a();
        } else if (((Boolean) this.b.a()).booleanValue()) {
            this.d.invoke(function0);
        } else {
            this.c.a();
            function0.a();
        }
    }
}
