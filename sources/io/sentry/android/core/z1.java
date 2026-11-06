package io.sentry.android.core;

import io.sentry.f6;
import java.io.File;
import java.util.function.Consumer;
import o.o82;
import o.r82;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a2 a2Var = (a2) obj2;
                File file = (File) obj;
                a2Var.getClass();
                if (file != null && !file.delete()) {
                    a2Var.a.g(f6.WARNING, "Failed to delete late Perfetto trace file %s", file.getPath());
                }
                break;
            default:
                ((r82) obj2).add((o82) obj);
                break;
        }
    }
}
