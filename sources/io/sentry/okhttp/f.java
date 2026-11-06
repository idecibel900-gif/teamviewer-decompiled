package io.sentry.okhttp;

import io.sentry.a8;
import io.sentry.d5;
import io.sentry.h;
import io.sentry.l5;
import io.sentry.v1;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.a46;
import o.ab6;
import o.ae2;
import o.b46;
import o.h93;
import o.lc6;
import o.mm8;
import o.s43;
import o.yw5;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ae2 {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final b b;
    public final ConcurrentHashMap c;

    public f(mm8 mm8Var) {
        mm8Var.getClass();
        this.b = new b(mm8Var, (byte) 0);
        this.c = new ConcurrentHashMap();
    }

    public static boolean C(ae2 ae2Var) {
        if (ae2Var instanceof f) {
            return false;
        }
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(ae2Var != null ? ae2Var.getClass().getName() : null);
    }

    @Override // o.ae2
    public final void A(a46 a46Var, s43 s43Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.A(a46Var, s43Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // o.ae2
    public final void B(a46 a46Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.B(a46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connect.secure_connect_ms");
        }
    }

    @Override // o.ae2
    public final void a(a46 a46Var, lc6 lc6Var) {
        lc6Var.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.a(a46Var, lc6Var);
        }
    }

    @Override // o.ae2
    public final void b(a46 a46Var, lc6 lc6Var) {
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.b(a46Var, lc6Var);
        }
    }

    @Override // o.ae2
    public final void c(a46 a46Var) {
        ae2 ae2Var = (ae2) this.c.remove(a46Var);
        if (ae2Var != null) {
            ae2Var.c(a46Var);
        }
        a aVar = (a) d.remove(a46Var);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // o.ae2
    public final void d(a46 a46Var, IOException iOException) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.remove(a46Var);
        if (ae2Var != null) {
            ae2Var.d(a46Var, iOException);
        }
        if (C(ae2Var) && (aVar = (a) d.remove(a46Var)) != null) {
            aVar.d(iOException.getMessage());
            aVar.a(new c(iOException, (byte) 0));
        }
    }

    @Override // o.ae2
    public final void e(a46 a46Var) {
        ae2 ae2Var = (ae2) this.b.invoke(a46Var);
        this.c.put(a46Var, ae2Var);
        ae2Var.e(a46Var);
        if (C(ae2Var)) {
            d.put(a46Var, new a(a46Var.n));
        }
    }

    @Override // o.ae2
    public final void f(a46 a46Var) {
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var == null) {
            ae2Var = null;
        }
        if (ae2Var != null) {
            ae2Var.f(a46Var);
        }
    }

    @Override // o.ae2
    public final void g(a46 a46Var, InetSocketAddress inetSocketAddress, Proxy proxy, yw5 yw5Var) {
        a aVar;
        inetSocketAddress.getClass();
        proxy.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.g(a46Var, inetSocketAddress, proxy, yw5Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            String strName = yw5Var != null ? yw5Var.name() : null;
            if (strName != null) {
                aVar.c.d(strName, "protocol");
                v1 v1Var = aVar.d;
                if (v1Var != null) {
                    v1Var.m(strName, "protocol");
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // o.ae2
    public final void h(a46 a46Var, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        a aVar;
        inetSocketAddress.getClass();
        proxy.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.h(a46Var, inetSocketAddress, proxy, iOException);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.d(iOException.getMessage());
            v1 v1Var = aVar.d;
            l5 l5Var = (l5) aVar.b.remove("http.connect_ms");
            if (l5Var == null || v1Var == null) {
                return;
            }
            v1Var.g(iOException);
            v1Var.a(a8.INTERNAL_ERROR);
            v1Var.m(Long.valueOf(d5.c().l().getDateProvider().a().b(l5Var) / 1000000), "http.connect_ms");
        }
    }

    @Override // o.ae2
    public final void i(a46 a46Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a aVar;
        inetSocketAddress.getClass();
        proxy.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.i(a46Var, inetSocketAddress, proxy);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connect_ms");
        }
    }

    @Override // o.ae2
    public final void j(a46 a46Var, b46 b46Var) {
        a aVar;
        b46Var.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.j(a46Var, b46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connection_ms");
        }
    }

    @Override // o.ae2
    public final void k(a46 a46Var, b46 b46Var) {
        a aVar;
        b46Var.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.k(a46Var, b46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // o.ae2
    public final void l(a46 a46Var, String str, ArrayList arrayList) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.l(a46Var, str, arrayList);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.client.resolve_dns_ms", new io.sentry.android.replay.capture.f(str, arrayList, (byte) 2));
        }
    }

    @Override // o.ae2
    public final void m(a46 a46Var, String str) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.m(a46Var, str);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.client.resolve_dns_ms");
        }
    }

    @Override // o.ae2
    public final void n(a46 a46Var, h93 h93Var, List list) {
        a aVar;
        list.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.n(a46Var, h93Var, list);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.client.proxy_select_ms", new b(list, (byte) 1));
        }
    }

    @Override // o.ae2
    public final void o(a46 a46Var, h93 h93Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.o(a46Var, h93Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.client.proxy_select_ms");
        }
    }

    @Override // o.ae2
    public final void p(a46 a46Var, long j) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.p(a46Var, j);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.connection.request_body_ms", new e(j, (byte) 0));
            if (j > -1) {
                aVar.c.d(Long.valueOf(j), "request_content_length");
                v1 v1Var = aVar.d;
                if (v1Var != null) {
                    v1Var.m(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // o.ae2
    public final void q(a46 a46Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.q(a46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connection.request_body_ms");
        }
    }

    @Override // o.ae2
    public final void r(a46 a46Var, IOException iOException) {
        a aVar;
        iOException.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.r(a46Var, iOException);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.request_headers_ms", new c(iOException, (byte) 1));
            v1 v1Var = aVar.d;
            l5 l5Var = (l5) aVar.b.remove("http.connection.request_body_ms");
            if (l5Var == null || v1Var == null) {
                return;
            }
            v1Var.a(a8.INTERNAL_ERROR);
            v1Var.g(iOException);
            v1Var.m(Long.valueOf(d5.c().l().getDateProvider().a().b(l5Var) / 1000000), "http.connection.request_body_ms");
        }
    }

    @Override // o.ae2
    public final void s(a46 a46Var, ab6 ab6Var) {
        a aVar;
        ab6Var.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.s(a46Var, ab6Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // o.ae2
    public final void t(a46 a46Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.t(a46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connection.request_headers_ms");
        }
    }

    @Override // o.ae2
    public final void u(a46 a46Var, long j) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.u(a46Var, j);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            if (j > -1) {
                aVar.c.d(Long.valueOf(j), "response_content_length");
                v1 v1Var = aVar.d;
                if (v1Var != null) {
                    v1Var.m(Long.valueOf(j), "http.response_content_length");
                }
            }
            aVar.b("http.connection.response_body_ms", new e(j, (byte) 1));
        }
    }

    @Override // o.ae2
    public final void v(a46 a46Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.v(a46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connection.response_body_ms");
        }
    }

    @Override // o.ae2
    public final void w(a46 a46Var, IOException iOException) {
        a aVar;
        iOException.getClass();
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.w(a46Var, iOException);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.response_headers_ms", new c(iOException, (byte) 2));
            v1 v1Var = aVar.d;
            l5 l5Var = (l5) aVar.b.remove("http.connection.response_body_ms");
            if (l5Var == null || v1Var == null) {
                return;
            }
            v1Var.a(a8.INTERNAL_ERROR);
            v1Var.g(iOException);
            v1Var.m(Long.valueOf(d5.c().l().getDateProvider().a().b(l5Var) / 1000000), "http.connection.response_body_ms");
        }
    }

    @Override // o.ae2
    public final void x(a46 a46Var, lc6 lc6Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.x(a46Var, lc6Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.e = lc6Var;
            h hVar = aVar.c;
            yw5 yw5Var = lc6Var.n;
            hVar.d(yw5Var.name(), "protocol");
            int i = lc6Var.p;
            hVar.d(Integer.valueOf(i), "status_code");
            v1 v1Var = aVar.d;
            if (v1Var != null) {
                v1Var.m(yw5Var.name(), "protocol");
            }
            if (v1Var != null) {
                v1Var.m(Integer.valueOf(i), "http.response.status_code");
            }
            aVar.b("http.connection.response_headers_ms", new b(lc6Var, (byte) 2));
        }
    }

    @Override // o.ae2
    public final void y(a46 a46Var) {
        a aVar;
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.y(a46Var);
        }
        if (C(ae2Var) && (aVar = (a) d.get(a46Var)) != null) {
            aVar.c("http.connection.response_headers_ms");
        }
    }

    @Override // o.ae2
    public final void z(a46 a46Var, lc6 lc6Var) {
        ae2 ae2Var = (ae2) this.c.get(a46Var);
        if (ae2Var != null) {
            ae2Var.z(a46Var, lc6Var);
        }
    }
}
