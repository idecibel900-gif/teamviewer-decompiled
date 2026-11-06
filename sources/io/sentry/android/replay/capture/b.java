package io.sentry.android.replay.capture;

import java.util.concurrent.atomic.AtomicReference;
import o.fw3;
import o.m36;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m36 {
    public final /* synthetic */ byte m;
    public final AtomicReference n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f142o;
    public final /* synthetic */ d p;

    public b(d dVar, d dVar2, byte b) {
        this.m = b;
        switch (b) {
            case 2:
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(null);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(bool);
                break;
            case 4:
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(null);
                break;
            case 5:
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(null);
                break;
            case 6:
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(null);
                break;
            default:
                this.f142o = dVar;
                this.p = dVar2;
                this.n = new AtomicReference(-1);
                break;
        }
    }

    @Override // o.m36
    public final Object a(Object obj, fw3 fw3Var) {
        byte b = this.m;
        AtomicReference atomicReference = this.n;
        fw3Var.getClass();
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return atomicReference.get();
    }

    public b(Object obj, d dVar, d dVar2) {
        this.m = (byte) 0;
        this.f142o = dVar;
        this.p = dVar2;
        this.n = new AtomicReference(obj);
    }
}
