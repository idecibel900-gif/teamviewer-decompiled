package io.sentry.util;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final g b;
    public volatile Object a = null;
    public final a c = new a();

    public h(g gVar) {
        this.b = gVar;
    }

    public final Object a() {
        if (this.a == null) {
            a aVar = this.c;
            aVar.e();
            try {
                if (this.a == null) {
                    this.a = this.b.e();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.a;
    }

    public final void b(Object obj) {
        a aVar = this.c;
        aVar.e();
        try {
            this.a = obj;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
